package deeptibhatia.re

import java.util.regex.{Matcher, Pattern}

case class FooBarCar(foo: Int, bar: Int, car: Int) {
  override def toString: String = (s" $foo, $bar, $car")
}

case class NumValues(num: String, values: String) {
  override def toString: String = (s"$num, $values")
}

/* Extract count of foo, bar, and car from String of format "four/values: 100 foo, 200 bar, 300 moo, 400 car"
   Any of these values is optional, but the ordering is always maintained
 */
object PatternMatching {

  def getFooBarCarPattern(s: String) = Pattern.compile(s".* ([0-9]+) $s.*")
  lazy val numValuesPattern = Pattern.compile("(^[a-zA-Z]+)/([a-zA-Z]+): .*")

  lazy val foo = getFooBarCarPattern("foo")
  lazy val bar = getFooBarCarPattern("bar")
  lazy val car = getFooBarCarPattern("car")

  def extract(data: List[String]): List[(NumValues, FooBarCar)] = extractNumValues(data).zip(extractNumFooBarCar(data))

  def extract(data: String): (NumValues, FooBarCar) = (extractNumValues(data), (extractNumFooBarCar(data)))

  def extractNumFooBarCar(data: List[String]): List[FooBarCar] =
    data map extractNumFooBarCar

  def extractNumValues(data: List[String]): List[NumValues] =
    data map extractNumValues

  def extractNumValues(s: String) = {
    val m = numValuesPattern.matcher(s)
    if (m.find()) NumValues(m.group(1), m.group(2)) else NumValues("", "")
  }

  def extractNumFooBarCar(s: String): FooBarCar = {

    def get(p: Pattern) = getOrElse(p, 0)

    def getOrElse(p: Pattern, default: Int): Int = {
      val m: Matcher = p.matcher(s)
      if (m.find()) m.group(1).toInt else default
    }

    FooBarCar(get(foo), get(bar), get(car))

  }
}

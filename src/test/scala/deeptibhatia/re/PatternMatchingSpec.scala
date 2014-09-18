package deeptibhatia.re

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PatternMatchingSpec extends Specification {

  "test different scenarios" ! testDataExtraction

  "test single data" ! testSingleDataExtraction

  def testDataExtraction = {
    val data = List(
      "all/values: 100 foo, 200 bar, 300 moo, 400 car",
      "one/value: 100 foo",
      "two/values: 100 foo, 400 car",
      "two/values: 100 foo, 200 bar",
      "three/values: 100 foo, 200 bar, 400 car",
      "zero/values: ",
      "one/value: 200 bar",
      "one/value: 400 car"
    )

    val actual = PatternMatching.extract(data)
    actual mustEqual List(
        (NumValues("all","values"),FooBarCar(100, 200, 400)),
        (NumValues("one","value"),FooBarCar(100, 0, 0)),
        (NumValues("two","values"),FooBarCar(100, 0, 400)),
        (NumValues("two","values"),FooBarCar(100, 200, 0)),
        (NumValues("three","values"),FooBarCar(100, 200, 400)),
        (NumValues("zero","values"),FooBarCar(0, 0, 0)),
        (NumValues("one","value"),FooBarCar(0, 200, 0)),
        (NumValues("one","value"),FooBarCar(0, 0, 400))
      )

    actual.map(x => (x._1.toString(), x._2.toString)) mustEqual List(
      ("all, values"," 100, 200, 400"),
      ("one, value"," 100, 0, 0"),
      ("two, values"," 100, 0, 400"),
      ("two, values"," 100, 200, 0"),
      ("three, values"," 100, 200, 400"),
      ("zero, values"," 0, 0, 0"),
      ("one, value"," 0, 200, 0"),
      ("one, value"," 0, 0, 400")
    )
  }

  def testSingleDataExtraction = {
    val data =
      "all/values: 100 foo, 200 bar, 300 moo, 400 car"

    PatternMatching.extract(data) mustEqual (
      NumValues("all","values"),FooBarCar(100, 200, 400)
    )
  }

}

package deeptibhatia.euler

import deeptibhatia.euler.math.Fibonacci


object Project02 extends App {

  val limit = 4000000

  lazy val fib = Fibonacci.fibonacciStream
  lazy val evenFib = fib.filter(x => (x %2 == 0))
  lazy val fibLessThanLimit = evenFib.takeWhile(_ < limit)

  println(fibLessThanLimit.foldLeft(0L)(_+_))


}

package deeptibhatia.euler.math

/**
 * Created by dbhatia on 6/28/14.
 */
object Fibonacci {

  def fibonacciStream: Stream[Long] = {
    def fibrec(prev: Long, cur: Long): Stream[Long] = {
      val next = prev + cur
      prev  #::  fibrec(cur, next)
    }
    fibrec(0, 1)
  }

}

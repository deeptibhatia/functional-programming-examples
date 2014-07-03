package deeptibhatia.math

/**
 * Created by dbhatia on 7/3/14.
 */
object Factors {

  def isFactor(n: Int, factor: Int) =  (factor > 0) && (n % factor == 0)

  def getNthLargestFactor(n: Int) = {
    lazy val ps: Stream[Int] = Stream.range(n/2,2,-1).filter(i =>
      isFactor(n,i) )
    ps
  }
}

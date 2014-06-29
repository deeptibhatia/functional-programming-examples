package deeptibhatia.euler

import deeptibhatia.euler.math.LocalMath

/**
 * Created by dbhatia on 6/28/14.
 */
object Project01 extends App {

  println (this(1000))

  def apply(n: Int ): Long = {
    val multiples = ( 3 to n-1 ) filter (n => (n % 3 == 0) || (n % 5 ==0 ))
    LocalMath.sum(multiples)
  }


}

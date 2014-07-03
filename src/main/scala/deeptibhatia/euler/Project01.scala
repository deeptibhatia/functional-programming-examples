package deeptibhatia.euler

import deeptibhatia.math.{Fibonacci, LocalMath}

object Project01  {

  def sumMultiples3_and_5(n: Int ): Long = {
    val multiples = ( 3 to n-1 ) filter (n => (n % 3 == 0) || (n % 5 ==0 ))
    LocalMath.sum(multiples)
  }


}

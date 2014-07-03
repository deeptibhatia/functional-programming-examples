package deeptibhatia.math

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PrimesSpec extends Specification {

  "testIsPrime" ! {
    Primes.isPrime(2) mustEqual true
    Primes.isPrime(3) mustEqual true
    Primes.isPrime(5) mustEqual true
    Primes.isPrime(239) mustEqual true
  }

  "testIsPrimeFalse" !  {
    Primes.isPrime(4) mustEqual false
    Primes.isPrime(81) mustEqual false
    Primes.isPrime(444444444) mustEqual false
  }

   "test prime factors" ! {
    Primes.getPrimeFactors(100).toList mustEqual  List(2,5)
    Primes.getPrimeFactors(100000).toList mustEqual  List(2,5)
    Primes.getPrimeFactors(27).toList mustEqual  List(3)
    Primes.getPrimeFactors(210).toList mustEqual  List(2,3,5,7)
  }


  "testLargestPrimeFactor" ! {
    // test the first one
    Primes.getNthLargestPrimeFactor(210).take(1).head mustEqual(7)

    }

  "test 3rd largest prime factor " ! {
      Primes.getNthLargestPrimeFactor(210).take(3).toList.last mustEqual(3)
  }

  "get 4th largest prime factor when there are only 3" ! {
    // There are only 3 prime factors so taking 4 should still give us a length of 3
    Primes.getNthLargestPrimeFactor(210).take(4).toList.length mustEqual(3)

  }


  "testNthPrime" ! {
    Primes.getNthPrime.take(1).head mustEqual(2)
    Primes.getNthPrime.take(4).toList.last mustEqual(7)

  }

}

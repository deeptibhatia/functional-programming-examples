package deeptibhatia.math

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PrimesSpec extends Specification {

//  "testIsPrime" ! testIsPrime
//  "testIsPrimeFalse" ! testIsPrimeFalse
//  "testPrimeFactors" ! testPrimeFactors
//  "testLargestPrimeFactor" ! testLargestPrimeFactor
  "testLargestFactor" ! testLargestFactor
  "testNthPrime" ! testNthPrime

  def testIsPrime = {
    Primes.isPrime(2) mustEqual true
    Primes.isPrime(3) mustEqual true
    Primes.isPrime(5) mustEqual true
    Primes.isPrime(239) mustEqual true
  }

  def testIsPrimeFalse = {
    Primes.isPrime(4) mustEqual false
    Primes.isPrime(81) mustEqual false
    Primes.isPrime(444444444) mustEqual false
  }

  def testPrimeFactors = {
    Primes.getPrimeFactors(100).toList mustEqual  List(2,5)
    Primes.getPrimeFactors(100000).toList mustEqual  List(2,5)
    Primes.getPrimeFactors(27).toList mustEqual  List(3)
    Primes.getPrimeFactors(210).toList mustEqual  List(2,3,5,7)
  }


  def testLargestPrimeFactor = {
    println(Primes.getNthLargestPrimeFactor(210))

    Primes.getNthLargestPrimeFactor(210).take(1).head mustEqual(7)
    //Primes.getNthLargestPrimeFactor(210).take(3).head mustEqual(3)
  }


  def testLargestFactor = {
    println(Primes.getNthLargestFactor(210))

    Primes.getNthLargestFactor(210).take(1).head mustEqual(105)
    //Primes.getNthLargestPrimeFactor(210).take(3).head mustEqual(3)
  }


  def testNthPrime = {
    Primes.getNthPrime.take(1).head mustEqual(2)

    Primes.getNthPrime.take(2).toList.last mustEqual(3)

    Primes.getNthPrime.take(4).toList.last mustEqual(7)

  }

}

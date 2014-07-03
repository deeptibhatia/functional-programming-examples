package deeptibhatia.math


object Primes {

  def isPrime(n:Int) = {
   // (2 to math.abs(n/2)).foldLeft(true)((r,c) => r && (n %c !=0))
    (2 to math.sqrt(n).toInt)forall(n % _ != 0)
  }

  def getAllPrimesLessThanN(n: Int) = {
    (2 to n).filter(isPrime(_))
  }

  def getPrimeFactors(n: Int) = {
    val primes = getAllPrimesLessThanN(n/2)
    primes.filter( isFactor(n, _))
  }

  def getNthPrime: Stream[Int] = {
    lazy val ps: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
      ps.takeWhile{j => j * j <= i}.forall{ i % _ > 0})
    ps
   }

  def getNthLargestPrimeFactor(n: Int) = {
    lazy val ps: Stream[Int] = (n/2 until 2).toStream.filter(i =>
      isFactor(n,i) && isPrime(i))
    ps
  }

  private def isFactor(n: Int, factor: Int) =  (n % factor == 0)

  def getNthLargestFactor(n: Int) = {
    lazy val ps: Stream[Int] = (n/2 until 2).toStream.filter(i =>
      isFactor(n,i) )
    ps
  }

}



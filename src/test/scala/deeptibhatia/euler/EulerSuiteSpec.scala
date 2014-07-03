package deeptibhatia.euler


import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class EulerSuiteSpec extends Specification {

  "testProject01" ! testProject01
  "testProject02" ! testProject02

  def testProject01 = {
    Project01.sumMultiples3_and_5(1000) mustEqual (233168)
  }

  def testProject02 = {
    Project02.sumFibonacciLessThanLimit(4000000) mustEqual (4613732)
  }



}

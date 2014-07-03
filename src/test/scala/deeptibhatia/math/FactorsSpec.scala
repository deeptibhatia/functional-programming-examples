package deeptibhatia.math

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FactorsSpec extends Specification {

  "test is factor" ! {
    Factors.isFactor(210,5)  mustEqual true
  }

  "testLargestFactor" ! {
    Factors.getNthLargestFactor(210).take(1).head mustEqual(105)
    Factors.getNthLargestFactor(210).take(3).toList.last mustEqual(42)
  }

  "get 15th largest factor when there are only 13" ! {
    Factors.getNthLargestFactor(210).take(15).toList.length mustEqual(13)
  }

}

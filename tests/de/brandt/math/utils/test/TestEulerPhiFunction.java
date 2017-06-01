
package de.brandt.math.utils.test;

import de.brandt.math.utils.Utils;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * All tests of the Euler phi-function.
 * @author Jan Brandt
 *
 */
public class TestEulerPhiFunction {

  /**
   *  Test for valid solutions of the phi-function with prime inputs.
   */
  @Test
  public void testEulerPhiFunctionWithPrimes() {
    assertEquals("Phi(2) = 1.", 1, Utils.eulerPhiFunction(2));
    assertEquals("Phi(3) = 2.", 2, Utils.eulerPhiFunction(3));
    assertEquals("Phi(11) = 10.", 10, Utils.eulerPhiFunction(11));
    assertEquals("Phi(2089) = 2088.", 2088, Utils.eulerPhiFunction(2089));
    assertEquals("Phi(104395301) = 104395300.",
        104395300, Utils.eulerPhiFunction(104395301));
  }

  /**
   *  Test for valid solutions of the phi-function with non-prime inputs.
   */
  @Test
  public void testEulerPhiFunction() {
    assertEquals("Phi(1) = 1.", 1, Utils.eulerPhiFunction(1));
    assertEquals("Phi(4) = 2.", 2, Utils.eulerPhiFunction(4));
    assertEquals("Phi(6) = 2.", 2, Utils.eulerPhiFunction(6));
  }


}

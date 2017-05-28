
package de.brandt.math.utils.test;

import de.brandt.math.utils.Utils;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.BeforeClass;

/**
 * All tests of the Euler phi-function.
 * @author Jan Brandt
 *
 */
public class TestEulerPhiFunction {
  private static Utils util;

  @BeforeClass
  public static void setUpBeforeClass() {
    util = new Utils();
  }

  /**
   *  Test for valid solutions of the phi-function with prime inputs.
   */
  @Test
  public void testEulerPhiFunctionWithPrimes() {
    assertEquals("Phi(2) = 1.", 1, util.eulerPhiFunction(2));
    assertEquals("Phi(3) = 2.", 2, util.eulerPhiFunction(3));
    assertEquals("Phi(11) = 10.", 10, util.eulerPhiFunction(11));
    assertEquals("Phi(2089) = 2088.", 2088, util.eulerPhiFunction(2089));
  }

  /**
   *  Test for valid solutions of the phi-function with non-prime inputs.
   */
  @Test
  public void testEulerPhiFunction() {
    assertEquals("Phi(1) = 1.", 1, util.eulerPhiFunction(1));
    assertEquals("Phi(4) = 2.", 2, util.eulerPhiFunction(4));
    assertEquals("Phi(6) = 2.", 2, util.eulerPhiFunction(6));
  }


}

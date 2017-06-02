package de.brandt.math.utils.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.brandt.math.utils.Utils;

/**
 * All tests for the gcd-function.
 * @author Jan Brandt
 *
 */
public class Testgcd {


  /**
   * Test gcd (positive inputs with gcd = 1).
   */
  @Test
  public void testGcdPrimeInputs() {
    assertEquals("gcd(3,2) = 1", 1, Utils.gcd(3, 2));
    assertEquals("gcd(9,17) = 1", 1, Utils.gcd(9, 17));
  }


  /**
   * Test gcd (positive inputs with gcd > 1).
   */
  @Test
  public void testGcdNonPrimeInputs() {
    assertEquals("gcd(4,2) = 2", 2, Utils.gcd(4, 2));
    assertEquals("gcd(16,4) = 4", 4, Utils.gcd(4, 16));
  }

  /**
   * Test gcd (negative input).
   */
  @Test
  public void testGcdWithNegatives() {
    assertEquals("gcd(4,-2) = 2", 2, Utils.gcd(4, -2));
    assertEquals("gcd(-7,5) = 1", 1, Utils.gcd(-7, 5));
  }

}

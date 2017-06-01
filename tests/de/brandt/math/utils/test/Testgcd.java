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
   * Test gcd (inputs with gcd > 1).
   */
  @Test
  public void testGcd() {
    assertEquals("gcd(4,2) = 2", 2, Utils.gcd(4, 2));
    assertEquals("gcd(16,4) = 4", 4, Utils.gcd(4, 16));
  }

}

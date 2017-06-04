package de.brandt.math.utils.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.brandt.math.utils.Utils;

/**
 * @author Jan Brandt
 *
 */
public class TestIsPrime {

  /**
   * Test method for isPrime(n). Test with primes.
   */
  @Test
  public void testIsPrime() {
    assertTrue("2 is prime", Utils.isPrime(2));
    assertTrue("3 is prime", Utils.isPrime(3));
    assertTrue("5 is prime", Utils.isPrime(5));
    assertTrue("314,606,869 is prime", Utils.isPrime(314606869));
    assertTrue("982,451,653 is prime", Utils.isPrime(982451653));
  }

  /**
   * Test method for isPrime(n). Test with non-primes.
   */
  @Test
  public void testIsPrimeWithNonPrimes() {
    assertFalse("4 is not prime", Utils.isPrime(4));
    assertFalse("1000 is not prime", Utils.isPrime(1000));
    assertFalse("961,748,943 is not prime", Utils.isPrime(961748943));
  }

}

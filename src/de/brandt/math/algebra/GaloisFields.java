
package de.brandt.math.algebra;

import de.brandt.math.utils.Utils;

/**
 * @author Jan Brandt
 *
 */
public class GaloisFields {

  /**
   * Constructs a new Galoisfield GF(p^n).
   * Checks for valid parameters first.
   * @param p A prime number
   * @param n A positive integer
   */
  public GaloisFields(final int p, final int n) {
    if (p < 1 || n < 1) {
      throw new IllegalArgumentException("Parameters are not positive");
    }
    if (!Utils.isPrime(p)) {
      throw new IllegalArgumentException("p is not prime");
    }
  }

}

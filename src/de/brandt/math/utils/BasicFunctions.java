
package de.brandt.math.utils;

/**
 * @author Jan Brandt
 */
public final class BasicFunctions {

  /**
   * Computes the number of integers that are prime to the given number n.
   *
   * @param n A number > 0
   * @return The number of integers that are prime to n
   */
  public int eulerPhiFunction(final int n) {
    int number = 0;
    for (int i = 0; i < n; i++) {
      if (gcd(n, i) == 1) {
        number++;
      }
    }
    return number;
  }

  /**
   * Computes the greatest common divider of a and b.
   *
   * @param a First number
   * @param b Second number
   * @return The gcd
   */
  private int gcd(final int a, final int b) {
    // TODO Auto-generated method stub
    return 0;
  }

}

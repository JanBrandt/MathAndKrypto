
package de.brandt.math.utils;

/**
 * @author Jan Brandt
 */
public final class Utils {

  /**
   * Private constructor to prevent user to initiate.
   */
  private Utils() {
  }

  /**
   * Computes the number of integers that are prime to the given number n.
   *
   * @param n A number > 0
   * @return The number of integers that are prime to n
   */
  public static int eulerPhiFunction(final int n) {
    int number = 1;
    for (int i = 2; i < n; i++) {
      if (gcd(n, i) == 1) {
        number++;
      }
    }
    return number;
  }

  /**
   * Computes the greatest common divider of a and b by using
   * the euclidian algorithm.
   *
   * @param a First number
   * @param b Second number
   * @return The gcd
   */
  public static int gcd(final int a, final int b) {
    if (a == 0 || b == 0) {
      return 1;
    }
    int fir = Math.abs(a);
    int sec = Math.abs(b);
    if (fir > sec) {
      int rest = fir % sec;
      return gcdWithPrec(sec, rest);
    } else {
      int rest = sec % fir;
      return gcdWithPrec(fir, rest);
    }
  }

  private static int gcdWithPrec(final int a, final int b) {
    if (a == 0 || b == 0) {
      return a + b;
    } else {
      return gcdWithPrec(b, a % b);
    }
  }

}

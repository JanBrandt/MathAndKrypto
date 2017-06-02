
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
    if (isPrime(n)) {
      return n - 1;
    }
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
   * the euclidian algorithm. Does some pre-checks and uses then the function
   * gcdWithPrec.
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

  /**
   * Computes the greatest common divider with the euclidian algorithm.
   * Preconditions required: a > b > 0.
   * @param a First number, a > b
   * @param b Second number, b < a
   * @return The gcd
   */
  private static int gcdWithPrec(final int a, final int b) {
    if (b == 0) {
      return a;
    } else {
      return gcdWithPrec(b, a % b);
    }
  }

  /**
   * This functions checks if the given parameter p is a prime number.
   * //TODO describe method.
   * @param p The given number
   * @return True if p is prime, false if p is not prime
   */
  public static boolean isPrime(final int p) {
    // TODO Auto-generated method stub
    return false;
  }

}

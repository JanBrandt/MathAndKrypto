
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
   * This functions checks if the given parameter n is a prime number.
   * Used the sieve of Eratosthenes here.
   * @param n The given number
   * @return True if p is prime, false if n is not prime
   */
  public static boolean isPrime(final int n) {
    // 0 and 1 are no primes
    if (n == 0 || n == 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    // computes the neccessary size of the sieve
    int size = (int) Math.ceil(Math.sqrt(n));
    // generates an array of the needed size (+1 to avoid index-shifts)
    boolean[] sieve = new boolean[size + 1];
    // initialize the array beginning with position 2
    for (int i = 2; i < sieve.length; i++) {
      sieve[i] = true;
    }
    // test if current number divides n, if true, return false,
    // else eliminate all multiples of current number
    for (int i = 2; i < sieve.length; i++) {
      if (sieve[i]) {
        if (n % i == 0) {
          return false;
        } else {
          for (int j = i; j < sieve.length; j += i) {
            sieve[j] = false;
          }
        }
      }
    }
    return true;
  }

}

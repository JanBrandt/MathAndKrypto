/**
 *
 */
package de.brandt.math.krypto;

import java.security.InvalidParameterException;
import java.util.Arrays;

/**
 * @author Jan Brandt
 *
 */
public final class Permutation extends EncryptionFunction {

  @Override
  public String encrypt(final String message, final String key) {
    if (key.length() == message.length() && validKey(key)) {
      char[] result = new char[message.length()];
      char[] values = key.toCharArray();
      Arrays.sort(values);
      int newPosition;
      for (int i = 0; i < result.length; i++) {
        newPosition = key.indexOf(values[i]);
        result[newPosition] = message.charAt(i);
      }
      return new String(result);
    } else {
      String errMsg = "The parameters are not valid (key invalid)";
      throw new InvalidParameterException(errMsg);
    }
  }

  /*
   *
   */
  @Override
  public boolean validKey(final String key) {
    char[] test = key.toCharArray();
    Arrays.sort(test);
    for (int i = 0; i < test.length - 1; i++) {
      if (test[i] == test[i + 1]) {
        return false;
      }
    }
    return true;
  }

}

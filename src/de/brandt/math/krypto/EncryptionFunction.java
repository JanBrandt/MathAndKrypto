package de.brandt.math.krypto;

/**
 * @author Jan Brandt
 *
 */
public abstract class EncryptionFunction {

  /**
   * @param message The String that should be encrypted
   * @param key The key, the message should be encrypted with
   * @return The encrypted message
   */
  public abstract String encrypt(String message, String key);
}

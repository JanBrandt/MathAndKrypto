/**
 *
 */
package de.brandt.math.krypto;

/**
 * @author Jan Brandt
 *
 */
public abstract class BlockChiffre {
  /**
   * The length of each block of the chiffre.
   */
  private int blockLength;
  /**
   * The function to encrypt any message.
   */
  private EncryptionFunction encryptor;

  /**
   * TODO Description.
   * @param length The length of each block of the chiffre.
   */
  public BlockChiffre(final int length) {
    this.blockLength = length;
  }

  /**
   * @return The blocklength of the chiffre.
   */
  public final int getBlockLength() {
    return blockLength;
  }

  /**
   * @param message The message that should be encrypted
   * @param key The key to encrypt the message
   * @return The encrypted String
   */
  public abstract String encrypt(String message, String key);
}

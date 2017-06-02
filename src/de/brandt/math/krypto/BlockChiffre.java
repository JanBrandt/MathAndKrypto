/**
 *
 */
package de.brandt.math.krypto;

/**
 * @author Jan Brandt
 *
 */
public abstract class BlockChiffre {
  private int blockLength;
  private EncryptionFunction encryptor;

  /**
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
}

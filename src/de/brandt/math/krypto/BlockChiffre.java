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
   * @param enFun The encryption function for the BlockChiffre.
   * @return
   */
  public void setEncryptionFunction(final EncryptionFunction enFun) {
    this.encryptor = enFun;
  }
}

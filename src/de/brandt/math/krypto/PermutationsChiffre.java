package de.brandt.math.krypto;

/**
 * This class implements the classic permutation-chiffre.
 * @author Jan Brandt
 *
 */
public final class PermutationsChiffre extends BlockChiffre {

  /**
   * @param length the block-length of the chiffre.
   * @param encFun the encryption-function.
   */
  public PermutationsChiffre(final int length,
                             final EncryptionFunction encFun) {
    super(length, encFun);
  }

  @Override
  public String encrypt(final String message, final String key) {
    // TODO Auto-generated method stub
    return null;
  }

}

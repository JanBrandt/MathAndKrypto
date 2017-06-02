package de.brandt.math.krypto;

public abstract class EncryptionFunction {

  public abstract String encrypt(final String message, final String key);
}

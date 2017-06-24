package de.brandt.math.krypto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.security.InvalidParameterException;

import org.junit.Test;

public class TestPermutation {

  @Test
  public void testValidKeyWithValidKeys() {
    Permutation permutation = new Permutation();
    assertTrue("abc is a valid key", permutation.validKey("abc"));
    assertTrue(".-,mnb is a valid key", permutation.validKey(".-,mnb"));
    assertTrue("123456789 is a valid key", permutation.validKey("123456789"));
    assertTrue("1 is a valid key", permutation.validKey("1"));
  }

  @Test
  public void testValidKeyWithNonValidKeys() {
    Permutation permutation = new Permutation();
    assertFalse("abca is not a valid key", permutation.validKey("abca"));
    assertFalse("aa is not a valid key", permutation.validKey("aa"));
    assertFalse("abba is not a valid key", permutation.validKey("abba"));
    assertFalse(".+=2a.d is not a valid key", permutation.validKey(".+=2a.d"));
  }

  @Test
  public void testEncrypt() {
    Permutation permutation = new Permutation();
    assertEquals("Hallo", permutation.encrypt("Hallo", "12345"));
    assertEquals("Halol", permutation.encrypt("Hallo", "12354"));
  }

  @Test (expected = InvalidParameterException.class)
  public void testEncryptNonValidParam() {
    Permutation permutation = new Permutation();
    permutation.encrypt("Hallo", "11245");
  }

}

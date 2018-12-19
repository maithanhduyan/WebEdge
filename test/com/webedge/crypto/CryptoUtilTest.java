/**
 * WebEdge 2018
 */
package com.webedge.crypto;

import static org.junit.Assert.assertTrue;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;

/**
 * @author Mai Thành Duy An
 */
public class CryptoUtilTest {

	@Test
	void testSHA_256() throws NoSuchAlgorithmException, GeneralSecurityException {
		String inputHash = "hello";
		String out = CryptoUtil.SHA_256(inputHash);
		System.out.println("SHA256 hash: " + inputHash + "\n output: " + out);//[B@20322d26
		assertTrue(out.equals("2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824"));
	}
}

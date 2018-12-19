/**
 * WebEdge 2018
 */
package com.webedge.crypto;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Mai Thành Duy An
 */
public class CryptoUtil {

	public static String SHA_256(String hash) throws GeneralSecurityException, NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encodinghash = digest.digest(hash.getBytes(StandardCharsets.UTF_8));
		return bytesToHex(encodinghash);
	}

	/**
	 * BYTE to HEX Converter	<br/>
	 * get the hashed value in hexadecimal<br/>
	 * @param arrary of byte as hash
	 * @return hex as String <br/>
	 * Example: hello 
	 */
	@SuppressWarnings("unused")
	public static String bytesToHex(byte[] hash) {
		StringBuffer hexString = new StringBuffer();
		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1)
				hexString.append("0");
			hexString.append(hex);
		}
		return hexString.toString();
	}
}

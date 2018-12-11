/**
 * WebEdge 2018
 */
package com.webedge.token;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author Mai Thành Duy An
 */
public class TokenUtil {
	public static String generateNonce() {
		Random randomSource = new SecureRandom();
		byte random[] = new byte[16];

		// Render the result as a String of hexadecimal digits
		StringBuilder buffer = new StringBuilder();

		randomSource.nextBytes(random);

		for (int j = 0; j < random.length; j++) {
			byte b1 = (byte) ((random[j] & 0xf0) >> 4);
			byte b2 = (byte) (random[j] & 0x0f);
			if (b1 < 10) {
				buffer.append((char) ('0' + b1));
			} else {
				buffer.append((char) ('A' + (b1 - 10)));
			}
			if (b2 < 10) {
				buffer.append((char) ('0' + b2));
			} else {
				buffer.append((char) ('A' + (b2 - 10)));
			}
		}

		return buffer.toString();
	}
}

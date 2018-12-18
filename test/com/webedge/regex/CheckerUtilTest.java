/**
 * WebEdge 2018
 */
package com.webedge.regex;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Mai Thành Duy An
 */
public class CheckerUtilTest {
	
	@org.junit.jupiter.api.Test
	public void testPhoneNumberChecker() {
		String str = "123454567"; 
		assertTrue(CheckerUtil.isPhoneNumber(str));
	}
	
	@org.junit.jupiter.api.Test
	public void testEmailChecker() {
		String str = "yourname@domain213.com"; 
		assertTrue(CheckerUtil.isEmail(str));
	}
}

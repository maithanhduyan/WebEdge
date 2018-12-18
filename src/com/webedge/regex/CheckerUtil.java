/**
 * WebEdge 2018
 */
package com.webedge.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Mai Thành Duy An
 */
public class CheckerUtil {

	/**
	 * Number 0 to 9 <br/>
	 * Min lenght: 9 <br/>
	 * Max length: 13 <br/>
	 * [0-9]{9,13}
	 * 
	 * @param input
	 *            as String <br/>
	 *            Example: isPhoneNumber("123456789") <br/>
	 * @return true
	 */
	public static boolean isPhoneNumber(String input) {
		int minLength = 9;
		int maxLength = 13;
		Pattern pattern = Pattern.compile("[0-9]{" + minLength + "," + maxLength + "}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

	/**
	 * Email has type yourname@domain.com <br/>
	 * Example : isEmail("yourname@domain.com"); <br/>
	 * 
	 * @param input
	 *            as String
	 * @return true
	 */
	public static boolean isEmail(String input) {
		Pattern pattern = Pattern.compile("^[\\w-\\+]+(\\.[\\\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
}

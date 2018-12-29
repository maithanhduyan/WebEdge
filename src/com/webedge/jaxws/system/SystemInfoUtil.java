/**
 * WebEdge 2018
 */
package com.webedge.jaxws.system;

import java.util.Date;

/**
 * @author Mai Thành Duy An
 */
public class SystemInfoUtil {
	public static String getSystemTime() {
		return new Date().toString();
	}
}

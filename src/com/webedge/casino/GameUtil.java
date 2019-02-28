/**
 * WebEdge 2018
 */
package com.webedge.casino;

import java.sql.Connection;
import java.util.Date;

/**
 * @author Mai Thành Duy An
 */
public class GameUtil {

	public static Connection getConnection() {
		return CasinoConnectionDBPool.getConnection();
	}
	
	public static String getCurrentDate () {
		return new Date().toString();
	}
}

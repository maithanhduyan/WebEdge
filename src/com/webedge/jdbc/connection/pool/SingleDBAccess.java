/**
 * WebEdge 2018
 */
package com.webedge.jdbc.connection.pool;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Mai Thành Duy An
 */
public class SingleDBAccess {
	private static Logger logger = LoggerFactory.getLogger(SingleDBAccess.class.getName());
	private static Connection conn;

	static {
		try {
			String username = "tayadev";
			String password = "123";
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://tayafood.com:5432/tayadev", username, password);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	public static Connection getConnection() {
		return conn;
	}
}

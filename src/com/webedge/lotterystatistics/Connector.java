/**
 * WebEdge 2018
 */
package com.webedge.lotterystatistics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.transaction.SystemException;

/**
 * @author Mai Thành Duy An
 */
public class Connector {

	private static Connection conn;

	Connector(Connection connection) {
		Connector.conn = connection;
	}

	public static Connector getInstance() {

		try {
			String username = "postgres";
			String password = "123";
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/lottery", username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Connector(conn);
	}

	public static Connection getConnect() {
		return Connector.conn;
	}

	public static void close() throws SQLException, SystemException {
		Connector.conn.close();
	}
}

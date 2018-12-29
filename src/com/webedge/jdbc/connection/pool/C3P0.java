/**
 * WebEdge 2018
 */
package com.webedge.jdbc.connection.pool;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Mai Thành Duy An
 */
public class C3P0 {
	
	private static C3P0 datasource;
	private ComboPooledDataSource cpds;

	private C3P0() throws IOException, SQLException, PropertyVetoException {
		cpds = new ComboPooledDataSource();
		cpds.setDriverClass("org.postgresql.Driver"); // loads the jdbc driver
		cpds.setJdbcUrl("jdbc:postgresql://tayafood.com:5432/tayadev");
		cpds.setUser("tayadev");
		cpds.setPassword("123");

		// the settings below are optional -- c3p0 can work with defaults
		cpds.setMinPoolSize(5);
		cpds.setAcquireIncrement(5);
		cpds.setMaxPoolSize(20);
		cpds.setMaxStatements(180);

	}

	public static C3P0 getInstance() throws IOException, SQLException, PropertyVetoException {
		if (datasource == null) {
			datasource = new C3P0();
			return datasource;
		} else {
			return datasource;
		}
	}

	public Connection getConnection() throws SQLException {
		return this.cpds.getConnection();
	}
}

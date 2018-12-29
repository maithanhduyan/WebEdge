/**
 * WebEdge 2018
 */
package com.webedge.jdbc.connection.pool;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author Mai Thành Duy An
 */
public class DBCP {

	private static DBCP datasource;
	private BasicDataSource ds;

	private DBCP() throws IOException, SQLException, PropertyVetoException {
		ds = new BasicDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUsername("tayadev");
		ds.setPassword("123");
		ds.setUrl("jdbc:postgresql://tayafood.com:5432/tayadev");

		// the settings below are optional -- dbcp can work with defaults
		ds.setMinIdle(5);
		ds.setMaxIdle(20);
		ds.setMaxOpenPreparedStatements(180);

	}

	public static DBCP getInstance() throws IOException, SQLException, PropertyVetoException {
		if (datasource == null) {
			datasource = new DBCP();
			return datasource;
		} else {
			return datasource;
		}
	}

	public Connection getConnection() throws SQLException {
		return this.ds.getConnection();
	}
}

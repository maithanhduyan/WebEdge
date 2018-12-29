/**
 * WebEdge 2018
 */
package com.webedge.jdbc.connection.pool;

import java.sql.Connection;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author Mai Thành Duy An
 */
public class HikariCP {
	private static Logger logger = LoggerFactory.getLogger(HikariCP.class.getName());
	private static HikariDataSource ds;

	private static HikariConfig config = new HikariConfig();

	static {
		config.setJdbcUrl("jdbc:postgresql://tayafood.com:5432/tayadev");
		config.setDriverClassName("org.postgresql.Driver");
		config.setUsername("tayadev");
		config.setPassword("123");
		config.addDataSourceProperty("cachePrepStmts", "true");
		config.addDataSourceProperty("prepStmtCacheSize", "250");
		config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
		config.setMaximumPoolSize(5);
		config.setLeakDetectionThreshold(10);
		config.setAutoCommit(true);
		config.setIdleTimeout(3600);
		config.setPoolName("WebEdge");
		ds = new HikariDataSource(config);
		System.out.println("Get Datasource completed.");
	}

	public static Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
}

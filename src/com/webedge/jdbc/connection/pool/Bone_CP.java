/**
 * WebEdge 2018
 */
package com.webedge.jdbc.connection.pool;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

/**
 * @author Mai Thành Duy An
 */
public class Bone_CP {

	private static Bone_CP datasource;
	private BoneCP connectionPool;

	private Bone_CP() throws IOException, SQLException, PropertyVetoException {
		try {
			// load the database driver (make sure this is in your classpath!)
			Class.forName("org.postgresql.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		try {
			// setup the connection pool using BoneCP Configuration
			BoneCPConfig config = new BoneCPConfig();
			// jdbc url specific to your database, eg jdbc:mysql://127.0.0.1/yourdb
			config.setJdbcUrl("jdbc:postgresql://tayafood.com:5432/tayadev");
			config.setUsername("tayadev");
			config.setPassword("123");
			config.setMinConnectionsPerPartition(5);
			config.setMaxConnectionsPerPartition(10);
			config.setPartitionCount(1);
			// setup the connection pool
			connectionPool = new BoneCP(config);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}

	public static Bone_CP getInstance() throws IOException, SQLException, PropertyVetoException {
		if (datasource == null) {
			datasource = new Bone_CP();
			return datasource;
		} else {
			return datasource;
		}
	}

	public Connection getConnection() throws SQLException {
		return this.connectionPool.getConnection();
	}

}

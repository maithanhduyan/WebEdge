/**
 * WebEdge 2018
 */
package com.webedge.casino;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.webedge.jdbc.connection.pool.SingleDBAccess;

/**
 * @author Mai Thành Duy An
 */
public class CasinoConnectionDBPool {
	private static Logger logger = LoggerFactory.getLogger(SingleDBAccess.class.getName());
	private static Connection conn;
	private static final Map<String, Connection> POOL = new ConcurrentHashMap<>();
	static int count = 0;

	static Properties prop;

	static Thread runAsyncMethod(Runnable run) {
		return new Thread(run, "ONE");
	}

	static {
		try {
			String username = "postgres";
			String password = "123";
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", username, password);
			POOL.put(UUID.randomUUID().toString(), conn);
			System.out.print("--> " + GameUtil.getCurrentDate());
			System.out.println(" Get Connetion : ");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

	public static Connection getConnection() {
		runAsyncMethod(new Runnable() {

			@Override
			public void run() {
				System.out.print("--> " + GameUtil.getCurrentDate());
				System.out.println(" Runnable : " + POOL.size());
			}
		}).start();
		return conn;
	}

	// initPool()
	static {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " Thread starting ...");
			}
		}).start();
	}

	static {
		String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		String appConfigPath = rootPath + "app.properties";
		System.out.println(appConfigPath);
		prop = new Properties();
		try {
			prop.load(new FileInputStream(appConfigPath));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (prop.isEmpty()) {
			try {
				prop.setProperty("datasource.username", "");
				prop.setProperty("datasource.password", "");
				prop.setProperty("datasource.ClassName", "");
				prop.setProperty("datasource.url", "");
				prop.store(new FileWriter(appConfigPath), "Casino properties file");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Create New Properties.");
			String username = prop.getProperty("dataSource.username");
			String password = prop.getProperty("dataSource.password");
			String driverClass = prop.getProperty("dataSource.ClassName");
			String url = prop.getProperty("datasource.url");
		}
		
		Datasource datasource=	new Datasource();
		System.out.println("--> "+datasource.getClassName());
	}

}

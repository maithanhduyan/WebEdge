/**
 * WebEdge 2018
 */
package com.webedge.casino;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.ejb.Init;

/**
 * @author Mai Thành Duy An
 */
public class Datasource {
	private String username;
	private String password;
	private String className;
	private String url;
	private String databaseName;
	private static Properties _prop;
	private static String _rootPath;
	private static String _appConfig;

	public Datasource() {

	}

	public Datasource(int id) {

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	void initParam() {
		System.out.println("Sync");
		_prop = new Properties();
		File file = new File(_appConfig);
		if (file.exists()) {
			System.out.println("Read app.properties.");
			// Read file app.proprerties
			this.username = _prop.getProperty("dataSource.username");
			this.password = _prop.getProperty("dataSource.password");
			this.className = _prop.getProperty("dataSource.ClassName");
			this.url = _prop.getProperty("datasource.url");
		} else {
			// Create file app.properties
			System.out.println("Create app.proprtyies.");
			_prop.setProperty("datasource.username", "");
			_prop.setProperty("datasource.password", "");
			_prop.setProperty("datasource.ClassName", "");
			_prop.setProperty("datasource.url", "");
			try {
				_prop.store(new FileWriter(_appConfig), "Casino properties file");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	{
		System.out.println("init datasource.");
		_rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		_appConfig = _rootPath + "app.properties";
		initParam();
	}
}

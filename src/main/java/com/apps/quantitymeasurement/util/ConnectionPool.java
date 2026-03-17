package com.apps.quantitymeasurement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {

	private static final String URL = "jdbc:mysql://localhost:3306/quantitymeasurement_db";

	private static final String USER = "root";
	private static final String PASSWORD = "Jai@12345";

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
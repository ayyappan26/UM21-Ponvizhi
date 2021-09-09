package com.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() throws Exception
	{
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@DESKTOP-9UVHPUM:1522:XE";
		String userName = "system";
		String password = "password-1";
		Connection con = DriverManager.getConnection(url, userName, password);
		System.out.println("Connected");
		return con;
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
}

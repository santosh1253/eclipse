package com.bank.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	public static String driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/bank";
	private static String username="root";
	private static String password="Guru@1253";
	public  static  Connection con;
	public static Connection fetchConnection()
	{
		try {
			con=DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}

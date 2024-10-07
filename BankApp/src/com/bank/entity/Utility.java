package com.bank.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
	public static String url="jdbc:mysql://localhost:3306/thursday";
	public static String uname="root";
	public static String password="Guru@1253";
	public static String DriverUrl="com.mysql.cj.jdbc.Driver";
	public static Connection fetchConnection()
	{
		Connection con=null;
		try {
          con=DriverManager.getConnection(url,uname,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(con!=null)
		  return con;
		return null;
	}

}

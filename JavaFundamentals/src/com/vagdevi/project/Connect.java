package com.vagdevi.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	public static void main(String[] args) throws SQLException {
		try {
			String url="jdbc:mysql://localhost:3306/db";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,"root","Guru@1253");
//			Statement st=con.createStatement();
//			String query="create table courses(cid int primary key,cname varchar(20),price float );";
//			st.execute(query);
			PreparedStatement ps=con.prepareStatement("select  * from courses");
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				System.out.println(res.getInt(1)+" "+res.getString(2));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

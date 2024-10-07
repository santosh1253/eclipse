package com.vegahi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudent {
	
    public static void createStudent()
    {
    	try {
			Class.forName(Utility.DriverUrl);
			Connection con=Utility.fetchConnection();
			Statement st=con.createStatement();
			String query="insert into student values(1,'Ravi','EEE')";
			int res=st.executeUpdate(query);
			if(res>0)
			{
				System.out.println(res+" row(s) inserted Successfully");
			}
			else
			{
				System.out.println("Try again later");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    }
}

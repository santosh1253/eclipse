package com.vegahi;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStudent {
	public static void updateStudent()
	{
		try {
			Class.forName(Utility.DriverUrl);
			Connection con=Utility.fetchConnection();
			Statement st=con.createStatement();
			String query="update student set name='Alexa' where id=1";
			int res=st.executeUpdate(query);
			if(res>0)
			{
				System.out.println("updated ");
			}
			else
			{
				System.out.println("Try again");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

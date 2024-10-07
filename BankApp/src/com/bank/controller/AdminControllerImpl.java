package com.bank.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bank.entity.Customer;
import com.bank.entity.Utility;

public class AdminControllerImpl implements AdminController{
	
	public void saveCustomer(Customer c)
	{
		try {
			Class.forName(Utility.DriverUrl);
			Connection con=Utility.fetchConnection();
			String query="insert into customer values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,c.getFullname() );
			ps.setInt(2, c.getAccno());
			ps.setInt(3, c.getMbno());
			ps.setString(4, c.getIdproof() );
			ps.setString(5, c.getAddress());
			ps.setString(6, c.getEmail());
			ps.setDate(7, c.getDob());
			ps.setString(8,c.getAcctype());
			ps.setDouble(9,c.getBalance());
			ps.setString(10, c.getPwd());
			int res=ps.executeUpdate();
			if(res>0)
				System.out.println(res+" row(s) inserted successfully");
			else
				System.out.println("Try again");
				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}

package com.bank.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.entity.Customer;

public class CustomerOperationsImpl implements CustomerOperations {

	@Override
	public String saveCustomer(Customer c) {
		String status= "";
		try {
			Class.forName(Utility.driver);
			Connection con = Utility.fetchConnection();
			String query = "insert into customer values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, c.getName());
			ps.setLong(2, c.getAccno());
			ps.setString(3, c.getAcctype());
			ps.setDouble(4, c.getBalance());
			ps.setDate(5, c.getDob());
			ps.setString(6, c.getAddress());
			ps.setLong(7, c.getMbno());
			ps.setString(8, c.getEmail());
			ps.setString(9, c.getIdproof());
			ps.setString(10, c.getPassword());
			int res = ps.executeUpdate();
			if (res > 0) {
				status = "success";
			} else {
				System.out.println("Try again");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

//	@Override
//	public void updateCustomer(Customer c, long accno) {
//		
//		
//	}

	@Override
	public void fetchAllCustomers() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCustomer(long accno) {
		boolean res = fetchCustomer(accno);
		if (!res)
			System.out.println("User Not Found..!");
		else{
		// TODO Auto-generated method stub
		try {
			Class.forName(Utility.driver);
			Connection con=Utility.fetchConnection();
			String query="delete from customer where accno=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setLong(1, accno);
			int k=ps.executeUpdate();
			if(k>0) {
				System.out.println("deleted");
			}else {
				System.out.println("not deleted");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}

	@Override
	public void updateCustomer(Customer c, long accno) {
		boolean res = fetchCustomer(accno);
		if (!res)
			System.out.println("User Not Found..!");
		else {
			try {
				Class.forName(Utility.driver);
				Connection con = Utility.fetchConnection();
				String query = "update customer set name = ?,mbno = ? where accno = ?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1,c.getName());
				ps.setLong(2, c.getMbno());
				ps.setLong(3, accno);
				System.out.println(c);
				int result=ps.executeUpdate();
				System.out.println(result);
				if(result>0)
				{
					System.out.println("User with "+accno+" updated");
				}
				else
				{
					System.out.println("try again");
				}
				con.close();
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public boolean fetchCustomer(long accno) {
		try {
			Class.forName(Utility.driver);
			Connection con = Utility.fetchConnection();
			String query = "select * from customer where accno=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setLong(1, accno);
			ResultSet rs = ps.executeQuery();
			boolean res = false;
			while (rs.next()) {
				res = true;
				break;
			}
			con.close();
			return res;

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

}

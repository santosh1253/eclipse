package com.bank.view;

import java.sql.Date;
import java.util.Scanner;

import com.bank.controller.AdminController;
import com.bank.controller.FactoryCustomer;
import com.bank.entity.Customer;

public class View {
	public static void main(String[] args) {
		
		AdminController ac=FactoryCustomer.getCustomer();
		Customer c=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Login Admin");
		System.out.println("2.User Login");
		System.out.println("3.Application exit");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Inside if block");
			while(true)
			{
				System.out.println("1.create customer");
				System.out.println("2.update customer");
				System.out.println("3.Fetch all Customers");
				System.out.println("4.Delete a customer");
				System.out.println("5.Logout");
				switch(choice)
				{
				case 1:{
					sc.nextLine();
					System.out.println("Enter Full name");
					String fullname=sc.nextLine();
					System.out.println("Enter Account Number");
					int accno=sc.nextInt();
					
					System.out.println("Enter mobile name");
					int mbno=sc.nextInt();
					System.out.println("Enter idproof ");
					sc.nextLine();
					String idproof=sc.nextLine();
					System.out.println("Enter address");
					String address=sc.nextLine();
					System.out.println("Enter email");
					String email=sc.nextLine();
					System.out.println("Enter date of birth");
					Date dob=Date.valueOf(sc.nextLine());
					System.out.println("Choose acctype");
					String acctype=sc.nextLine();
					System.out.println("Enter balance");
					double balance=sc.nextDouble();
					System.out.println("Enter Your Password");
					sc.nextLine();
					String pwd=sc.nextLine();
					c=new Customer();
					c.setAccno(accno);
					c.setAcctype(acctype);
					c.setAddress(address);
					c.setBalance(balance);
					c.setDob(dob);
					c.setEmail(email);
					c.setFullname(fullname);
					c.setIdproof(idproof);
					c.setPwd(pwd);
					c.setMbno(mbno);
					ac.saveCustomer(c);
				}
					
				}
			}
		}
	}

}

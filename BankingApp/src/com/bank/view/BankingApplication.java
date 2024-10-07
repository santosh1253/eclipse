package com.bank.view;

import java.sql.Date;
import java.util.Scanner;

import com.bank.entity.Customer;
import com.bank.service.CustomerFactory;
import com.bank.service.CustomerOperations;

public class BankingApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomerOperations op = CustomerFactory.getImpl();
		while (true) {
			System.out.println("Welcome");
			System.out.println("1.Admin Login");
			System.out.println("2.User Login");
			System.out.println("3.Exit Application");
			int choice = sc.nextInt();
			if (choice == 1) {
				while (true) {
					System.out.println("1.create a new customer");
					System.out.println("2.Fetch customer by accno");
					System.out.println("3.update a existing customer");
					System.out.println("4.Fetch all customers");
					System.out.println("5.Delete a customer");
					System.out.println("6.Logout");
					System.out.println("Choose among the options");
					int option = sc.nextInt();
					Customer c;
					switch (option) {
					case 1:
						c = new Customer();
						c.setName("sai");
						c.setAccno(588437723);
						c.setAddress("kammaham");
						c.setBalance(2000);
						c.setMbno(987654321);
						c.setAcctype("Savings");
						c.setPassword("sai123");
						c.setIdproof("7665872634254");
						c.setDob(Date.valueOf("2023-05-22"));
						c.setEmail("sai1253@gmail.com");
						op.saveCustomer(c);
						break;
					case 2:
						long accno = sc.nextLong();
						boolean res = op.fetchCustomer(accno);
						if (res)
							System.out.println("user existed");
						else
							System.out.println("No user Found");
						break;
					case 3:
						System.out.println("Updating the customer");
						c = new Customer();
						System.out.println("Enter accno");
						long accnumber = sc.nextLong();
						sc.nextLine();
						System.out.println("Enter Your Updated Name");
						String updatedName = sc.nextLine();
						System.out.println("Enter Mobile number");
						long mobileno = sc.nextLong();
						System.out.println(accnumber + " " + mobileno + " " + updatedName);
						c.setMbno(mobileno);
						c.setName(updatedName);
						op.updateCustomer(c, accnumber);
					case 5:
						System.out.println("enter accno");
						long accn=sc.nextLong();
						op.deleteCustomer(accn);
						break;
						
					case 6:
						System.out.println("Exited the application");
						return;

					}
				}
			}
		}

	}
}

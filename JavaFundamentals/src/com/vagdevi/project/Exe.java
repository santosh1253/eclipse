package com.vagdevi.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exe {
	public static void main(String[] args) {
		List<User> users=new ArrayList<>();
		users.add(new User(101,"Ram","Ram@123",405349712,"Warangal"));
		users.add(new User(102,"Ravi","Ravi123",7809523,"Hyderabad"));
		users.add(new User(103,"Raju","Raju123",7809575,"Hanmakonda"));
		users.add(new User(104,"Rakesh","R123",7809595,"Vijayawada"));
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Username");
		String adminName=s.next();
		System.out.println("Enter Password");
		String pwd=s.next();
		if(pwd.equals("admin"))
		{
		  Admin admin=new Admin(adminName,pwd,users);
		  admin.fetchUsers();
		}
		
	}
}

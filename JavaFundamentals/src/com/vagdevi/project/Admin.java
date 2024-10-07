package com.vagdevi.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
	private String uname;
	private String pwd;
	private List<User> users;
	
	public Admin(String uname, String pwd, List<User> users) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.users = users;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public void fetchUsers()
	{
	   List<User>  fetchedUsers=getUsers()	;
	   for(User user:fetchedUsers) {
		   String str=user.toString();
		   System.out.println(str);
	   }
//	   for(int i=0;i<fetchedUsers.size();i++)
//	   {
//          System.out.println(fetchedUsers.get(i));
//	   }
	}

	

}

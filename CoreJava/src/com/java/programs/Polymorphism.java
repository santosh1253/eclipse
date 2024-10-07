package com.java.programs;

public class Polymorphism {
	
	public void display()
	{
		System.out.println("Hello");
	}
	public int  display(String name,int r,String lname)
	{
		System.out.println("Hello "+name);
		return 5;
	}
	public int display(String lname,String name,int r)
	{
		System.out.println("Hello "+name);
		return 5;
	}
	public static void main(String[] args) {
		Polymorphism obj=new Polymorphism();
		System.out.println(obj);
		obj.display();
		//obj.display("Guru Datta");
	}

}

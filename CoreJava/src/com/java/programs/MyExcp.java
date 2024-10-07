package com.java.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class MyExcp {
	
	public static void main(String[] args)  {	
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(9);
		System.out.println(al);
		Iterator i=al.listIterator();
	}
	

}

package com.vagdevi.project;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Stack;

public class MyClass {
	public static void main(String[] args) {
		String arr[] = { "Dhoni", "Rohit", "Kohli", "Misbah", "RPant" };
		Stack<String> ll = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			ll.push(arr[i]);
		}
		Iterator<String> i = ll.iterator();
		while (!ll.isEmpty()) {
			String res = ll.pop();
			System.out.println(res);
		}
		ll.forEach(System.out::print);
		LocalDate ld = LocalDate.now();
		System.out.println(ld);

	}
}

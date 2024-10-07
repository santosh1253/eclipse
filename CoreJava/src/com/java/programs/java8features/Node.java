package com.java.programs.java8features;

public class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
		//System.out.println(next.next);
    }
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	

}

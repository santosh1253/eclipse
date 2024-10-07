package com.java.programs.files;

public class MyStack {
	
	int top=-1;
	int max=100;
	int arr[]=new int[max];
	
	public void push(int data)
	{
		if(top>max)
		{
			System.out.println("Overflow");
			return;
		}
		else
		{
			arr[++top]=data;
		}
	}
	
	public int pop()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
			return arr[top--];
	}
	public int peek()
	{
		if(top<0)
		{
			System.out.println("Stack Underflow");
			return 0;
		}
			return arr[top];
	}
	
	
	
	public static void main(String[] args) {
		
		MyStack stack=new MyStack();
		stack.push(9);
		stack.push(8);
		stack.push(32);
		stack.push(99);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
	
	
	

}

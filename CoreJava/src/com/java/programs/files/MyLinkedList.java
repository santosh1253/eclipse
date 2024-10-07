package com.java.programs.files;

public class MyLinkedList {
	public Node head;
	
	public void addElement(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=n;
		}
	}
	
	public void printList()
	{
		Node curr=head;
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		while(curr.next!=null)
		{
			System.out.print(curr.data +" -> ");
			curr=curr.next;
		}
		System.out.println(curr.data+" -> null");
	}
	
	public void addFirst(int data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;	
	}
	public void deleteFirst()
	{
		Node curr=head;
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		head=curr.next;
		curr=null;
	}
	
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.addElement(11);
		list.addElement(22);
		list.addElement(23);
		list.addElement(45);
		list.addFirst(100);
		list.addElement(300);
		list.addFirst(400);
		list.deleteFirst();
		list.printList();
	}

}

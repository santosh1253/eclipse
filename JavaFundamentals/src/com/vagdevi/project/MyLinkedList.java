package com.vagdevi.project;

public class MyLinkedList {
    Node head;
    //Null 0
	
    //inserting node into Linked List
    public void insert(int data)
    {
    	Node n=new Node(data);
    	// First node in the list
    	if(head==null)
    	{
    		head=n;
    	}
    	else
    	{
    		Node current=head;
    		//Traversing to the end of the list
    		while(current.next!=null)
    		{
    			current=current.next;
    		}
    		//insert a new node to the list
    		current.next=n;
    	}    	
    }
    public void insertBegin(int data)
    {
    	Node n=new Node(data);
    	Node current=head;
    	head=n;
    	head.next=current;
    	
    }
    
    
    
    
    
    
    
    
    //Printing Nodes
    public void print()
	{
	   Node current=head;	
	   while(current.next!=null)
	   {
		   System.out.print(current.data+" ->");
		   current=current.next;
	   }
	   System.out.println(current.data+" -> null");
	}
    
	public static void main(String[] args) {
		MyLinkedList list=new  MyLinkedList();
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.insertBegin(200);
		list.print();
	}
}

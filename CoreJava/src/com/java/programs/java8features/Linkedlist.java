package com.java.programs.java8features;

public class Linkedlist {
	private Node head;
	public void add(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
			System.out.println("New Node for first time"+head);
		}
		else
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=new_node;
		}
	}
	public void print()
	{
		if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); 
	}
	
	public void insertStart(int data)
	{
		 Node n=new Node(data);
		 Node curr=head;
		 n.next=curr;
		 head=n;	 
	}
	public void insertAtPosition(int data,int position)
	{
		Node curr=head;
		Node prev;
		int c=1;
		while(true)
		{
			prev=curr;
		    curr=curr.next;
		    c++;
			if(position==c)
			{
				Node n=new Node(data);
				prev.next=n;
				n.next=curr;
				break;
			}
		}
		
	}
	public void deleteAtPosition(int position)
	{
		Node curr=head;
		Node prev;
		int c=1;
		while(true)
		{
			prev=curr;
		    curr=curr.next;
		    c++;
			if(position==c)
			{
				prev.next=curr.next;
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		l.add(20);
		l.add(30);
		l.add(21);
		l.add(34);
		l.add(45);
		l.insertStart(100);
		l.print();
		l.deleteAtPosition(6);
		l.print();
	}

}

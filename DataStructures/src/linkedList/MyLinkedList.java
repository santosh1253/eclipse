package linkedList;

public class MyLinkedList {

	private Node head;
	
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
			n.prev=curr;
		}	
	}
	
	public void addFirst(int data)
	{
		Node n=new Node(data);	
		head.prev=n;
		n.next=head;
		head=n;
	}
	
	public void print()
	{
		if(head==null)
		{
			System.out.println("Empty");
			return ;
		}
		else
		{
			Node curr=head;
			while(curr.next!=null)
			{
				System.out.print(curr.data+" ->");
				curr=curr.next;
			}
			System.out.println(curr.data+" -> null");
			
		}
	}
	public static void main(String[] args) {
		MyLinkedList dll=new MyLinkedList();
		dll.addElement(20);
		dll.addElement(30);
		dll.addFirst(40);
		dll.addFirst(400);
		dll.print();
		
	}
}

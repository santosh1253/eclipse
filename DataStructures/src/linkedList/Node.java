package linkedList;

public class Node {
	Node prev;
	int data;
	Node next;
	public Node(int data)
	{
		this.prev=null;
		this.data=data;
		this.next=null;
	}
	@Override
	public String toString() {
		return "Node [ data=" + data + "]";
	}
	
	
	

}

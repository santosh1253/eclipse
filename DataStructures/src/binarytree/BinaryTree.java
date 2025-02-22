package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public Node root;

	public void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
			return;
		}
		// Inserting the elements level by level
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node curr = q.poll();
			if (curr.left == null) {
				curr.left = n;
				break;
			} else {
				q.add(curr.left);
			}
			if (curr.right == null) {
				curr.right = n;
				break;
			} else {
				q.add(curr.right);
			}
		}
	}
	
	public void inorderTrav(Node root)
	{
		//Base condition to terminate recursion
		if(root!=null)
		{
			inorderTrav(root.left);
			System.out.print(root.data+" ");
			inorderTrav(root.right);
		}
	}
	
	public void levelOrder(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node curr=q.poll();
			System.out.print(curr.data+" ");
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
	}
	
	

	public static void main(String[] args) {

		BinaryTree t=new BinaryTree();
		t.insert(50);
		t.insert(20);
		t.insert(30);
		t.insert(40);
		t.inorderTrav(t.root);
		System.out.println();
		t.levelOrder(t.root);
	}

}

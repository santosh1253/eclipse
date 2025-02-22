package binarytree;

public class BinarySearchTree {
	public Node root;

	public Node add(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = add(root.left, data);
		} else if (data > root.data) {
			root.right = add(root.right, data);
		}
		return root;
	}

	public void inorderTrav(Node root) {
		// Base condition to terminate recursion
		if (root != null) {
			inorderTrav(root.left);
			System.out.print(root.data + " ");
			inorderTrav(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.root=bst.add(bst.root, 22);
		bst.add(bst.root, 22);
		bst.add(bst.root, 22);
		bst.add(bst.root, 22);
		bst.add(bst.root, 22);
		bst.inorderTrav(bst.root);
	}

}

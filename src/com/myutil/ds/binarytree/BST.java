package com.myutil.ds.binarytree;

public class BST {
	Node root = null;

	public Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data <= root.data) {
			root.left = insert(root.left, data);

		} else {
			root.right = insert(root.right, data);
		}
		return root;

	}

	public boolean search(Node root, int data) {
		if (root == null) {
			return false;
		} else if (data == root.data) {
			return true;
		} else if (data <= root.data) {
			return search(root.left, data);

		} else {
			return search(root.right, data);

		}

	}

	public void prinTree(Node node) {
		if (node != null) {
			prinTree(node.left);
			System.out.print(node.data + " ");
			prinTree(node.right);
		}

	}

}

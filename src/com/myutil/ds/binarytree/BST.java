package com.myutil.ds.binarytree;

public class BST {
	Node root = null;

	public Node insert(Node root ,int data) {
		if (root == null) {
			root = new Node(data);
		} else if (data <= root.data) {
			root.left = insert(root.left,data);

		} else {
			root.right = insert(root.right,data);
		}
		return root;

	}

	public void prinTree(Node node) {
		if (root != null) { 
			prinTree(root.left); 
            System.out.println(root.data); 
            prinTree(root.right); 
        } 

	}

}

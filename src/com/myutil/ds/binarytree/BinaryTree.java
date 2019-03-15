package com.myutil.ds.binarytree;

public class BinaryTree {
	// Root of Binary Tree
	Node root;

	// Constructors
	BinaryTree(int key) {
		root = new Node(key);
	}

	BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		/*tree.root.right.left = new Node(1);
		tree.root.right.right = new Node(3);*/

		/**
		 * ########## METHOD CALLS############
		 */

		/*
		 * new BinarayTreeUtil().getLeftView(tree.root,1); if (new
		 * BinarayTreeUtil().isBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE))
		 * System.out.println("IS BST"); else System.out.println("Not a BST");
		 */
		//new BinarayTreeUtil().getLeafNodes(tree.root);
		System.out.println(new BinarayTreeUtil().getBTHeight(tree.root));

	}
	

}

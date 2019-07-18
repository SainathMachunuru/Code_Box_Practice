package com.myutil.ds.binarytree;

public class BSTMain {

	public static void main(String[] args) {
		BST bst = new BST();
		Node node = null;
		node = bst.insert(node,6);
		node = bst.insert(node,3);
		node = bst.insert(node,7);
		bst.insert(node,1);
		bst.insert(node,2);
		bst.insert(node,8);
		bst.insert(node,9);
		System.out.println(node.left.data);

		
		//bst.prinTree(bst.root);

	}

}

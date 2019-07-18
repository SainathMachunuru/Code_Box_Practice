package com.myutil.ds.binarytree;

public class BSTMain {

	public static void main(String[] args) {
		BST bst = new BST();
		Node node = bst.root;
		node = bst.insert(node,6);
		node = bst.insert(node,3);
		node = bst.insert(node,7);
		node =bst.insert(node,1);
		node =bst.insert(node,2);
		node = bst.insert(node,8);
		node = bst.insert(node,9);
		
		int searchElement = 7;
		
		System.out.println("**********Elements of BST :: INORDER**********");
		bst.prinTree(node);
		System.out.println("**********************************************");
		
		System.out.println("**********Serching for element "+searchElement+" . . . . .");
		System.out.println(bst.search(node, 5)==true?"Element Found":"Element not found");
		System.out.println("*********************************************************");
		
		
		

	}

}

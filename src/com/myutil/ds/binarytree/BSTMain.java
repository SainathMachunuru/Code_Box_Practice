package com.myutil.ds.binarytree;

public class BSTMain {

	public static void main(String[] args) {
		BST bst = new BST();
		Node node = bst.root;
		node = bst.insert(node, 6);
		node = bst.insert(node, 3);
		node = bst.insert(node, 7);
		node = bst.insert(node, 1);
		node = bst.insert(node, 0);
		node = bst.insert(node, 2);
		node = bst.insert(node, 8);
		node = bst.insert(node, 9);
		

		int searchElement = 7;
		int searchSuccessor = 0;

		System.out.println("**********Elements of BST :: INORDER**********");
		bst.inOrder(node);
		System.out.println("**********************************************");

		System.out.println("**********Serching for element " + searchElement + " . . . . .");
		System.out.println(bst.search(node, 5) == true ? "Element Found" : "Element not found");
		System.out.println("*********************************************************");

		System.out.println("**********The Minimum Elelement of given BST is: **********");
		System.out.println(bst.getMinElement(node) == -1 ? "Error :: tree is empty" : bst.getMinElement(node));
		System.out.println("**********************************************");

		System.out.println("**********The Maximum Elelement of given BST is: **********");
		System.out.println(bst.getMinElement(node) == -1 ? "Error :: tree is empty" : bst.getMaxElement(node));
		System.out.println("**********************************************");

		System.out.println("**********Height(Max Depth) of BST**********");
		System.out.println(bst.height(node));
		System.out.println("**********************************************");
		
		System.out.println("**********Level order traversal(breadth first) of BST**********");
		bst.levelOrder(node);
		System.out.println("**********************************************");
		
		System.out.println("********** Pre-Order traversal(depth first) of BST**********");
		bst.preOrder(node);
		System.out.println("\n**********************************************");
		
		System.out.println("********** Post-Order traversal(depth first) of BST**********");
		bst.postOrder(node);
		System.out.println("\n**********************************************");
		
		System.out.println("********** In-Order traversal(depth first) of BST**********");
		bst.inOrder(node);
		System.out.println("\n**********************************************");
		
		System.out.println("********** Is given BST is balanced ??? **********");
		System.out.println(bst.isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE));
		System.out.println("\n**********************************************");
		
		/*System.out.println("**********Deleting a node from BST**********");
		bst.delete(node,8);
		System.out.println("**********************************************");
		
		System.out.println("********** Elements of deleteing node of BST**********");
		bst.preOrder(node);
		System.out.println("\n**********************************************");*/
		
		System.out.println("**********Inorder Succcessor of Node: "+searchSuccessor+" **********");
		System.out.println(bst.getInorderSuccessor(node, searchSuccessor).data);
		System.out.println("**********************************************");
		
	}

}

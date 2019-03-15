package com.myutil.ds.binarytree;

public class BinarayTreeUtil {
	private int maxLevel = 0;

	/*
	 * used level-order traversal and printed first element in each level
	 */
	public void getLeftView(Node node, int level) {
		// System.out.println(node.data+" ");
		if (node == null) {
			return;
		}

		if (maxLevel < level) {
			System.out.print(node.data + " ");
			maxLevel = level;

		}
		getLeftView(node.left, level + 1);
		getLeftView(node.right, level + 1);

	}

	public boolean isBST(Node node, int min, int max) {
		/* an empty tree is BST */
		if (node == null)
			return true;

		/* false if this node violates the min/max constraints */
		if (node.data < min || node.data > max)
			return false;

		/*
		 * otherwise check the subtrees recursively tightening the min/max constraints
		 */
		// Allow only distinct values
		return (isBST(node.left, min, node.data - 1) && isBST(node.right, node.data + 1, max));

	}

	public void getLeafNodes(Node node) {
		if (node == null) {
			return;

		}
		if (node.left == null && node.right == null) {
			System.out.println(node.data);
		}
		getLeafNodes(node.left);
		getLeafNodes(node.right);
	}
	public int getBTHeight(Node node) {
		if(node == null) {
			return 0;
		}
		else if(node.left == null || node.right == null) {
			return 1;
		}
		else {
			return Math.max(getBTHeight(node.left),getBTHeight(node.right))+1;
		}
		
		/*if (node == null) 
            return 0; 
        else 
        { 
             //compute the depth of each subtree 
            int lDepth = getBTHeight(node.left); 
            int rDepth = getBTHeight(node.right); 
   
             //use the larger one 
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } */
		
	}

}

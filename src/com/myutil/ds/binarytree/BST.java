package com.myutil.ds.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The depth of a node is the number of edges from the root to the node. The
 * height of a node is the number of edges from the node to the deepest leaf.
 * The height of a tree is a height of the root. A full binary tree.is a binary
 * tree in which each node has exactly zero or two children. A complete binary
 * tree is a binary tree, which is completely filled, with the possible
 * exception of the bottom level, which is filled from left to right. Bread
 * first traversal: Level Order traversal Depth first traversal:pre order,in
 * order,post order
 */
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
	// recursive approach
		public int getMinElement(Node root) {
			if (root == null) {
				return -1;
			} else if (root.left == null) {
				return root.data;
			} else {
				return getMinElement(root.left);
			}

		}

		// iterative approach
		public int getMaxElement(Node root) {
			if (root == null) {
				return -1;
			}
			while (root.right != null) {
				root = root.right;
			}
			return root.data;

		}

		public int height(Node root) {
			if (root == null) {
				return -1;
			}
			int leftHeight = height(root.left);
			int rightHeight = height(root.right);

			return Math.max(leftHeight, rightHeight) + 1;

		}

		public void levelOrder(Node root) {
			Queue<Node> queue = new LinkedList<Node>();
			if (root == null) {
				return;

			} else {
				queue.add(root);
			}
			while (!queue.isEmpty()) {
				Node current = queue.remove();
				System.out.print(current.data + " ");
				if (current.left != null) {
					queue.add(current.left);

				}
				if (current.right != null) {
					queue.add(current.right);

				}

			}
			System.out.println();

		}

		public void preOrder(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);

		}

		public void postOrder(Node root) {
			if (root == null) {
				return;
			}
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");

		}

		public void inOrder(Node root) {
			if (root == null) {
				return;
			}
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
		
		public boolean isBST(Node root, int minVal, int maxVal) {
			if (root == null) {
				return true;

			}
			if (root.data >= minVal && root.data <= maxVal && isBST(root.left, minVal, root.data)
					&& isBST(root.right, root.data, maxVal)) {
				return true;

			} else {
				return false;
			}
		}

	public Node delete(Node root,int data) {
		if(root == null) {
			return root;
			
		}
		else if(data<root.data) {
			root.left = delete(root.left, data);
			
		}
		else if(data>root.data) {
			root.right = delete(root.right, data);
		}
		else {
			//case 1 no child
			if(root.left == null && root.right == null) {
				root = null;
				
			}
			//case 2 one child
			else if(root.left == null) {
				Node temp = root;
				root = root.right;
				temp = null;
				
			}
			else if(root.left == null) {
				Node temp = root;
				root = root.left;
				temp = null;
				
			}
			//case 3 two child 
			else {
				Node temp = getMinNode(root.right);
				root.data = temp.data;
				root.right = delete(root.right, data);
				
			}
		}
		return root;
		
		
	}
	public Node getInorderSuccessor(Node root,int data) {
		Node current = searchNode(root,data);
		if(current == null) {
			return null;
		}
		if(current.right!=null) { //case1 node has  right subtree
			return getMinNode(current.right);
		}
		else { //case2 no right subtree
			Node successor = null;
			Node ancestor = root;
			while(ancestor!=null) {
				if(current.data<ancestor.data) {
					successor = ancestor;
					ancestor = ancestor.left;
					
				}
				else {
					ancestor = ancestor.right;
				}
				
			}
			return successor;
			
		}
	}

	private Node searchNode(Node root,int data) {
		if (root == null) {
			return root;
		} else if (data == root.data) {
			return root;
		} else if (data <= root.data) {
			return searchNode(root.left, data);

		} else {
			return searchNode(root.right, data);

		}
	}

	private Node getMinNode(Node root) {
		if (root == null) {
			return root;
		} else if (root.left == null) {
			return root;
		} else {
			return getMinNode(root.left);
		}
	}

}

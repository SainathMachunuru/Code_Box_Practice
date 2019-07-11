package com.myutil.ds.linkedList;

public class LinkedList {
	Node head = null;

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public void printLinkedList() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.next;

		}
		System.out.println("NULL");

	}

	public int getMiddleElement() {
		Node slowPointer = head;
		Node fastPointer = head;
		while (fastPointer != null && fastPointer.next != null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}

		return slowPointer.data;
	}

	public Node reverseLinkedList(Node node) {
		Node current = node;
		Node prev = null, next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;

	}

	public void rotateLinkedList(Node node, int k) {

		Node current = node;
		for (int i = 1; i < k && current != null; i++) {
			current = current.next;
		}
		if (current == null) {
			return;
		}
		Node breakNode = current;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
		this.head = breakNode.next;
		breakNode.next = null;
		printLinkedList();

		/*
		 * breakNode.next = node; this.head = breakNode;
		 * System.out.println("*******************"); printLinkedList();
		 */

	}

	public Node mergeTwoLists(Node A, Node B) {
		Node temp = null;
		Node tempHead = null;
		while (A != null && B != null) {
			if (A.data <= B.data) {
				if (temp == null) {

					temp = A;
					tempHead = A;
				} else {
					temp.next = A;

					temp = temp.next;
				}
				A = A.next;
			} else {
				if (temp == null) {

					temp = B;
					tempHead = B;
				} else {
					temp.next = B;
					temp = temp.next;
				}
				B = B.next;
			}

		}
		/*
		 * while(A!=null){ temp.next = A; A=A.next;
		 * 
		 * }
		 */
		if (A != null)
			temp.next = A;
		/*
		 * while(B!=null){ temp.next = B; B=B.next;
		 * 
		 * }
		 */
		if (B != null)
			temp.next = B;
		head = tempHead;
		printLinkedList();
		return temp;

	}

	public void insertElementAtStart(LinkedList ls, int data) {
		Node newNode = new Node(data);
		newNode.next = ls.head;
		ls.head = newNode;

	}

	public void insertElementAtLast(LinkedList ls, int data) {
		Node tempnode = ls.head;
		Node newNode = new Node(data);
		while (tempnode.next != null) {
			tempnode = tempnode.next;
		}
		tempnode.next = newNode;

	}

	public void insertAtSpecificPos(LinkedList ls, int data, int prevNodeVal) {
		Node newNode = new Node(data);
		Node prevNode = ls.head;
		while (prevNode != null) {
			if (prevNode.data == prevNodeVal) {
				newNode.next = prevNode.next;
				prevNode.next = newNode;
			}
			prevNode = prevNode.next;
		}
	}

	public void deleteAtSpecificPos(LinkedList ls, int pos) {
		Node currentNode = ls.head;
		if (pos == 0) {
			ls.head = currentNode.next;
		}
		for (int i = 0; currentNode != null && i < pos - 1; i++) {
			currentNode = currentNode.next;

		}

		currentNode.next = currentNode.next.next;

	}
	public void printLinkedListReverse(Node head) {
		if(head == null) {
			return;
		}
		printLinkedListReverse(head.next);
		System.out.print(head.data+" ");
		System.out.println();
		
	}

}

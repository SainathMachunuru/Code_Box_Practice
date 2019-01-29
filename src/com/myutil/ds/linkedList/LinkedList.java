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

}

package com.myutil.ds.linkedList;

public class DoublyLinkedList {
	DLNode head = null;

	public void inserAtHead(DoublyLinkedList dl, int data) {
		DLNode newNode = new DLNode(data);
		if (dl.head != null) {
			head.prev = newNode;
		}
		newNode.next = dl.head;
		newNode.prev = null;
		dl.head = newNode;

	}

	public void insertAfterGivenNode(DoublyLinkedList dl, int preNodeVal, int data) {
		DLNode current = dl.head;
		DLNode newNode = new DLNode(data);
		
		while (current != null) {
			if (current.data == preNodeVal) {
				DLNode temp = current.next;
				if(current.next!=null) {
					current.next.prev = newNode;
				}
				newNode.next = temp;
				newNode.prev = current;
				current.next = newNode;
				

			}
			current = current.next;
		}

	}
	public void insertAtEnd(DoublyLinkedList dl, int data) {
		DLNode newNode = new DLNode(data);
		DLNode current = dl.head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = newNode;
		newNode.next = null;
		newNode.prev = current;
		
	}

	// Inserts a new Node at front of the list
	public void push(int newData) {
		DLNode newNode = new DLNode(newData);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	// Appends a new node at the end
	public void append(int new_data) {

		DLNode new_node = new DLNode(new_data);
		DLNode last = head;
		new_node.next = null;

		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null) {
			last = last.next;
		}

		last.next = new_node;
		new_node.prev = last;
	}

	public void printDoublyLinkedList(DLNode head) {
		DLNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println();

	}

	public void printDoublyLinkedListReverse(DLNode head) {
		DLNode current = head;
		DLNode last = null;
		while (current != null) {
			last = current;
			current = current.next;

		}
		while (last != null) {
			System.out.print(last.data + "->");
			last = last.prev;

		}
		System.out.println();

	}

}

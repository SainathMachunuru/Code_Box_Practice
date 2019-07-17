package com.myutil.ds.queue;

import com.myutil.ds.linkedList.Node;

public class QueueLinkedListImpl {
	Node front = null, rear = null;

	public void enqueue(int data) {
		Node newNode = new Node(data);
		if (front == null && rear == null) {
			front = newNode;
			rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;

	}

	public void dequeue() {
		Node temp = front;
		if (front == null) {
			System.out.println("can not perform dequeue :: queue is empty");
			return;
		}
		if (front == rear) {
			front = null;
			rear = null;

		} else {
			front = front.next;
		}
		temp = null; // releasing the memory of deleted node
	}

	public void printQueue() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println();
	}

	public boolean isEmpty() {
		return front == null ? true : false;
	}
	
	public int  front() {
		return front!=null? front.data:-1;
		
	}

}

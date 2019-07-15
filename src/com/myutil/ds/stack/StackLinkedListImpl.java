package com.myutil.ds.stack;

public class StackLinkedListImpl {
	Node top = null;
	
	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = top;
		top = newNode;
		
	}
	public void pop() {
		Node newTop = top.next;
		top.next = null;
		top = newTop;
	}

	public int top() {
		return top != null ? top.data : 0;

	}
	public boolean isEmpty() {
		return top == null? true : false;
	}
	
	public void printStack() {
		Node tempNode = top;
		while (tempNode != null) {
			System.out.print(tempNode.data + "->");
			tempNode = tempNode.next;

		}
		System.out.println("NULL");

	}

}

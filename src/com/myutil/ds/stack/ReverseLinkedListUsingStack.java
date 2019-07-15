package com.myutil.ds.stack;

import java.util.Stack;

import com.myutil.ds.linkedList.LinkedList;
import com.myutil.ds.linkedList.Node;

public class ReverseLinkedListUsingStack {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.append(2);
		ls.append(4);
		ls.append(6);
		ls.append(8);

		System.out.println("Linked list before reverse:: ");
		ls.printLinkedList();

		System.out.println("Linked list after reverse:: ");

		Node reverseHead = reverseLinkedList(ls.head);
		ls.head = reverseHead;
		ls.printLinkedList();

	}

	private static Node reverseLinkedList(Node head) {
		Stack<Node> stack = new Stack<Node>();
		Node temp = head;
		while (temp != null) {
			stack.push(temp);
			temp = temp.next;
		}
		temp = stack.peek();
		head = temp;
		stack.pop();
		while (!stack.empty()) {
			temp.next = stack.peek();
			stack.pop();
			temp = temp.next;
		}
		temp.next = null;

		return head;

	}

}

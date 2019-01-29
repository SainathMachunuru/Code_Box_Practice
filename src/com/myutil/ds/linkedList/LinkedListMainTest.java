package com.myutil.ds.linkedList;

public class LinkedListMainTest {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		for(int i=1;i<=5;i++) {
			linkedList.push(i);
			linkedList.printLinkedList();
		}
		/*System.out.println("Middle Element: "+linkedList.getMiddleElement());
		System.out.println("current head: "+linkedList.head.data);
		Node reversedHead = linkedList.reverseLinkedList(linkedList.head);
		linkedList.head = reversedHead;
		System.out.println("linked list after reversing: ");
		linkedList.printLinkedList();*/
		linkedList.rotateLinkedList(linkedList.head, 2);
	}

}

package com.myutil.ds.linkedList;

public class LinkedListMainTest {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		/*for(int i=1;i<=5;i++) {
			linkedList.push(i);
			linkedList.printLinkedList();
		}*/
		/*System.out.println("Middle Element: "+linkedList.getMiddleElement());
		System.out.println("current head: "+linkedList.head.data);
		Node reversedHead = linkedList.reverseLinkedList(linkedList.head);
		linkedList.head = reversedHead;
		System.out.println("linked list after reversing: ");
		linkedList.printLinkedList();
		linkedList.rotateLinkedList(linkedList.head, 2);*/
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l2.push(3);
		l2.push(2);
		l2.push(1);
		
		l1.push(6);
		l1.push(5);
		l1.push(4);
		
		new LinkedList().mergeTwoLists(l1.head, l2.head);
	}

}

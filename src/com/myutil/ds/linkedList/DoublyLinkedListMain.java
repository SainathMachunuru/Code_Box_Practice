package com.myutil.ds.linkedList;

public class DoublyLinkedListMain {
	public static void main(String args[]) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.append(1);
		dl.append(2);
		dl.append(3);
		dl.append(4);
		
		dl.printDoublyLinkedList(dl.head);
		//dl.inserAtHead(dl, 5);
		//dl.insertAfterGivenNode(dl, 2, 6);
		//dl.insertAtEnd(dl, 12);
		
		DLNode temp = dl.reverseDoublyLinkedList(dl.head);
		
		
		dl.printDoublyLinkedList(temp);
		//dl.printDoublyLinkedListReverse(dl.head);
		

	}

}

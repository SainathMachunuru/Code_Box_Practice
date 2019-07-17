package com.myutil.ds.queue;

public class QueueLinkedListImplMain {

	public static void main(String[] args) {
		QueueLinkedListImpl queue = new QueueLinkedListImpl();
		
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(8);
		
		System.out.println("***** Elements of Queue *********");
		queue.printQueue();
		System.out.println("*********************************");
		
		queue.dequeue();
		
		System.out.println("***** Elements of Queue after dequeue *********");
		queue.printQueue();
		System.out.println("*********************************");
		
		System.out.println("***** Is Queue empty ??? *********");
		System.out.println(queue.isEmpty());
		System.out.println("*********************************");
		
		System.out.println("***** Front of Queue *********");
		System.out.println(queue.front()>-1?queue.front():"can get front of queue :: queue is empty");
		System.out.println("*********************************");

	}

}

package com.myutil.queue;

public class QueueArrayImplMain {

	public static void main(String[] args) {
		
		QueueArrayImpl queue =new QueueArrayImpl();
		
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(5);
		//queue.enqueue(6);
		//queue.enqueue(8);
		
		System.out.println("***** Elements of Queue *********");
		queue.printQueue();
		System.out.println("*********************************");
		
		int data = queue.dequeue();
		
		System.out.println("***** Element that dequed is: *********");
		System.out.println(data==-1?"":data);
		System.out.println("*********************************");
		queue.printQueue();
		/*queue.enqueue(12);
		System.out.println("***** Elements of Queue *********");
		queue.printQueue();
		System.out.println("*********************************");*/
		
		System.out.println("***** Is Queue empty ??? *********");
		System.out.println(queue.isEmpty());
		System.out.println("*********************************");
		
		System.out.println("***** Front of Queue *********");
		System.out.println(queue.front()>-1?queue.front():"can get front of queue :: queue is empty");
		System.out.println("*********************************");

	}

}

package com.myutil.ds.queue;

public class QueueArrayImpl {
	private int front = -1, rear = -1;
	public static final int MAX_SIZE = 5;
	private int[] arr = new int[MAX_SIZE];

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("Queue is full,can not insert data");
		} else if (isEmpty()) {
			front = 0;
			rear = 0;

		} else {
			rear = (rear + 1) % MAX_SIZE;
		}
		arr[rear] = data;
	}

	public int dequeue() {
		int temp = front;
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else if (front == rear) {
			front = -1;
			rear = - -1;
			return arr[temp];
		} else {
			front = (front + 1) % MAX_SIZE;
			int dequedElement = arr[temp];
			arr[temp] = 0;
			return dequedElement;
		}

	}

	public void printQueue() {
		if (!isEmpty()) {
			if (front == 0 && rear<=MAX_SIZE-1) {
				for (int i = front; i <= rear; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			} else {
				for (int i = front; i <= MAX_SIZE-1; i++) {
					if (arr[i] != 0){
						System.out.print(arr[i] + " ");
					}	
				}
				for (int i = 0; i <= front - 1; i++) {
					if (arr[i] != 0) { // if that position not used then default value is 0
						System.out.print(arr[i] + " ");
					}

				}
				System.out.println();

			}

		}

		else {
			System.out.println("Can not print :: queue is empty");
		}
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1) {
			return true;
		} else {
			return false;
		}
	}

	public int front() {
		return front == -1 ? -1 : arr[front];
	}

	private boolean isFull() {
		return (rear + 1) % MAX_SIZE == front ? true : false;
	}

}

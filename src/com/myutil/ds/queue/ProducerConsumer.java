package com.myutil.ds.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProducerConsumer {
	Queue queue = new PriorityQueue<Integer>();
	int capacity = 4;

	public void produce() throws InterruptedException {
		int val = 0;
		while (true) {
			synchronized (this) {
				// producer thread waits while list is full
				while (queue.size() == capacity) {
					wait();
				}
				System.out.println("Producer produced-" + val);
				queue.add(val++);
				// notifies the consumer thread that now it can start consuming
				notify();

				Thread.sleep(1000);

			}
		}
	}

	public void consume() throws InterruptedException {
		int val = 0;
		while (true) {
			synchronized (this) {
				// consumer thread waits while list is empty
				while (queue.size() == 0) {
					wait();
				}
				System.out.println("Consumer consumed-" + queue.remove());

				// notifies the producer thread that now it can start producing
				notify();

				Thread.sleep(1000);

			}
		}
	}

}

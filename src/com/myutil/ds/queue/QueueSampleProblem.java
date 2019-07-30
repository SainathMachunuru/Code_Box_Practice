package com.myutil.ds.queue;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueSampleProblem {
	static LinkedList<Integer> queue = new LinkedList<Integer>();

	public static void main(String[] args) {
		System.out.println("Enter number of people in queue: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			addElement(i);
		}

		System.out.println("Enter number of queries: ");
		int q = sc.nextInt();
		String[] queryList = new String[q];
		System.out.println("Enter queries: ");
		for (int i = 0; i < q; i++) {
			queryList[i] = sc.next();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < queryList.length; i++) {

			int queryType = Character.getNumericValue(queryList[i].charAt(0));
			int data = Character.getNumericValue(queryList[i].charAt(1));

			switch (queryType) {
			case 1: {
				removeFirstElement();
				break;

			}
			case 2: {
				removeElemnt(data);
				break;

			}
			case 3: {
				sum += getIndexOfSpecificEle(data);
			}

			}

		}
		System.out.println("sum: " + sum);

	}

	public static void addElement(int data) {
		queue.add(data);

	}

	public static void removeElemnt(int data) {

		queue.removeFirstOccurrence(data);
	}

	public static void removeFirstElement() {
		queue.poll();
	}

	public static int getIndexOfSpecificEle(int data) {
		return queue.indexOf(data) + 1;

	}

}

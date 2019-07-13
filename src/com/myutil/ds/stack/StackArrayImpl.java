package com.myutil.ds.stack;

public class StackArrayImpl {
	public static final int MAX_SIZE = 10;
	private int arr[] = new int[MAX_SIZE];
	private int top = -1;

	public void push(int data) {
		top += 1;
		if (top >=arr.length) {
			top-=1;
			System.out.println("Can not push to stack due to overflow");
		} else {
			arr[top] = data;
		}
	}

	public void pop() {
		top -= 1;
	}

	public int top() {	
		return top>-1 ? arr[top]:0;
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	public void printStack() {
		if (top == -1) {
			System.out.println("can not print stack due to underflow");
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println(arr[i]);

			}
		}

	}

}

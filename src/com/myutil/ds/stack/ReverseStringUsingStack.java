package com.myutil.ds.stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String input = "sainath";
		char[] inputArray = input.toCharArray();
		String reverseString = new String(reverseString(inputArray));
		System.out.println(reverseString);

	}

	private static char[] reverseString(char[] inputArray) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < inputArray.length; i++) {
			stack.push(inputArray[i]);
		}
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = stack.pop();
		}
		return inputArray;

	}

}

package com.myutil.ds.stack;

import java.util.Stack;

public class Balancedparentheses {

	public static void main(String[] args) {
		String input = "[(){)]";
		boolean isBalanced = checkBalancedparentheses(input.toCharArray());
		if (isBalanced) {
			System.out.println("given parentheses balanced");
		} else {
			System.out.println("given parentheses not balanced");
		}

	}

	private static boolean checkBalancedparentheses(char[] arr) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
				stack.push(arr[i]);

			} else {
				boolean test = false;
				if (stack.isEmpty()) {
					return false;

				} else {
					if (arr[i] == ']') {
						test = stack.peek().equals('[');
					} else if (arr[i] == '}') {
						test = stack.peek().equals('{');
					} else if (arr[i] == ')') {
						test = stack.peek().equals('(');
					}
				}

				if (!test) {
					return false;
				} else {
					stack.pop();
				}

			}

		}
		return stack.isEmpty() ? true : false;

	}

}

package com.myutil.ds.stack;

import java.util.Stack;

public class PrefixEvaluationImpl {
	public static void main(String args[]) {
		String input = "-+*23*549";
		System.out.println("postfix evaluation: " + evaluatePretfix((input.toCharArray())));

	}

	private static int evaluatePretfix(char[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = arr.length-1; i>=0 ; i--) {
			char ch = arr[i];

			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				switch (ch) {
				case '+': {
					stack.push(operand1 + operand2);
					break;
				}
				case '-': {
					stack.push(operand1 - operand2);
					break;
				}
				case '*': {
					stack.push(operand1 * operand2);
					break;
				}
				case '/': {
					stack.push(operand1 / operand2);
					break;
				}

				}

			}

		}
		return stack.peek();
	}


}

package com.myutil.ds.stack;

import java.util.Stack;

public class PostFixEvaluationImpl {
	public static void main(String args[]) {
		String input = "23*54*+9-";
		System.out.println("postfix evaluation: " + evaluatePostfix((input.toCharArray())));

	}

	private static int evaluatePostfix(char[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];

			if (Character.isDigit(ch)) {
				stack.push(ch - '0');
			} else {
				int operand1 = stack.pop();
				int operand2 = stack.pop();
				switch (ch) {
				case '+': {
					stack.push(operand2 + operand1);
					break;
				}
				case '-': {
					stack.push(operand2 - operand1);
					break;
				}
				case '*': {
					stack.push(operand2 * operand1);
					break;
				}
				case '/': {
					stack.push(operand2 / operand1);
					break;
				}

				}

			}

		}
		return stack.peek();
	}

}

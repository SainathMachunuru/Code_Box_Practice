package com.myutil.ds.stack;

import java.util.Stack;

public class InfixToPostfixImpl {
	public static void main(String args[]) {
		String infix = "((a+b)*c-d)*e";
		System.out.println("postfix expression: " + convertToPostfix(infix.toCharArray()));
	}

	private static String convertToPostfix(char[] infix) {
		String res = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < infix.length; i++) {
			char ch = infix[i];
			if (Character.isDigit(ch) || Character.isLetter(ch)) {
				res += ch;

			}
			else if(ch == '(') {
				stack.push(ch);
				
			}
			else if(ch == ')') {
				while(!stack.empty() && stack.peek()!='(') {
					res+=stack.peek();
					stack.pop();
					
				}
				stack.pop();
				
			}

			else {
				while (!stack.empty() && precedance(ch)<=precedance(stack.peek())) {
					res += stack.peek();
					stack.pop();

				}
				stack.push(ch);
			}

		}
		while (!stack.empty()) {
			res += stack.peek();
			stack.pop();

		}

		return res;
	}
	private static int precedance(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

	/*private static boolean hasHigherPresedence(char peek, char ch) {
		if ((ch == '+' || ch == '-') && (peek == '*' || peek == '/' || peek == '+' || peek == '-')) {
			return true;

		} else {
			return false;
		}

	}*/

}

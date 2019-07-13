package com.myutil.ds.stack;

public class StackMain {

	public static void main(String[] args) {

		StackArrayImpl stack = new StackArrayImpl();

		stack.push(2);
		stack.push(4);
		stack.push(6);
		stack.push(8);
		
		System.out.println("***** Elements of Stack *********");
		stack.printStack();
		System.out.println("*********************************");

		stack.pop();
		stack.push(10);
		
		System.out.println("***** Elements of Stack *********");
		stack.printStack();
		System.out.println("*********************************");
		
		System.out.println("***** Top of Stack *********");
		System.out.println(stack.top()>0?stack.top():"can get top of stack :: stack is empty");
		System.out.println("*********************************");
		
		System.out.println("***** Is Stack empty ??? *********");
		System.out.println(stack.isEmpty());
		System.out.println("*********************************");

	}

}

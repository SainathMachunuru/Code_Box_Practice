package com.myutil.java8features;

/**
 * 
 * Functional interfaces are new concept introduced in Java 8.
 *  An interface with exactly one abstract method becomes Functional Interface. 
 *
 */
public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		Interface1 i1 = (s) -> System.out.println(s);
		i1.method1("Testing functional interface using lambd expression");
		
		//Runnable interface using lamda expression
		Runnable r1 = () -> {
			System.out.println("My Runnable");
		};
		r1.run();
		
	}

}

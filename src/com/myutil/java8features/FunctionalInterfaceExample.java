package com.myutil.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

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
		
		System.out.println(isPrime(173));
		List<Integer> list =new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(9);
		System.out.println(findSquareOfMaxOdd(list));
		
	}
	//Prime number loguc uisng lamda
	public static boolean isPrime(int number) {
		return number>1 && IntStream.range(2, number).noneMatch(
				index -> number%index==0);
	}
	//finding highest odd number below 11 and return square of it
	public static int findSquareOfMaxOdd(List<Integer> numbers) {
		return numbers.stream()
				.filter(FunctionalInterfaceExample::isOdd) 		//Predicate is functional interface and
				.filter(FunctionalInterfaceExample::isGreaterThan3)	// we are using lambdas to initialize it
				.filter(FunctionalInterfaceExample::isLessThan11)	// rather than anonymous inner classes
				.max(Comparator.naturalOrder())
				.map(i -> i * i)
				.get();
	}
	
	public static boolean isOdd(int i) {
		return i % 2 != 0;
	}
	
	public static boolean isGreaterThan3(int i){
		return i > 3;
	}
	
	public static boolean isLessThan11(int i){
		return i < 11;
	}

}

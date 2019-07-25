package com.myutil.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Java8StreamExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(15);
		list.add(12);
		list.add(10);
		list.add(8);

		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		System.out.println(sum);

		System.out.println("streams: filter and map " + list.stream().filter(i -> i > 10).mapToInt(i -> i).sum());
		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println(names.map(s -> {
			return s.toUpperCase();
		}).collect(Collectors.toList()));

		System.out.println("streams: allMatch " + list.stream().allMatch(i -> i > 10));

		System.out.println("streams: sum  using reduce " + list.stream().reduce(0, (a, b) -> a + b));
		System.out.println("streams: product  using reduce " + list.stream().reduce(1, (a, b) -> a * b));
		System.out.println("streams: max is using reduce " + list.stream().reduce((a, b) -> a > b ? a : b));

		// creating stream
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);
		// Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4});

		List<Integer> myList = new ArrayList<>();
		for (int i = 0; i < 5; i++)
			myList.add(i);

		// sequential stream
		System.out.println("*****sequential and parallel streams:");
		Stream<Integer> sequentialStream = myList.stream();
		myList.forEach(i -> System.out.print(i + " "));
		System.out.println();
		// parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		myList.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// We can use Stream.generate() and Stream.iterate() methods to create Stream.
		Stream<String> stream1 = Stream.generate(() -> {
			return "abc";
		});
		Stream<String> stream2 = Stream.iterate("abc", (i) -> i);

		// Using Arrays.stream() and String.chars() methods.
		System.out.println("*****Using Arrays.stream() and String.chars() methods.:");
		LongStream is = Arrays.stream(new long[] { 1, 2, 3, 4 });
		IntStream is2 = "abc".chars();
		is.forEach(i -> System.out.print(i + " "));
		System.out.println();
		is2.forEach(i -> System.out.print(i + " "));
		System.out.println();

		// Converting Java Stream to Collection or Array
		System.out.println("*****Converting Java Stream to Collection or Array:");
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
		List<Integer> intList = intStream.collect(Collectors.toList());
		System.out.println(intList);

		intStream = Stream.of(1, 2, 3, 4);
		Map<Integer, Integer> intMap = intStream.collect(Collectors.toMap(i -> i, i -> i + 5));
		System.out.println(intMap);

		Stream<Integer> intStream1 = Stream.of(1, 2, 3, 4);
		Integer[] intArray = intStream1.toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray)); // prints [1, 2, 3, 4]

		// sorting using streams
		System.out.println("*****sorting using streams:");
		Stream<String> names2 = Stream.of("aBc", "d", "ef");
		List<String> naturalSorted = names2.sorted().collect(Collectors.toList());
		System.out.println(naturalSorted);

		System.out.println("*****sorting using streams:");
		Stream<Integer> names3 = Stream.of(4, 2, 8, 3, 9, 4, 6, 2);
		List<Integer> reverseOrder = names3.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseOrder);

		//FLAT MAP
		System.out.println("*****use flatMap() to create a stream from the stream of list:");
		Stream<List<String>> namesOriginalList = Stream.of(Arrays.asList("Pankaj"),
															Arrays.asList("David", "Lisa"),
															Arrays.asList("Amit"));
		// flat the stream from List<String> to String stream
		Stream<String> flatStream = namesOriginalList.flatMap(strList -> strList.stream());

		flatStream.forEach(System.out::println);

	}

}

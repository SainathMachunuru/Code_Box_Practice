package com.myutil.ds.array;

public class ArrayCodeBox {
	public int contiguousSubArrayWithMaximumSum(int arr[]) {
		int max_so_far = 0, max_end_here = 0;
		for (int i = 0; i < arr.length; i++) {
			max_end_here += arr[i];
			if (max_end_here < 0) {
				max_end_here = 0;
			} else if (max_so_far < max_end_here) {
				max_so_far = max_end_here;

			}
		}
		return max_so_far;
	}

	/*
	 * You are given a list of n-1 integers and these integers are in the range of 1
	 * to n. There are no duplicates in list. One of the integers is missing in the
	 * list.This method will find missing element in the list
	 */
	public int getMisssingNumber(int arr[], int n) {
		int sum = (n + 1) * (n + 2) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum -= arr[i];
		}
		return sum;
	}

	public int findSubArrayWithGivenSum(int arr[], int sum) {
		int currentSum = arr[0], start = 0;
		for (int i = 1; i <= arr.length; i++) {
			while (currentSum > sum && start < i - 1) {
				currentSum -= arr[start];
				start++;

			}
			if (currentSum == sum) {
				int endIndex = i - 1;
				System.out.println("Sum found between indexes: " + start + " and " + endIndex);
				return 1;
			}
			if (i < arr.length) {
				currentSum += arr[i];

			}
			
		}
		System.out.println("No sub array found with given sum");
		return 0;

	}

}

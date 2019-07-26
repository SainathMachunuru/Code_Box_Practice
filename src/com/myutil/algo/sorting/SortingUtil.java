package com.myutil.algo.sorting;

public class SortingUtil {
	/**
	 * 
	 * In-Place sorting algoritham,Time complexity O(n^2)
	 */
	public void selectionSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			print(arr, i);

		}

	}

	public void print(int arr[], int pass) {
		System.out.print("pass " + (pass + 1) + ":: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}

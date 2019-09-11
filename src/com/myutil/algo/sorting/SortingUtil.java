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

	/**
	 * 
	 * In-Place sorting algoritham,Time complexity O(n^2)
	 */
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int falg = 0;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					falg = 1;
				}

			}
			if (falg == 0) {
				break;
			}
			print(arr, i);

		}

	}

	/**
	 * 
	 * In-Place sorting algoritham,Time complexity O(n^2)
	 */
	public void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int temp = arr[j];
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;

			}
			arr[j] = temp;
			print(arr, i - 1);

		}

	}
	/**
	 * Divide and conquer , recursive approach
	 * Stable sort:	maintain the order of elements with same value in orginal array
	 * Not in-place sort : need extra memory
	 * Space complexity O(n)
	 * Time complexity O(nlogn)
	 * 
	 */
	public void mergeSort(int arr[]) {
		int n = arr.length;
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < n; i++) {
			right[i - mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
		print(arr);

	}

	private void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				k++;
				i++;

			} else {
				arr[k] = right[j];
				k++;
				j++;

			}

		}
		while (i < left.length) {
			arr[k] = left[i];
			k++;
			i++;

		}
		while (j < right.length) {
			arr[k] = right[j];
			k++;
			j++;

		}

	}
	public void quickSort(int arr[],int start,int end) {
		if(start<end) {
			int partitionIndex = partition(arr,start,end);
			quickSort(arr,start,partitionIndex-1);
			quickSort(arr,partitionIndex+1,end);			
		}
		
		//print(arr);
	
	}

	private int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pivotIndex = start;
		for(int i=start;i<end;i++) {
			if(arr[i]<=pivot) {
				//swap(arr,i,pivotIndex);
				int temp = arr[i];
				arr[i] = arr[pivotIndex];
				arr[pivotIndex] = temp;
				pivotIndex++;
			}
			
		}
		int temp = arr[pivotIndex];
		arr[pivotIndex] = arr[end];
		arr[end] = temp;
		//swap(arr,pivotIndex,end);
		return pivotIndex;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	public void print(int arr[], int pass) {
		System.out.print("pass " + (pass + 1) + ":: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}

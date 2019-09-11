package com.myutil.algo.sorting;

public class SortingUtilMain {
	public static void main(String[] args) {
		int arr[] = {7,2,1,6,8,5,3,4};
		//new SortingUtil().selectionSort(arr);
		//new SortingUtil().bubbleSort(arr);
		//new SortingUtil().insertionSort(arr);
		//new SortingUtil().mergeSort(arr);
		new SortingUtil().quickSort(arr, 0, arr.length-1);
		new SortingUtil().print(arr);
		
		
	}

}

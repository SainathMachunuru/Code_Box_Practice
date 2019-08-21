package com.myutil.algo.sorting;

public class SortingUtilMain {
	public static void main(String[] args) {
		int arr[] = {2,4,1,6,8,5,3,7};
		//new SortingUtil().selectionSort(arr);
		//new SortingUtil().bubbleSort(arr);
		//new SortingUtil().insertionSort(arr);
		new SortingUtil().mergeSort(arr);
	}

}

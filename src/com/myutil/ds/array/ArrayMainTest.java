package com.myutil.ds.array;

import java.util.Arrays;

public class ArrayMainTest {
	public static void main(String args[]) {

		/*int contiguousSubArrayWithMaximumSum = new ArrayCodeBox()
				.contiguousSubArrayWithMaximumSum(new int[] { 2, 3, -2, 4, -6 });
		System.out.println("contiguousSubArrayWithMaximumSum: " + contiguousSubArrayWithMaximumSum);

		int missingElement = new ArrayCodeBox().getMisssingNumber(new int[] { 1, 2, 3, 5, 6 }, 5);
		System.out.println("missingElement: " + missingElement);*/
		int arr[][]= {{1,2,3},{4,5,6,},{7,8,9}};
		
		//int subArrayWithGivenSum = new ArrayCodeBox().findSubArrayWithGivenSum(new int[] {15,6,3,1,8},10);
		arr = new ArrayCodeBox().roatateMatrixBy90Degree(arr);
		//System.out.println(Arrays.toString(arr));

	}

}

package com.myutil.ds.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMainTest {
	public static void main(String args[]) {

		/*int contiguousSubArrayWithMaximumSum = new ArrayCodeBox()
				.contiguousSubArrayWithMaximumSum(new int[] { 2, 3, -2, 4, -6 });
		System.out.println("contiguousSubArrayWithMaximumSum: " + contiguousSubArrayWithMaximumSum);

		int missingElement = new ArrayCodeBox().getMisssingNumber(new int[] { 1, 2, 3, 5, 6 }, 5);
		System.out.println("missingElement: " + missingElement);*/
		//int arr[][]= {{1,2,3},{4,5,6,},{7,8,9}};
		
		//int subArrayWithGivenSum = new ArrayCodeBox().findSubArrayWithGivenSum(new int[] {15,6,3,1,8},10);
		ArrayList<Integer> temp = new ArrayList<Integer>();
		/*temp.add(2);
		temp.add(1);
		temp.add(2);
		temp.add(0);
		temp.add(0);
		temp.add(2);
		temp.add(0);
		temp.add(1);
		temp.add(2);
		temp.add(0);
		temp.add(1);
		temp.add(2);*/
		temp.add(1);
		temp.add(3);
		temp.add(5);
		temp.add(6);
		int arr[] = {8,1,7,2,3,4};
		//new ArrayCodeBox().findTwoMissingNumberInUnsortedArray(arr);
		//System.out.println(Arrays.toString(new ArrayCodeBox().rotateArray(arr, 2)));
		//System.out.println(new ArrayCodeBox().searchInsert(temp,7));
		
		//new ArrayCodeBox().sortColors(temp);
		//arr = new ArrayCodeBox().roatateMatrixBy90Degree(arr);
		//System.out.println(Arrays.toString(arr));
		new ArrayCodeBox().getAllZeroSumSubArray(new int[] {1,1,3,0,2,-5});
		
		
		
		

	}

}

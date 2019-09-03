package com.myutil.ds.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

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
	public int[][] roatateMatrixBy90Degree(int[][] arr){
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr = swapPositins(arr,i,j);
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		return arr;
	}

	private int[][] swapPositins(int arr[][],int i, int j) {
		int temp = arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
		if(i==0 && j==2) {
			System.out.println(arr[i][j]+" "+arr[j][i]);
		}
		
		return arr;
		
	}
	//two pointers
	public void sortColors(ArrayList<Integer> a) {
		int[] arr = new int[a.size()];
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i) == 0) {
				zeroCount++;
			}
			else if(a.get(i) == 1) {
				oneCount++;
			}
			else {
				twoCount++;
			}
			arr[i] = a.get(i);
			
		}
		int i=0;
		while(i<a.size()) {
			if(i<zeroCount) {
				arr[i]  = 0;
			}
			else if(i>=zeroCount && i<(zeroCount+oneCount) ){
				arr[i]  = 1;
			}
			else {
				arr[i]  = 2;
			}
			i++;
			
		}
		for(int j=0;j<a.size();j++) {
			System.out.println(arr[j]);
			
			
		}
    }
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 * Given a sorted array and a target value, return the index if the target is found. 
	 * If not, return the index where it would be if it were inserted in order
	 */
	 public int searchInsert(ArrayList<Integer> a, int b) {
         int low =0,high = a.size()-1;
        if(a.get(low)>b) return low;
        if(a.get(high)<b) return high+1;
        while(low<=high){
            int mid = low +(high-low)/2;
            if(a.get(mid)== b) return mid;
            if(a.get(mid)<b) low = mid+1;
            else high = mid-1;
        }
        return low;
    }

	public int[] rotateArray(int[] arr, int k) {
		for (int i = 0; i < k; i++) {
			int temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];

			}
			arr[arr.length - 1] = temp;

		}

		return arr;

	}

	public void findTwoMissingNumberInUnsortedArray(int arr[]) {
		// Arrays.sort(arr);
		int size = arr.length + 2;
		boolean[] temp = new boolean[size + 1];

		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]] = true;
		}
		for (int i = 1; i <= size; i++) {
			if (!temp[i]) {
				System.out.println(i);

			}

		}

	}
	/** Given an array of integers, 
	 * return indices of the two numbers 
	 * such that they add up to a specific target. 
	 */
	public int[] twoSum(int nums[], int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public boolean isZeroSumSubArray(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum == 0 || arr[i] == 0 || map.get(sum)!=null) {
				return true;
				
			}
			map.put(sum, i);
			
		}
		return false;
		
	}
	public void getAllZeroSumSubArray(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum == 0) {
				System.out.println(0+" "+i);
				//return true;
				
			}
			else if(arr[i] == 0 ) {
				System.out.println(i+" "+i);
				
			}
			else if(map.get(sum)!=null) {
				int temp = map.get(sum)+1;
				System.out.println(temp+" "+i);
				
			}
			map.put(sum, i);
			
		}
		//return false;
		
	}
	

}

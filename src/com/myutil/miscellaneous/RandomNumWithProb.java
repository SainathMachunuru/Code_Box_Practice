package com.myutil.miscellaneous;

import java.util.Random;

public class RandomNumWithProb {

	public static void main(String[] args) {
		int arr[] = {10,20,30};
		int frrq[] = {2,3,1};
		int pre[] = {2,5,6};
		for(int i=0;i<6;i++) {
			int num = new Random().nextInt(6)+1;
			int index = findIndex(pre,num);
		
			System.out.println("randomNum: "+num+" number from arr: "+arr[index]);	
		}
	}
	

	private static int findIndex(int[] pre, int num) {
		int low = 0,high = pre.length-1,mid;
		while(low<high) {
			mid = (low+high)/2;
			if(num>pre[mid]) {
				low = mid+1;	
			}
			else {
				high = mid;
				
			}
			
		}
		return (pre[low] >= num) ? low : -1; 
	}


}

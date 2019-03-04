package com.myutil.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class SubArrayCheck {
	public static void main(String args[]) {
		int[] array1 = {1,2,3,4,5,6,7,8};
		int[] array2 = {3,4,5,6,9};
		HashSet<Integer> numMap = new HashSet<>();
		for(int i=0;i<array1.length;i++) {
			numMap.add(array1[i]);
		}
		boolean status = true;
		for(int i=0;i<array2.length;i++) {
			if(!numMap.contains(array2[i])) {
				status = false;
			}
		}
		if(status == true) {
			System.out.println("[YES] The given sub array is part of parent array");
		}
		else {
			System.out.println("[NO] The given sub array is not part of parent array");
		}
		
		
	}

}

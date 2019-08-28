package com.myutil.miscellaneous;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SingleTonTest {
	public static void main(String[] args) {
		SingleTon s1 = SingleTon.getSingleTon();
		System.out.println(s1.getVal());
		SingleTon s2 = SingleTon.getSingleTon();
		s2.setVal(200);
		System.out.println(s2.getVal());
		System.out.println(s1.getVal());
		
		int res[] = {1,2,3,4};
		int temp[] = new int[res.length+1];
		//System.out.println(temp.length);
		temp  = Arrays.copyOfRange(res, 1, 5); 
		System.out.println(temp.length);
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
			
		}
	}

}
class SingleTon{
	private  int val;
	private static SingleTon ob = null;
	private SingleTon() {
		this.val = 100;
		
	}
	public static SingleTon getSingleTon() {
		if(ob == null) {
			ob = new SingleTon();
			
		}
		return ob;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
}

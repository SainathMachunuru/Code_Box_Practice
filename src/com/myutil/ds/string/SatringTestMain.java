package com.myutil.ds.string;

public class SatringTestMain {

	public static void main(String[] args) {
		StringBox stringBox = new StringBox();
		String str = "[}";
		char[] arr  =str.toCharArray();
		//System.out.println(new ParanthesisCheck().areParenthesisBalanced(arr));
		//System.out.println(stringBox.reversingWords("This is stringbox class"));
		
		String str1 = "ABCD"; 
        int n = str1.length(); 

       
       stringBox.permute(str1, 0, n-1); 

	}

}

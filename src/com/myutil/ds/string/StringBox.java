package com.myutil.ds.string;

public class StringBox {
	public String reversingWords(String str) {
		String[] strArray = str.split(" ");
		String reversed = "";
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.println(strArray[i]);
			reversed += strArray[i]+" ";
		}
		return reversed;
	}
	public void permute(String str, int l, int r) 
    { 
        if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
	public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 

}

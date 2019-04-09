package com.myutil.ds.string;

public class countAndSay {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(new countAndSay().countAndSay(7));

	}
	
	 public String countAndSay(int A) {
	        String res = "1";
	        for(int i=1;i<A;i++){
	        	// System.out.println(res);
	            if(res.equals("1")){
	                res = "11";
	            }
	            else{
	                 res = updateSeq(res);
	            }
	           
	           
	        }
	        return res;
	    }
	    public String updateSeq(String str){
	        int count = 0;
	        char ch = str.charAt(0);
	        String temp = "";
	        int i=0;
	        if(str.length()>2) {
	        	 while(i<str.length()-1){
	 	            if(str.charAt(i) == ch){
	 	                count++;
	 	            }
	 	            if(str.charAt(i+1)!=ch){
	 	            	 temp=temp+String.valueOf(count)+ch;
	 	               
	 	                count=0;
	 	                ch=str.charAt(i+1);
	 	            }
	 	           
	 	            i++;
	 	            
	 	        }
	        	 if(str.charAt(str.length()-1) == ch) {
	        		 temp=temp+String.valueOf(count+1)+ch;
	        		 
	        	 }
	        	 
	        	
	        }
	        else {
	        	if(str.charAt(0) == str.charAt(1)) {
	        		temp= temp+"2"+str.charAt(0);
	        	}
	        	else {
	        		for(int j=0;j<str.length();j++) {
		        		temp= temp+"1"+str.charAt(j);
		        		
		        	}
	        		
	        	}
	        	
	        	
	        }
	       
	        return temp;
	        
	        
	    }

}

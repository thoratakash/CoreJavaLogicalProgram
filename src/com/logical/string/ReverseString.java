package com.logical.string;

public class ReverseString {

    public static void main (String[] args) {
    	
    	String str="Akash", rev="";
    	
    	for(int i=0;i<str.length();i++) {
    		char ch=str.charAt(i);
    		rev=ch+rev;
    	}
    	System.out.println(rev);
            
    }//main

}//class






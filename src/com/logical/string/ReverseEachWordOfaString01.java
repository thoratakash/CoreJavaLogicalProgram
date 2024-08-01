package com.logical.string;

public class ReverseEachWordOfaString01 {

	//Approach 01 (Using for loop)
	public static void main(String[] args) {
		
		String str="Welcome to Java";
		
		String word[]=str.split(" ");
		
		String revString="";
		
		for(String w:word) {
			String revWord="";
		
			for(int i=0;i<w.length();i++) {
				char ch=w.charAt(i);
				revWord=ch+revWord;		
			}
			revString=revString+revWord+" ";
		}
		System.out.println(revString);

	}//main

}//class

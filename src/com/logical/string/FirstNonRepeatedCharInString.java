package com.logical.string;

public class FirstNonRepeatedCharInString {

	public static void main(String[] args) {
		
		String str="java Program";
		char firstNonRepeatedChar=' ';
		
		boolean isRepeated=false;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			for(int j=0;j<str.length();j++) {
				if(ch==str.charAt(j) && i!=j) {
					isRepeated=true;
					break;
				}
			}
			if(!isRepeated) {
				firstNonRepeatedChar=ch;
				break;
			}
		}
		
		 if (firstNonRepeatedChar != ' ') {  
	            System.out.println("The first character which is not repeating is: " + firstNonRepeatedChar);  
	        } else {  
	            System.out.println("There is no non-repeating character in the word.");  
	        }  
		

	}//main

}//class

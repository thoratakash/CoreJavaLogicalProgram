package com.logical.string;

public class RemoveSpecialCharInString {

	public static void main(String[] args) {
		
		//ASCII value of capital letter alphabets starts from 65 to 90 (A-Z)
		//the ASCII value of small letter alphabet starts from 97 to 122 (a-z)
		
		//Approach01 (Using ForLoop Method)
		String str="*Ja&va%Pr@og# !ram$";
		String replaceStr=" ";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>64 && str.charAt(i)<=122) {
				replaceStr=replaceStr+str.charAt(i);
			}
		}
		System.out.println(replaceStr);
		
		//Approach02 (replaceAll() Method)
		//String str="*Ja&va%Pr@og# !ram$";
		//String plainStr=str.replaceAll("[^a-zA-Z0-9]", "");
		//System.out.println(plainStr);

	}//main
}//class

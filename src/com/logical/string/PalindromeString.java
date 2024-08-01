package com.logical.string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		
		String revstring="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		    revstring=ch+revstring;	
		}
		//System.out.println(revstring);
		if(str.equals(revstring)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
		sc.close();

	}//main

}//class

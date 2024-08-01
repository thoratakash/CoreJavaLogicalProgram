package com.logical.program;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=4444;
		int org_num=num;
		int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(org_num==rev) {
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("The given number is not Palindrome");
		}

	}//main

}//class

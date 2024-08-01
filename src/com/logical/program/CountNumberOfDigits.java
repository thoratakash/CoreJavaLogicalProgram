package com.logical.program;

public class CountNumberOfDigits {

	//Count Number of digits in a Number
	public static void main(String[] args) {
		
		int num=123456;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digit in a number is : "+count);

	}//main

}//class

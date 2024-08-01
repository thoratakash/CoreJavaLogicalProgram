package com.logical.program;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
		
		int num=1234;
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
		   sum=sum+rem;
		   num=num/10;
		}
		System.out.println("Sum of Digits in a number is : "+sum);
		

	}//main

}//class

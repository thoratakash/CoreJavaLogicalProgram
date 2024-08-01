package com.logical.program;

public class CountEvenOddDigitsInANumber {

	public static void main(String[] args) {
		
		int num=145678;
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Even Number count : "+even_count);
		System.out.println("Odd Number count : "+odd_count);
		

	}//main

}//class

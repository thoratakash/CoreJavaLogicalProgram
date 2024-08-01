package com.logical.program;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt(); // n=5
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of a given number is : " + fact);
		sc.close();

	}// main

}// class

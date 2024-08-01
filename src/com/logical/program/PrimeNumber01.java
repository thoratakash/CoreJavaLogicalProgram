package com.logical.program;

import java.util.Scanner;

public class PrimeNumber01 {

	// Check given number is prime number or not
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		// int n=7;
		int temp = 0;

		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp > 0) {
			System.out.println("The given number is not prime number");
		} else {
			System.out.println("The given number is prime number");
		}

	}// main

}// class

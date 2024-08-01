package com.logical.program;

import java.util.Scanner;

public class ArmstrongNumber {

/*	153->      1             5               3
	            1*1*1 + 5*5*5 + 3*3*3  =153 */
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Armstrong number");
	int num = sc.nextInt();
//int num = 153;
	int org_num = num;
	int r, sum = 0;

	while (num > 0) {
		r = num % 10;
		sum = sum + r * r * r;
		num = num / 10;
	}
	if (org_num == sum) {
		System.out.println("The given number is Armstrong number");
	} else {
		System.out.println("The given number is not Armstrong number");
	}
	sc.close();

}// main

}// class

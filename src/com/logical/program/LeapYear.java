package com.logical.program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leap year");
		int leap = sc.nextInt();

		if ((leap % 400 == 0) || (leap % 4 == 0 && leap % 100 != 0)) {
			System.out.println("The given year is Leap year");
		} else {
			System.out.println("The given year is not Leap year");
		}
		sc.close();

	}

}

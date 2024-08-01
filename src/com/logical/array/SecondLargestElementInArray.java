package com.logical.array;

public class SecondLargestElementInArray {

	public static void main(String[] args) {

		int a[] = { 3, 2, 4, 6, 9, 7 };
		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Second Largest Element in array list is : " + a[1]);

	}// main

}// class

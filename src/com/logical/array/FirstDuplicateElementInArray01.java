package com.logical.array;

public class FirstDuplicateElementInArray01 {

	public static void main(String[] args) {
		int a[] = { 2, 1, 3, 6, 5, 4, 2,1, 6 };

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && i != j) {
					System.out.println("First Duplicate Element is : "+a[i]);
					temp = temp + 1;
					break;
				}
				if (temp > 0) {
					break;
				}
			}
		}

	}//main

}//class

package com.logical.array;

public class MinimumElementInArray {

	public static void main(String[] args) {
		
		int a[]= {7,4,3,6,2,8};
		
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);

	}//main

}//class

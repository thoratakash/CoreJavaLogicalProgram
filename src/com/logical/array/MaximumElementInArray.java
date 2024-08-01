package com.logical.array;

public class MaximumElementInArray {
	
	public static void main(String[] args) {
		
		int a[]= {5,7,4,6,8,9,0};
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
	}//main

}//class

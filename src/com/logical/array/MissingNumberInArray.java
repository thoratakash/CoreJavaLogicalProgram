package com.logical.array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6};
		
		int exp_no_of_elements=a.length+1;
		int total_sum=exp_no_of_elements*(exp_no_of_elements+1)/2;
		System.out.println(total_sum);
		int sum=0;
		for(int i=0;i<a.length;i++) {
		   sum=sum+a[i];	
		}
		System.out.print("Missing number in array is : "+(total_sum-sum));
	

	}//main

}//class

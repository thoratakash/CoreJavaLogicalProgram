package com.logical.array;

public class MaximumSumSubArray {

	//Kadane's Algorithm
	public static void main(String[] args) {
		int a[]= {-2,1,-3,4,-1,2,1,-5,4};
         System.out.println(maxSubSumArray(a));
	}
	public static int maxSubSumArray(int [] a) {
		int sum=0;
		int max_sum=a[0];
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(sum>max_sum) {
				max_sum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return max_sum;
	}//main

}//class

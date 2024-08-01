package com.logical.array;

public class KthLargestElementInArray {

	public static void main(String[] args) {
		
		int a[] = {4,5,8,7,2,9,63,78,12,0};
		int k=4;
		
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1) {
				System.out.println("Kth Largest Element is : "+a[i]);
				break;
			}
		}
	
		System.out.println("Array List : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		

	}//main

}//class

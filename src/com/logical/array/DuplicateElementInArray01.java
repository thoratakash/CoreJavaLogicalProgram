package com.logical.array;

public class DuplicateElementInArray01{
	
	public static void main(String[] args) {
		
		//Brute Force Method
		int a[]= {7,8,2,4,5,8,9,3,2,};
		
		System.out.println("Duplicate Element present in Array : ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.print(a[j]+" ");
				}
			}
		}
				
		
	}//main

}//class

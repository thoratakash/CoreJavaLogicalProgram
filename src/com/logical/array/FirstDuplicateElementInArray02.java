package com.logical.array;

import java.util.HashSet;

public class FirstDuplicateElementInArray02 {

	public static void main(String[] args) {
		int a[]= {6,5,3,1,2,4,5};
		
		int temp=-1;
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=a.length-1;i>0;i--) {
			if(hs.contains(a[i])) {
				temp=i;
			}
			else {
				hs.add(a[i]);
			}
		}
		
		if(temp!=-1) {
			System.out.println("First Duplicate element is  : "+a[temp]);
		}
		else {
			System.out.println("First Duplicate element is not found");
		}

	}//main

}//class

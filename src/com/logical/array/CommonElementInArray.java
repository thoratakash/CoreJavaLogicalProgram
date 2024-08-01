package com.logical.array;

import java.util.HashSet;

public class CommonElementInArray {

	public static void main(String[] args) {
		int a[]= {4,3,7,9,2,4,4,3,3,1,1};
		int b[]= {5,1,4,8,3,4};
		
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Common element present in array is : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					hs.add(a[i]);
				}
			}
		}
		
		for(int num: hs) {
			System.out.print(num+" ");
		}

	}//main

}//class

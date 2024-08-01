package com.logical.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray02 {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,50,44,55,22,20,20,20,70,10,10,55};
		
		Set<Integer> set=new HashSet();

		for(int num:a) {
			boolean b=set.add(num); // return true
			if(b==false) {
				System.out.print(num+" ");
			}
		}
		
		
	}//main

}//class

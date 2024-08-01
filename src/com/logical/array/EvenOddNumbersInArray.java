package com.logical.array;

import java.util.ArrayList;

public class EvenOddNumbersInArray {

	public static void main(String[] args) {
		 int a[]= {8,5,10,12,3,1,4};
		 
		 ArrayList<Integer> al1=new ArrayList<Integer>();
		 ArrayList<Integer> al2=new ArrayList<Integer>();
		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]%2==0) {
				al1.add(a[i]);
			 }
			 else {
				al2.add(a[i]);
			 }
		
		 }
		 
		 System.out.println("Even numbers are : ");
		 for(int num:al1) {
			 System.out.print(num+" ");
		 }
		 System.out.println();
		 System.out.println("Odd numbers are : ");
		 for(int num:al2) {
			 System.out.print(num+" ");
		 }

	}

}

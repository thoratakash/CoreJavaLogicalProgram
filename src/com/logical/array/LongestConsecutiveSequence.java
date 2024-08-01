package com.logical.array;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		
		int a[]= {3,9,1,10,4,20,2};
		
		HashSet< Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		
		int longest_leng=0;
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {
				
				int no=a[i];
				while(hs.contains(no)) {
					no++;
				}
				if(longest_leng<no-a[i]) {
					longest_leng=no-a[i];
				}
			}
		}
		System.out.println("Longest consective length is : "+longest_leng);
		

	}//main

}//class

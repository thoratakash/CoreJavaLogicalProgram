package com.logical.string;

public class ReverseEachWordOfaString02 {

	// Approach 02(Using Java build-In function)
	public static void main(String[] args) {

		String str = "Welcome To Java";
		String word[] = str.split("\\s");

		String revWord = "";

		for(String w:word) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			revWord=revWord+sb.toString()+" ";
		}
		System.out.println(revWord);
	}// main

}// class

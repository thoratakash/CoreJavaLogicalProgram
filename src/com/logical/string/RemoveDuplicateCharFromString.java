package com.logical.string;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {

		String str = "akashthoratakash";
		String removeChar = "";

		for (int i = 0; i < str.length(); i++) {
			int j = 0;
			for ( j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					break;
				}
			} // inner loop
			
			if (i == j) {
				removeChar = removeChar + str.charAt(i);
			}
		} // outerloop
		System.out.println(removeChar);

	}// main

}// class

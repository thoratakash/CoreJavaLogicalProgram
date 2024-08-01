package com.logical.string;

public class RemoveAllWhiteSpace {

	public static void main(String[] args) {

		// Approach01 (Using for loop)
		String str = "    ja         va      Prog     ram  ";
		String replaceStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (!Character.isWhitespace(ch)) {
				replaceStr = replaceStr + ch;
			}
		}
		System.out.println(replaceStr);
		
		//Approach 02(Using replaceAll() Method)
		
		System.out.println(str.replace(" ", ""));
	}// main

}// class

package com.logical.string;

import java.util.Arrays;

public class SortStringCharInAlphabeticalOrder01 {

	public static void main(String[] args) {
		
		String str="java";
		
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		str=new String(ch);
		
		System.out.println(str);
		
		

	}//main

}//class

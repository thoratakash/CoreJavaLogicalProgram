package com.logical.string;

public class SortStringCharInAlphabeticalOrder02 {

	public static void main(String[] args) {
		
		String str="PrograM";
		str=str.toLowerCase();
		
		char ch[]=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		str=new String(ch);
		System.out.println(str);
	}//main

}//class

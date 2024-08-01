package com.logical.string;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharInString {

	public static void main(String[] args) {
		
		String input="akash";
		
		Map<Character, Integer> map=new HashMap<>();
		
		char ch[]=input.toCharArray();
		
		for(char singlechar:ch) {
			if(!map.containsKey(singlechar)) {
				map.put(singlechar, 1);		
			}
			else {
				int count=map.get(singlechar);
				map.put(singlechar, count+1);
			}
		
		}
		System.out.println(map);
		
	}//main

}//class

package com.logical.array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInArray03 {

	public static void main(String[] args) {

		int a[] = { 10, 14, 15, 45, 20, 14, 14, 70, 15, 10, 10, 10, 10 };

		Map<Integer, Integer> hm = new HashMap<>();

		for (int num : a) {

			Integer count = hm.get(num);
			if (count == null) {
				hm.put(num, 1);
			} else {
				count = count + 1;
				hm.put(num, count);
			}

		}
		System.out.println("Duplicates elements are : ");
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();

		for (Map.Entry<Integer, Integer> me : es) {
			if (me.getValue() > 1) {
				System.out.print(me.getKey() + " ");
			}
		}

	}// main

}// class

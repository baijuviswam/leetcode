package com.google;

/**
Given an array of integers where every integer occurs three times except for one integer, which only occurs once, find and return the non-duplicated integer.

For example, given [6, 1, 3, 3, 3, 6, 6], return 1. Given [13, 19, 13, 13], return 19.

Do this in O(N) time and O(1) space.
**/


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatingInt {

	public static void main(String[] args) {
		int [] numbers = new int [] {13, 19, 13, 13};
		NonRepeatingInt nri = new NonRepeatingInt();
		System.out.println(nri.getNonRepeatingint(numbers));

	}
	public int getNonRepeatingint(int [] numbers) {
		Map<Integer, Integer>map = new HashMap<>();
		for(int i=0; i<numbers.length; i++) {
			if(!map.containsKey(numbers[i])) {
				map.put(numbers[i], 1);
			}else {
				map.put(numbers[i], map.get(numbers[i])+1);
			}
		}
		for(Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()==1) {
				return m.getKey();
			}
		}
		return -1;
	}
	
}

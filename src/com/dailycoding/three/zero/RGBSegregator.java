package com.dailycoding.three.zero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RGBSegregator {

	public static void main(String[] args) {
		char arr[] = new char[] { 'G', 'B', 'R', 'R', 'B', 'R', 'G' };
		RGBSegregator rgb = new RGBSegregator();
		System.out.println(Arrays.toString(rgb.getRGBSegregated(arr)));
		System.out.println(Arrays.toString(rgb.getRGBSegregatedNew(arr)));
	}

	public char[] getRGBSegregated(char arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] >= arr[i]) {
					char t = arr[j];
					arr[j] = arr[i];
					arr[i] = t;
				}
			}

		}
		return arr;
	}

	public char[] getRGBSegregatedNew(char arr[]) {
		List<Character> ls = new ArrayList<Character>();
		for (char c : arr) {
			ls.add(c);
		}
		Collections.sort(ls, Collections.reverseOrder());
		for (int i = 0; i < ls.size(); i++)
			arr[i] = ls.get(i);
		return arr;
	}
}

package com.dailycoding.three.zero;

import java.util.HashMap;
import java.util.Map;

public class MinimumLengthPalindrome {
	public static void main(String[] args) {
		String s = "race";
		MinimumLengthPalindrome ml = new MinimumLengthPalindrome();
		System.out.println(ml.getMinimulLengthPalindrome(s));

	}

	public Map<String, Integer> getMinimulLengthPalindrome(String s) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		if (isPalindrome(s)) {
			map.put(s, 0);
			return map;
		}

		String s2 = constructPalindrome(s, 0, s.length(), 'F');
		String s3 = constructPalindrome(s, 0, s.length(), 'R');
		
		
			map.put(s2, (s2.length() - s.length()));
			map.put(s3, (s3.length() - s.length()));
	
		return map;
	}

	public String constructPalindrome(String s, int start, int end, char direction) {
		if (end <= 1) {
			return s;
		}
		if (direction == 'F') {
			char pal = s.charAt(end-2);
			return constructPalindrome(s + pal, start, end - 1, 'F');
		} else {
			char pal = s.charAt(start + 1);
			return constructPalindrome(pal + s, start + 2, end - 1, 'R');
		}
	}

	public boolean isPalindrome(String s) {
		boolean isPalindrome = false;
		int i = 0;
		int n = s.length() - 1;
		while (i < s.length()) {
			if (s.charAt(i) == s.charAt(n - i)) {
				isPalindrome = true;
			} else {
				return false;
			}
			i++;
		}
		return isPalindrome;
	}

}

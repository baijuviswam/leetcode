package com.lc.august.google;

import java.util.ArrayList;
import java.util.List;

public class InterestingString {
	List<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		String s = "1a31";
		InterestingString is = new InterestingString();
		System.out.println(is.isIntersting(s));
	}

	public boolean isIntersting(String s) {
		int n = s.length();
		List<String> list = new ArrayList<String>();
		int counter = 0;
		while (n > 0) {
			char c = s.charAt(n-1);
			if (!Character.isDigit(c)) {
				counter++;
			} else {
				if (Character.getNumericValue(c) == counter) {
					list.add(s.substring(n-1));
					counter = 0;
				} else {
					counter++;
					n--;
					continue;
				}
			}
			n--;
		}
		System.out.println(list);
		if(list.isEmpty()) {
			return false;
		}else 
			return true;
	}
	
	/**
	
	public boolean isInterstingR(String s) {
		List<String> response = new ArrayList<String>();
		response=isInterstingRec(s, s.length()-1);
		return response.isEmpty();
	}

	**/
	
	
}

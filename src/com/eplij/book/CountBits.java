package com.eplij.book;

public class CountBits {
	public static void main(String[] args) {
		CountBits cb = new CountBits();
		int x =1001;
		System.out.println(cb.countBits(x));
	}
	
	public short countBits(int x) {
		short numBits = 0;
		while(x!=0) {
			System.out.println("x :"+x);
			numBits+=(x&1);
			System.out.println("numBits :"+numBits);
			x>>>=1;
		}
		return numBits;
	}
}

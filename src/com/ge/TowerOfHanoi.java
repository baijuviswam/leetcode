package com.ge;

/**
 * 
 *  Implement TOH using recursion
 *
 */

public class TowerOfHanoi {

	public TowerOfHanoi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int numberOfDiscs = 4;
		char source = 'A';
		char destination = 'C';
		char intermediate = 'B';
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(numberOfDiscs, source, destination, intermediate);
	}

	public void move(int numberOfDiscs, char from, char to, char inter) {
		if (numberOfDiscs == 1) {
			System.out.println("Moved " + numberOfDiscs + " from " + from + " to " + to);
		} else {
			move(numberOfDiscs - 1, from, inter, to);
			System.out.println("Moved " + numberOfDiscs + " from " + from + " to " + to);
			move(numberOfDiscs - 1, inter, to, from);
		}
	}

}

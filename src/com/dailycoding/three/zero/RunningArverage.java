package com.dailycoding.three.zero;

public class RunningArverage {

	public static void main(String[] args) {
		RunningArverage ra = new RunningArverage();
		int[] numbers = new int [] {2, 1, 5, 7, 2, 0, 5};
		ra.runningAverage(numbers);

	}
	public void runningAverage(int[] numbers) {
		double median =0.0;
		double sum =0;
		for(int i=0; i< numbers.length; i++) {
			sum +=numbers[i];
			median = sum/(i+1);
			System.out.println(i+1+" "+numbers[i] +" "+sum+" "+roundToHalf(median));
		}
		
		
	}
	
	public static double roundToHalf(double d) {
	    return Math.round(d * 2) / 2.0;
	}

}

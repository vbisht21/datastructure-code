package com.datastructures.programs;

public class PowerOfTen {

	public static boolean isPowerOfTen(long input) {
		while (input > 9 && input % 10 == 0) {
			input = input / 10;

		}
		return input == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1000: " + isPowerOfTen(1000));
		System.out.println("20: " + isPowerOfTen(20));
		System.out.println("0: " + isPowerOfTen(0));
		System.out.println("10: " + isPowerOfTen(10));
		System.out.println("100: " + isPowerOfTen(100));
	}

}

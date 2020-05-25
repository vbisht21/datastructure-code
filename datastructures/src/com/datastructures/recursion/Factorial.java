package com.datastructures.recursion;

import java.util.Scanner;

public class Factorial {

	public int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial fact = new Factorial();
		System.out.print("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Factorial is:" + fact.factorial(num));
	}

}

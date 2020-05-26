package com.datastructures.recursion;

public class Fibbonacci {

	/**
	 * Recursive and slow version. Recalculates same value over and over again.
	 * Chokes for n greater than 60
	 */
	public int fibonacciSeriesRecursive(int n) {
		if (n == 1 || n == 0) {
			return n;
		}
		return fibonacciSeriesRecursive(n - 1) + fibonacciSeriesRecursive(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibbonacci fs = new Fibbonacci();
		System.out.println(fs.fibonacciSeriesRecursive(4));
	}

}

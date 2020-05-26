package com.datastructures.programs;

public class ClimbStairs {

	public int climb(int n) {
		if (n <= 2) {
			return n;
		}

		return climb(n - 1) + climb(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbStairs fs = new ClimbStairs();
		System.out.println(fs.climb(5));
	}

}

package com.datastructures.programs;

public class KdaneAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2 };
		int start = 0;
		int end = 0;
		int s = 0;
		int max_So_far = arr[0];
		int max_end_here = 0;
		for (int i = 0; i < arr.length; i++) {
			max_end_here = max_end_here + arr[i];
			if (max_So_far < max_end_here) {
				max_So_far = max_end_here;
				start = s;
				end = i;
			}
			if (max_end_here < 0) {
				max_end_here = 0;
				s = i + 1;
			}
		}
		System.out.println("maximum sub array is" + max_So_far);
		System.out.println("Index for start to end max  sub array is" + "(" + start + "," + end + ")");
	}

}

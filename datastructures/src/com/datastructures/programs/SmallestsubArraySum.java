package com.datastructures.programs;

public class SmallestsubArraySum {

	public static int minSubArrayLength(int[] arr, int k) {

		int start = 0;
		int end = 0;
		int sum = 0;
		int minlength = Integer.MAX_VALUE;

		for (end = 0; end < arr.length; end++) {
			sum = sum + arr[end];

			while (start <= end && sum >= k) {
				minlength = Math.min(minlength, (end - start) + 1);
				sum = sum - arr[start++];
			}
		}
		return (minlength == Integer.MAX_VALUE) ? 0 : minlength;

	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 1, 2, 4, 3 };
		int k = 7;

		System.out.println(SmallestsubArraySum.minSubArrayLength(arr, k));
	}
}
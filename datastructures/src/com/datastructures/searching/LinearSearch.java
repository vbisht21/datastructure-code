package com.datastructures.searching;

//Time complexity is o(n)
public class LinearSearch {

	public static int search(int[] arr, int search) {
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 5, 20, 68, 98, 56, 88 };

		int search = BinarySearch.search(arr, 5);
		if (search == -1) {
			System.out.println("element doesn't exist");
		} else {
			System.out.println("element is present at index " + search);
		}
	}

}

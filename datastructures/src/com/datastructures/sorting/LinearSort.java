package com.datastructures.sorting;

public class LinearSort {

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 5, 75, 9, 88, 56 };
		System.out.println("Linear Sort before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		LinearSort.sort(arr);
		System.out.println("Linear Sort after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

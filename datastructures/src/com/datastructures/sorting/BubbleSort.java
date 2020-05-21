package com.datastructures.sorting;

public class BubbleSort {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 75, 9, 88, 56 };
		System.out.println("Bubble Sort before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		BubbleSort.sort(arr);
		System.out.println("Bubble Sort after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

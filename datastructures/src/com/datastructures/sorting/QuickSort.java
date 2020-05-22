package com.datastructures.sorting;

public class QuickSort {

	public static void sort(int[] arr, int lb, int ub) {
		if (lb < ub) {
			int loc = partition(arr, lb, ub);
			sort(arr, lb, loc - 1);
			sort(arr, loc + 1, ub);
		}
	}

	public static int partition(int[] arr, int lb, int ub) {
		int pivot = arr[lb];
		int start = lb;
		int end = ub;

		while (start < end) {
			while (arr[start] <= pivot) {
				start++;
			}
			while (arr[end] > pivot) {
				end--;
			}
			if (start < end) {
				int temp1 = arr[end];
				arr[end] = arr[start];
				arr[start] = temp1;
			}
		}
		int temp2 = arr[lb];
		arr[lb] = arr[end];
		arr[end] = temp2;
		return end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 5, 75, 9, 88, 56 };
		System.out.println("Quick Sort before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		QuickSort.sort(arr, 0, arr.length - 1);
		System.out.println("Quick Sort after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

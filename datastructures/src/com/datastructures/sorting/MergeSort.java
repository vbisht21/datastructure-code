package com.datastructures.sorting;

public class MergeSort {

	public static void sort(int[] arr, int lb, int ub) {
		if (lb < ub) {
			int mid = (lb + ub) / 2;
			sort(arr, lb, mid);
			sort(arr, mid + 1, ub);
			merge(arr, lb, mid, ub);
		}

	}

	public static void merge(int[] arr, int lb, int mid, int ub) {
		int i = lb;
		int j = mid + 1;
		int k = lb;
		int[] b = new int[arr.length];

		while (i <= mid && j <= ub) {
			if (arr[i] <= arr[j]) {
				b[k] = arr[i];
				i++;
			} else {
				b[k] = arr[j];
				j++;
			}
			k++;
		}
		if (i > mid) {
			while (j <= ub) {
				b[k] = arr[j];
				j++;
				k++;
			}
		} else {
			while (i <= mid) {
				b[k] = arr[i];
				i++;
				k++;
			}
		}
		for (k = lb; k <= ub; k++) {
			arr[k] = b[k];
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 5, 75, 9, 88, 56 };
		System.out.println("array before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		MergeSort.sort(arr, 0, arr.length - 1);
		System.out.println("array after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}

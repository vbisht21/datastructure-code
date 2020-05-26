package com.datastructures.searching;

//Time complexity is o(logn)
public class BinarySearch {

	public static int search(int[] arr, int search) {

		int first = 0;
		int last = arr.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (search == arr[mid]) {
				return mid;
			}
			if (search > arr[mid]) {
				first = mid + 1;
			} else if (search < arr[mid]) {
				last = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 5, 20, 68, 98, 56, 88 };
		 
		int search=BinarySearch.search(arr,88);
		if (search==-1)
		{
			System.out.println("element doesn't exist");
		}
		else
		{
			System.out.println("element is present at index "+search);
		} 
	}

}

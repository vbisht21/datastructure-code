package com.datastructures.programs;

import java.util.HashMap;

public class EqualArrays {

	public static boolean checkEqual(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		if (n1 != n2)
			return false;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr1.length; i++) {
			if (map.get(arr1[i]) == null) {
				map.put(arr1[i], 1);
			} else {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			// to check whether map contain element of arr2 or not
			if (!map.containsKey(arr2[i]))
				return false;
			// to check if element in arr2 appears more times than arr1
			if (map.get(arr2[i]) == 0)
				return false;

			// next time will decrement all the no of times element has
			// occurred.
			// till all elemnt is 0. if not, then arrays is not equal.

			map.put(arr2[i], map.get(arr2[i]) - 1);

		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 3, 5, 2, 5, 2 };
		int arr2[] = { 2, 3, 5, 5, 2 };

		if (checkEqual(arr1, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}

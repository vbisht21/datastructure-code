package com.datastructures.programs;

import java.util.HashMap;

public class UniqueCharacter {

	// Time Complexity o(n2)
	public static int firstApproach(String s) {
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					count++;
					break;
				}
			}
			if (count == 1)
				return i;
		}
		return -1;
	}

	// Time Complexity o(n2)
	public static int secondApproach(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		char[] c = s.toCharArray();
		for (char count : c) {
			if (map.containsKey(count)) {
				map.put(count, map.get(count) + 1);
			} else {
				map.put(count, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (map.get(temp) == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UniqueCharacter.firstApproach("elephant"));
		System.out.println(UniqueCharacter.secondApproach("elephant"));
	}

}

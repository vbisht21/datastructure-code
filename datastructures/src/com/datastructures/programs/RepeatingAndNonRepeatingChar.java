package com.datastructures.programs;

import java.util.HashMap;

public class RepeatingAndNonRepeatingChar {

	public static HashMap<Character, Integer> commonApproach(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		char[] c = s.toCharArray();
		for (char count : c) {
			if (map.containsKey(count)) {
				map.put(count, map.get(count) + 1);
			} else {
				map.put(count, 1);
			}
		}
		return map;

	}

	public static int findFirstNonRepeatedChar(String str) {

		HashMap<Character, Integer> map = commonApproach(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.get(ch) == 1)
				return i;
		}
		return -1;
	}

	public static int findFirstRepeatedChar(String str) {

		HashMap<Character, Integer> map = commonApproach(str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.get(ch) > 1)
				return i;
		}
		return -1;
	}

	public static int findLastRepeatedChar(String str) {

		HashMap<Character, Integer> map = commonApproach(str);
		for (int i = str.length()-1; i >=0; i--) {
			char ch = str.charAt(i);
			if (map.get(ch) > 1)
				return i;
		}
		return -1;
	}

	public static int findLastNoNRepeatedChar(String str) {

		HashMap<Character, Integer> map = commonApproach(str);
		for (int i = str.length()-1; i >=0; i--) {
			char ch = str.charAt(i);
			if (map.get(ch) == 1)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "elephant";
		int index = RepeatingAndNonRepeatingChar.findFirstNonRepeatedChar(str);
		System.out.println("First non repeating character is " + str.charAt(index) + " at index "
				+ RepeatingAndNonRepeatingChar.findFirstNonRepeatedChar(str));

		int index1 = RepeatingAndNonRepeatingChar.findFirstRepeatedChar(str);
		System.out.println("First repeating character is " + str.charAt(index1) + " at index "
				+ RepeatingAndNonRepeatingChar.findFirstRepeatedChar(str));

		int index2 = RepeatingAndNonRepeatingChar.findLastRepeatedChar(str);
		System.out.println("last repeating character is " + str.charAt(index2) + " at index "
				+ RepeatingAndNonRepeatingChar.findLastRepeatedChar(str));
		
		int index3 = RepeatingAndNonRepeatingChar.findLastNoNRepeatedChar(str);
		System.out.println("last non repeating character is " + str.charAt(index3) + " at index "
				+ RepeatingAndNonRepeatingChar.findLastNoNRepeatedChar(str));
	}

}

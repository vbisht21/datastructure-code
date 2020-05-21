package com.datastructures.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Compression {

	public static String compress(String s) {

		HashMap<Character, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		char[] c = s.toCharArray();
		boolean[] visit = new boolean[s.length() - 1];
		for (char count : c) {
			if (map.containsKey(count)) {
				map.put(count, map.get(count) + 1);

			} else {
				map.put(count, 1);
			}
		}
		List<Character> m = new ArrayList();
		for (int i = 0; i < s.length(); i++) {

			char temp = s.charAt(i);

			if (map.containsKey(temp)) {
				if (!m.contains(temp)) {
					sb.append(temp + "" + map.get(temp));
					m.add(temp);
				}
			}

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Compression.compress("abcabcd"));
		System.out.println(Compression.compress("aaabccc"));
		System.out.println(Compression.compress("aaabbb"));
		System.out.println(Compression.compress("wwwwaaadexxxxxxywww"));
	}

}

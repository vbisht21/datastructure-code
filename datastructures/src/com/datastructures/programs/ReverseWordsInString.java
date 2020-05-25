package com.datastructures.programs;

public class ReverseWordsInString {

	public static String reverse(String str) {

		String s[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = s.length - 1; i >= 0; i--) {
			{

				for (int j = s[i].length() - 1; j >= 0; j--) {
					char c = s[i].charAt(j);
					sb.append(c);
				}
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ReverseWordsInString.reverse("Hi how are you"));

	}

}

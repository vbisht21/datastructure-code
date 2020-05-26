package com.datastructures.programs;

import java.util.Scanner;

public class CheckAnagramIsPalindrome {

	//Write a program to check anagram of a word is Palindrome or not?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a String: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		boolean result = checkPalindromeAnagram(str);
		if(result == true)
			System.out.println("Palindrome Anagram of the string EXISTS");
		else
			System.out.println("Palindrom Anagram of the string DOESN'T EXIST.");
		
	}

	public static boolean checkPalindromeAnagram(String str) {

			int n=str.length();
			
			for(int i=0;i<n/2;i++)
			{
				if(str.charAt(i)!=str.charAt(n-1-i))
				{
					return false;
				}
			}
	return true;
	}
}
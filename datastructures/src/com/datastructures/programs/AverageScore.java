package com.datastructures.programs;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of subject");
		int number=scn.nextInt();
		Float sum=0.0f;
		int[] score=new int[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter the marks");
			score[i]=scn.nextInt();
			sum+=score[i];
		}
		System.out.println("the average score is : "+sum/number );
	
		
	}

}

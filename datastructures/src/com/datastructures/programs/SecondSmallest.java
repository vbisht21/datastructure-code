package com.datastructures.programs;

public class SecondSmallest {

	public static int findSmallest(int [] arr)
	{
	int n=arr.length-1;
	int first=0;
	int second=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>first)
		{
			second=first;
			first=arr[i];
		}
		else if(arr[i]>second)
		{
			second=arr[i];
		}
	}
	return second;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr={10,20,58,30,70,1};
		System.out.println(SecondSmallest.findSmallest(arr));
	}

}

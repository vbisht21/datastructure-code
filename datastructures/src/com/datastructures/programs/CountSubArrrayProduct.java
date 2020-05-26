package com.datastructures.programs;

public class CountSubArrrayProduct {

	public static int countSubArray(int [] arr,int k)
	{
		int result=0;
		int start=0;
		int end=0;
		int prod=1;
		
		for(end=0;end<arr.length;end++)
		{
			prod=prod*arr[end];
			
			while(prod>k && start<end)
			{
				prod=prod/arr[start++];
			}
			if(prod<k)
			{
				int count=end-start+1;
				result=result+count;
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{1},{9},{2},{8},{6},{4},{3},{1,9},{1,9,2},........etc
		int arr[] = {1,9,2,8, 6, 4,3};
		int k = 100;
		
		System.out.println(CountSubArrrayProduct.countSubArray(arr,100));
	}

}

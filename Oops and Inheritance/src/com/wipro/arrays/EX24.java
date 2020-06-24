package com.wipro.arrays;

import java.util.Arrays;
public class EX24 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=Integer.parseInt(args[i+1]);
		}
		Arrays.sort(arr);
		System.out.println("Minimum value is "+arr[0]);
		System.out.println("Maximum value is "+arr[n-1]);
	}
}
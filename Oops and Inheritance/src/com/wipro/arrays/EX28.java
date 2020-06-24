package com.wipro.arrays;

import java.util.Arrays;

public class EX28 
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
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}
}
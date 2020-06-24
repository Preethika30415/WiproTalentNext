package com.wipro.arrays;

import java.util.Arrays;
public class EX27 
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
		System.out.println("the smallest two numbers are "+arr[0]+" "+arr[1]);
		System.out.println("the largest two numbers are "+arr[n-2]+" "+arr[n-1]);
	
	}
}
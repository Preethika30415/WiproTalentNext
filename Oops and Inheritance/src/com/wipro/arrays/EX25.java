package com.wipro.arrays;

public class EX25 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=Integer.parseInt(args[i+1]);
		}
		int d=Integer.parseInt(args[n+1]);
		int g=0;
		for(int i=0;i<n;i++) 
		{
			if(d==arr[i]) 
			{
				System.out.println(i);
				g = 1;
				break;
			}
		}
		if(g==0) 
		{
			System.out.println("-1");
		}
	}
}
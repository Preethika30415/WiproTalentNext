package com.wipro.arrays;

public class EX32 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		int arr[]=new int[n];
		for(int i=0;i<n;i++) 
		{
			arr[i]=Integer.parseInt(args[i+1]);
		}
		int b[] = new int[n];
		int j=0;
		for(int i=0;i<n;i++) 
		{
			if(arr[i]%2==0) {
			b[j++]=arr[i];
		}
	}
		for(int i=0;i<n;i++) 
		{
			if(arr[i]%2!=0) 
			{
				b[j++]=arr[i];
			}
		}
		for(int i=0;i<n;i++) 
		{
			System.out.print(b[i]+" ");
		}
	}
}
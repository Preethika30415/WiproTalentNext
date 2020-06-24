package com.wipro.arrays;

public class EX30 
{
	public static int findIndex(int arr[],int i) 
	{
		int index=0;
		for(int j=i;j<arr.length;j++) 
		{
			if(arr[j]==7) 
			{
				index=j;
				return index;
			}
		}
		return (i-1);
	}
public static void main(String[] args) 
{
	int N=Integer.parseInt(args[0]);
	int arr[]=new int[N];
	for(int i=0;i<N;i++) 
	{
		arr[i]=Integer.parseInt(args[i+1]);
	}
	int sum=0;
	for(int i=0;i<N;i++) 
	{
		if(arr[i]==6) 
		{
			int kl=findIndex(arr,i+1);
			if(kl==i) 
			{
				sum=sum+arr[i];
			}
			else 
			{
				i=kl;
			}
		}
		else 
		{
			sum=sum+arr[i];
		}
	}
	System.out.println(sum);
}
}
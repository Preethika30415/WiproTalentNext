package com.wipro.arrays;

public class EX36 
{
	public static void main(String[] args) 
	{
		int arr[][]=new int[3][3];
		int k=0;
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				arr[i][j]=Integer.parseInt(args[k++]);
			}
		}
		int maximum=arr[0][0];
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(arr[i][j]+" ");
				if(maximum<arr[i][j]) 
				{
					maximum=arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is "+maximum);
	}
}
package com.wipro.arrays;

public class EX35 
{
	public static void main(String[] args) 
	{
		int arr[][]=new int[2][2];
		if(args.length!=4) 
		{
			System.out.print("Please enter 4 integer numbers");
		}
		else 
		{
			int ki=0;
			for(int i=0;i<2;i++) 
			{
				for(int j=0;j<2;j++) 
				{
					arr[i][j]=Integer.parseInt(args[ki++]);
				}
			}
			for(int i=1;i>=0;i--) 
			{
				for(int j=1;j>=0;j--) 
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
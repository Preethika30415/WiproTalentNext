package com.wipro.mettl.day7;

public class EXa_4 
{
	public int nonRepeatDigitsCouont(int input1)
	{
		int count=0,r,i;
		int arr[]=new int[10];
		while(input1>0)
		{
			r=input1%10;
			arr[r]++;
			input1=input1/10;
		}
		for(i=0;i<10;i++)
		{
			if(arr[i]==1)
			{
				count++;
			}
		}
		return count;
	}

}

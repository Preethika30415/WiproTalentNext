package com.wipro.mettl.arrays;

public class MostFrequentlyOccuring 
{
	public int mostFrequentlyOccurringDigit(int[] input1,int input2)
	{
		int[] arr=new int[10];
		int temp=0,max=0,num=0;
		for(int i=0;i<input1.length;i++)
		{
			temp=input1[i];
			while(temp>0)
			{
				arr[temp%10]+=1;
				temp=temp/10;
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
				num=j;
			}
			if(arr[j]==max)
			{
				if(j>num)
				{
					num=j;
					max=arr[j];
				}
			}
		}
		return num;
	}
}
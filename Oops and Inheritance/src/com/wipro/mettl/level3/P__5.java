package com.wipro.mettl.level3;

public class P__5 
{
	public int digitRemove_Palin(int input1)
	{
		int arr[]=new int[10];
		int t=input1;
		int r,rev=0;
		while(input1>0)
		{
			r=input1%10;
			rev=rev*10+r;
			input1/=10;
		}
		if(rev==t)
			return -1;
		input1=t;
		while(input1>0)
		{
			arr[input1%10]++;
			input1/=10;
		}
		int index=-1,i;
		for(i=0;i<10;i++)
		{
			if(arr[i]%2==1)
			{
				index=i;
			}
		}
		System.out.println(index);
		return index;
	}
}

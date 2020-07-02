package com.wipro.mettl.day8;

public class E_3
{
	public int OddDigitsSum(int input1)
	{
		int r,sum=0;
		while(input1>0)
		{
			r=input1%10;
			if(r%2==1)
			{
				sum=sum+r;
			}
			input1=input1/10;
		}
		return sum;
	}

}

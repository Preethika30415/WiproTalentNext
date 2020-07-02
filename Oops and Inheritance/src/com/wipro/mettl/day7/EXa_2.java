package com.wipro.mettl.day7;

public class EXa_2 
{
	public int allDigitsCount(int input1)
	{
		int count=0,r;
		while(input1>0)
		{
			r=input1%10;
			count++;
			input1=input1/10;
		}
		return count;
	}

}

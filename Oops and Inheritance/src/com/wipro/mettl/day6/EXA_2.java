package com.wipro.mettl.day6;

public class EXA_2 
{
	public int nFactorial(int input1)
	{
		int i=1;
		int x=1;
		while(i<=input1)
		{
			x=x*i;
			i++;
		}
		return x;
	}
}

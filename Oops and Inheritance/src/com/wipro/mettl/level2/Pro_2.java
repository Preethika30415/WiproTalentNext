package com.wipro.mettl.level2;

public class Pro_2 
{
	public int sumOfSumsOfDigits(int input1)
	{
		int l=0,c=0,r=0,sum=0;
		while(input1>0)
		{
			r=input1%10;
			c=r+l;
			input1/=10;
			sum=sum+c;
			l=l+r;
		}
		return sum;
	}

}

package com.wipro.mettl.level2;

public class Pro_1 
{
	public int sumOfPowerOfDigits(int input1)
	{
		Integer sum=0,h=0,prev=0;
		Double f1,f2;
		while(input1>0)
		{
			h=Integer.valueOf(input1%10);
			f1=Double.valueOf(h);
			sum+=f1.intValue();
			prev=Integer.valueOf(h);
			input1/=10;
		}
		return sum;
	}

}

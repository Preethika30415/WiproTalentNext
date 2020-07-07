package com.wipro.mettl.level3;

public class P__4 
{
	public int sumOfNonPrimeIndexValues(int[] input1,int input2)
	{
		int sum=input1[0]+input1[1];
		int i,j,flag;
		for(i=3;i<input2;i++)
		{
			flag=1;
			for(j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			System.out.println(flag);
			if(flag==0)
				sum+=input1[i];
		}
		return sum;
	}
}

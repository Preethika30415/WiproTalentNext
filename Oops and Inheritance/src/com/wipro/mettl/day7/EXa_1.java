package com.wipro.mettl.day7;

public class EXa_1 
{
	public int countPrimesInRange(int input1,int input2)
	{
		int d=input1,i,c=0;
		int count=0;
		while(d<=input2)
		{
			for(i=2;i<d;i++)
			{
				if(d%i==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				count++;
				System.out.println(d);
			}
			d++;
			c=0;
		}
		return count;
	}

}

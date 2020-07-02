package com.wipro.mettl.level3;

public class P__2 
{
	public int AddSub(int input1,int input2)
	{
		int g=0;
		if(input2==1)
		{
			for(int i=0;i<=input1;i++)
			{
				if(i%2==0)
				{
					g=g+(input1-i);
				}
				else
					g=g-(input1-i);
			}
		}
		else
		{
			for(int i=0;i<=input1;i++)
			{
				if(i%2==0&&i!=0)
				{
					g=g-(input1-i);
				}
				else
					g=g+(input1-i);
			}
		}
		return g;
	}
}

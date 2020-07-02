package com.wipro.mettl.level3;

public class P__1 
{
	public int seriesN(int input1,int input2,int input3,int input4)
	{
		int i=3,diff=0,next=0;
		while(i<input4)
		{
			diff=input2-input1;
			next=input3+diff;
			input1=input2;
			input2=input3;
			input3=next;
			i++;
		}
		return next;
	}

}

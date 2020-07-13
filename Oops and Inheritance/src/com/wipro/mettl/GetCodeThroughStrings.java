package com.wipro.mettl.strings1;

public class GetCodeThroughStrings 
{
	public int getCodeThroughStrings(String input1)
	{
		String arr[]=input1.split(" ");
		int tot=0,len=0;
		for(int i=0;i<arr.length;i++)
		{
			len+=arr[i].length();
		}
		int sum=0;
		while(len>10)
		{
			tot=len;
			sum=0;
			while(tot>0)
			{
				sum+=tot%10;
				tot/=10;
			}
			len=sum;
		}
		return sum;
	}
}

package com.wipro.mettl.string3;

import java.util.Arrays;

public class TheNambiarNumberGenerator 
{
	public int nnGeenerator(String input1)
	{
		String s=input1;
		int len=s.length();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=(s.charAt(i)-'0');
		}
		System.out.println(Arrays.toString(arr));
		int i=0;
		String temp="";
		int k=arr[i];
		int evenflag,oddflag;
		if(k%2==0)
		{
			evenflag=1;
			oddflag=0;
		}
		else
		{
			evenflag=0;
			oddflag=1;
		}
		while(i<len)
		{
			if(i==len-1)
			{
				System.out.println(k);
				temp+=k;
				break;
			}
			if((k%2!=0)&&(oddflag==1))
			{
				k+=arr[i+1];
				i++;
			}
			else if((k%2==0)&&(oddflag==1))
			{
				k+=arr[i+1];
				i++;
			}
			else
			{
				System.out.println(k+" ");
				temp+=k;
				i=i+1;
				k=arr[i];
				if(k%2==0)
				{
					evenflag=1;
					oddflag=0;
				}
				else
				{
					evenflag=0;
					oddflag=1;
				}
			}
		}
		return Integer.parseInt(temp);
	}
}
package com.wipro.flowcontrols;
public class EX15 
{
	public static void main(String[] args) 
	{
		int fi=0;
		int N= Integer.parseInt(args[0]);
		if(N==2 ||N==3) 
		{
			System.out.println("Prime");
		}
		else 
		{
			for(int i=2;i<=Math.sqrt(N);i++) 
			{
				if(N%i==0) 
				{
					fi=1;
					break;
				}
			}
			if(fi==0) 
			{
				System.out.println("Prime");
			}
			else 
			{
				System.out.println("Not Prime");
			}
		}
	}
}
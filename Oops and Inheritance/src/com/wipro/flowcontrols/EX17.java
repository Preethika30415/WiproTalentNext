package com.wipro.flowcontrols;

public class EX17 
{
	public static void main(String[] args) 
	{
		int fi=0;
		if(args.length==0) 
		{
			System.out.println("Please enter an integer number");
		}
		else 
		{
			int n=Integer.parseInt(args[0]);
			if(n==0 ||n==1) 
			{
				System.out.println(n+" is neither prime nor composite");
			}
			else 
			{
				for(int i=2;i<=Math.sqrt(n);i++) 
				{
					if(n%i==0) 
					{
						fi=1;
						break;
					}
				}
				if(fi==0) 
				{
					System.out.println(n+" is a prime number");
				}
				else 
				{
					System.out.println(n+" is not a prime number");
				}
			}
		}
	}
}
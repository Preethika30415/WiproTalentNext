package com.wipro.flowcontrols;

public class EX21 
{
	public static void main(String[] args) 
	{
		int N= Integer.parseInt(args[0]);
		int p=N;
		int rev=0;
		while(N!=0) 
		{
			int rem=N%10;
			N=N/10;
			rev=rev*10+rem;
		}
		if(p==rev) 
		{
			System.out.println(p+" is a palindrome");
		}
		else 
		{
			System.out.println(p+" is not a palindrome");
		}
	}
}
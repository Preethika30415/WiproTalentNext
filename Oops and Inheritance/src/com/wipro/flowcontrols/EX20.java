package com.wipro.flowcontrols;

public class EX20 
{
	public static void main(String[] args) 
	{
		char[] N= args[0].toCharArray();
		for(int i=N.length-1;i>=0;i--) 
		{
			System.out.print(N[i]);
		}
	}
}
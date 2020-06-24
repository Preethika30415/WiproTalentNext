package com.wipro.flowcontrols;

public class EX9 
{
	public static void main(String[] args) 
	{
		int a= Integer.parseInt(args[1]);
		if(args[0]=="Female") 
		{
			if(a>=1 && a<=58) 
			{
				System.out.println("Percentage of interest is 8.2%");
	        }
			else
			{
				System.out.println("Percentage of interest is 9.2%");
		    }
	    }
		else 
		{
			if(a>=1 && a<=58) 
			{
				System.out.println("Percentage of interest is 8.4%");
		    }
			else 
			{
				System.out.println("Percentage of interest is 10.5%");
		    }
	    }
    }
}
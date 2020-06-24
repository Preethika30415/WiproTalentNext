package com.wipro.flowcontrols;

public class EX10 
{
	public static void main(String[] args) 
	{
		char ch=args[0].charAt(0);
		if(Character.isLowerCase(ch)) 
		{
			char b= Character.toUpperCase(ch);
			System.out.println(ch+"->"+b);
	    }
		else 
		{
			char bt= Character.toLowerCase(ch);
			System.out.println(ch+"->"+bt);
	    }
    }
}
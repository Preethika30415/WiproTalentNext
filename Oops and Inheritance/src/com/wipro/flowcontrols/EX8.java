package com.wipro.flowcontrols;
public class EX8 
{
	public static void main(String[] args) 
	{
		char a=args[0].charAt(0);
		if(Character.isAlphabetic(a)) 
		{
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(a)) 
		{
			System.out.println("Digit");
	    }
		else 
		{
			System.out.println("Special Character");
		}
    }
}
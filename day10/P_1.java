package com.wipro.mettl.day10;

public class P_1 
{
	public String secondWordUpperCase(String input1)
	{
		String s[]=input1.split(" ");
		if(s.length==1)
			return "LESS";
		String s1=s[1];
		s1=s1.toUpperCase();
		return s1;
	}

}

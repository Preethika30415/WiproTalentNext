package com.wipro.mettl.day6;
//import java.io.*;
//import java.util.*;
public class EXA_1 
{
	public int isPrime(int input1)
	{
	int count=0;
	for(int i=1;i<=input1;i++)
	{
		if(input1%i==0)
			count++;
	}
	if(count==2)
		return 2;
	else
		return 1;
}
}

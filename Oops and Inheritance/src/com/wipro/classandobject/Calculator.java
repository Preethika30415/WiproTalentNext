package com.wipro.classandobject;

public class Calculator
{
	public static int powerInt(int num1, int num2) 
	{
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, int num2) 
	{
		return Math.pow(num1, num2);
	}
	public static void main(String[] args) 
	{
		System.out.println(Calculator.powerInt(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		System.out.println(Calculator.powerDouble(Double.parseDouble(args[2]),Integer.parseInt(args[3])));
	}

}

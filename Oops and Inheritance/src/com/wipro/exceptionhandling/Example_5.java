package com.wipro.exceptionhandling;

public class Example_5 {

	public static void main(String[] args) throws Age {
		String name = args[0];
		
		int age = Integer.parseInt(args[1]);
		
		if (age < 18 || age >= 60)
			throw new Age();
		
		System.out.println("Name: " + name + " Age: " + age);
	}

}
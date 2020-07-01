package com.wipro.exceptionhandling;
public class Age extends Exception {
	public Age() {
		super();
		System.out.println("Invalid age");
	}
}
package com.wipro.exceptionhandling;

import java.util.Scanner;

public class Example_1 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < n; i++)
			arr[i]=Integer.parseInt(sc.next());
		
		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
		try {
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
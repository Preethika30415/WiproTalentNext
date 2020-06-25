package com.wipro.abstraction.Compartment;

import java.util.Random;
public class TestCompartment 
{
	public static void main(String[] args) 
	{
		Compartment_1[] compartment = new Compartment_1[10];
		Random rand = new Random();
		for (int i = 0; i < 10; i++) 
		{
		    int randomNum = rand.nextInt((4 - 1) + 1) + 1;
		    if (randomNum == 1)
		    	compartment[i] = new FirstClass();
		    else if (randomNum == 2)
		    	compartment[i] = new Ladies();
		    else if (randomNum == 3)
		    	compartment[i] = new General();
		    else if (randomNum == 4)
		    	compartment[i] = new Luggage();
		    	compartment[i].notice();
		}
	}
}

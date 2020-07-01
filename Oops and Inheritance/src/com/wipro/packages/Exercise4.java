package com.wipro.packages;
import com.automobile.fourwheeler.*;
public class Exercise4 {

	public static void main(String[] args) 
	{
		Logan logan = new Logan("Mahindra Renault Logan", "AP FR 5698", "Sushma", 190);
		System.out.println("Model Name of the Logan car: "+logan.getModelName());
		System.out.println("Owner Name of the Logan car: "+logan.getOwnerName());
		System.out.println("Registration Number of the Logan car: "+logan.getRegistrationNumber());
		System.out.println("Speed of the Logan car: "+logan.speed());
		logan.gps();
		Ford ford = new Ford("Dacia Logan", "AP HG 3901","Srinivasulu", 160);
		System.out.println("Model Name of the Logan car: "+ford.getModelName());
		System.out.println("Owner Name of the Logan car: "+ford.getOwnerName());
		System.out.println("Registration Number of the Logan car: "+ford.getRegistrationNumber());
		System.out.println("Speed of the Logan car: "+ford.speed());
		ford.tempControl();
	}
}


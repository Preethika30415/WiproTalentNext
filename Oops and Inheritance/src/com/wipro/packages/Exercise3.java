package com.wipro.packages;
import com.automobile.vehicle.*;
public class Exercise3 
{
	public static void main(String args[])
	{
		Hero hero = new Hero("Hero HF Deluxe", "AP HF 1357", "Preethika", 120);
		System.out.println("Model Name of the Hero Bike: "+hero.getModelName());
		System.out.println("Owner Name of Hero Bike: "+hero.getOwnerName());
		System.out.println("Registration Number of the Hero Bike: "+hero.getRegistrationNumber());
		System.out.println("Speed of the Hero Bike: "+hero.getSpeed());
		hero.radio();
		Honda honda = new Honda("Honda SP 125", "AP NU 7654", "Honey", 140);
		System.out.println("Model Name of the Honda Bike: "+honda.getModelName());
		System.out.println("Owner Name of Honda Bike: "+honda.getOwnerName());
		System.out.println("Registration Number of the Honda Bike: "+honda.getRegistrationNumber());
		System.out.println("Speed of the Honda Bike: "+honda.getSpeed());
		honda.cdplayer();
	}
	
}
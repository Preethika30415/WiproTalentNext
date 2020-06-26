package com.automobile.vehicle;

public class Hero extends com.automobile.Vehicle
{
	private String modelname;
	private String registrationnumber;
	private String ownername;
	private int speed;
	public Hero(String mn, String rn, String on, int s)
	{
		this.modelname=mn;
		this.registrationnumber=rn;
		this.ownername=on;
		this.speed=s;
	}
	public String getModelName()
	{
			return modelname;
		}
		public String getRegistrationNumber()
		{
			return registrationnumber;
		}
		public String getOwnerName()
		{
			return ownername;
		}
		public int getSpeed()
		{
			return speed;
		}
		public void radio()
		{
			System.out.println("Accessing Radio");
		}
	}

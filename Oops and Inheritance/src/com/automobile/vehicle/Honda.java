package com.automobile.vehicle;

public class Honda {
	private String modelname;
	private String registrationnumber;
	private String ownername;
	private int speed;
	public Honda(String mn, String rn, String on, int s)
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
	public void cdplayer()
	{
		System.out.println("Accessing CD player");
	}
}
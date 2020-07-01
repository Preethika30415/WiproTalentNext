package com.automobile.fourwheeler;

public class Logan extends com.automobile.Vehicle{
	private String modelname;
	private String registrationnumber;
	private String ownername;
	private int speed;
	public Logan(String mn, String rn, String on, int s)
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
	public int speed()
	{
		return speed;
	}
	public void gps()
	{
		System.out.println("Accessing GPS...");
	}
}
package com.automobile.fourwheeler;

public class Ford extends com.automobile.Vehicle{
		private String modelname;
		private String registrationnumber;
		private String ownername;
		private int speed;
		public Ford(String mn, String rn, String on, int s)
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
		public void tempControl()
		{
			System.out.println("Accessing Air Conditioner...");
		}
	}
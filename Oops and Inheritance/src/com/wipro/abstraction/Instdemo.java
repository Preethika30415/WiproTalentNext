package com.wipro.abstraction;

public class Instdemo 
{
	public static void main(String[] args)
	{
		Instrument []inst=new Instrument[10];
		for(int i=0;i<3;i++)
		{
			inst[i]=new Piano();
			inst[i].play();
		}
		for(int i=3;i<7;i++)
		{
			inst[i]=new Flute();
			inst[i].play();
		}
		for(int i=7;i<10;i++)
		{
			inst[i]=new Guitar();
			inst[i].play();
		}
		for(int i=0;i<10;i++)
		{
			if(inst[i] instanceof Piano)
			{
				System.out.println(1+" piano object");
			}
			else if(inst[i] instanceof Flute)
			{
				System.out.println("Flute object");
			}
			else
			{
				System.out.println("Guitar object");
			}
		}
	}
}

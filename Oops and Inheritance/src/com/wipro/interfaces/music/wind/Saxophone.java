package com.wipro.interfaces.music.wind;
import com.wipro.interfaces.music.Playable;
public class Saxophone implements Playable 
{
	@Override
	public void play() 
	{
		System.out.println("Playing Saxophone");
	}

}
package com.wipro.interfaces.music.string;
import com.wipro.interfaces.music.Playable;
public class Veena implements Playable {

	@Override
	public void play() 
	{
		System.out.println("Playing Veena");
	}

}
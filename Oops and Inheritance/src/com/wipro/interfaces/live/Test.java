package com.wipro.interfaces.live;
import com.wipro.interfaces.music.Playable;
import com.wipro.interfaces.music.string.Veena;
import com.wipro.interfaces.music.wind.Saxophone;
public class Test 
{
	public static void main(String[] args) {
		Playable veena = new Veena();
		veena.play();
		
		Playable saxophone = new Saxophone();
		saxophone.play();
	}
}
package edu.es.eoi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class TestMaven {

	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
		
		Player player= new Player(new FileInputStream("src/main/resources/audio.mp3"));
		player.play();
		
	}

}

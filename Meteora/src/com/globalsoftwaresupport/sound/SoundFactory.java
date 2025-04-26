package com.globalsoftwaresupport.sound;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundFactory {

	private Clip clip;
	
	public SoundFactory() {

	}
	
	public void laser() {
		try {
			AudioInputStream laserInpuStream = AudioSystem.getAudioInputStream(new File("resources/sounds/laser.wav").getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(laserInpuStream);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void explosion() {
		try {
			AudioInputStream explosionInpuStream = AudioSystem.getAudioInputStream(new File("resources/sounds/explosion.wav").getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(explosionInpuStream);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
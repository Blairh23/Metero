package com.globalsoftwaresupport.random;

import java.util.Random;
import com.globalsoftwaresupport.constants.Constants;

public class RandomGenerator {

	private Random random;
	
	public RandomGenerator() {
		this.random = new Random();
	}
	
	public boolean isLightStarGenerated() {
		return random.nextDouble() < Constants.STAR_PROBABILITY;
	}
	
	public boolean isMeteorGenerated() {
		return random.nextDouble() < Constants.METEOR_PROBABILITY;
	}
	
	public int generateRandomX() {
		return random.nextInt(Constants.BOARD_WIDTH-2*Constants.SPACESHIP_WIDTH)+Constants.SPACESHIP_WIDTH;
	}
}

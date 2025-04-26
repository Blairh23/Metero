package com.globalsoftwaresupport.objects;

import javax.swing.ImageIcon;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.image.ImageType;
import com.globalsoftwaresupport.image.ImageFactory;

public class Laser extends Sprite {

	public Laser() {

	}
	
	public Laser(int x, int y) {
		this.x = x;
		this.y = y;
		initialize();
	}

	private void initialize() {

		ImageIcon image = ImageFactory.createImage(ImageType.LASER);
		setImage(image.getImage());

		setX(x + Constants.SPACESHIP_WIDTH/2-Constants.LASER_WIDTH/2);
		setY(y-Constants.LASER_HEIGHT);
	}
	
	@Override
	public void move() {
		
		//the laser moves from bottom to the top
		this.y -= Constants.LASER_VERTICAL_TRANSLATION;

		//check constraints: laser dies when hits top of canvas
		if (y < 0) {
			this.die();
		} 
	}
}


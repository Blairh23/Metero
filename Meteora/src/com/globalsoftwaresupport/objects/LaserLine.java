package com.globalsoftwaresupport.objects;

import javax.swing.ImageIcon;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.image.ImageFactory;
import com.globalsoftwaresupport.image.ImageType;

public class LaserLine extends Sprite {

	public LaserLine() {
		initialize();
	}
	
	private void initialize() {
		
		ImageIcon image = ImageFactory.createImage(ImageType.LASER_LINE);
		setImage(image.getImage());

		setX(0);
		setY(Constants.BOARD_HEIGHT-20);
	}

	@Override
	public void move() {
		
		//from bottom to the top
		this.y -= Constants.LASER_LINE_VERTICAL_MOVEMENT;
		
	}

}

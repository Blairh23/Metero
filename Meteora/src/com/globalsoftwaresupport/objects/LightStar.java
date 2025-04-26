package com.globalsoftwaresupport.objects;

import javax.swing.ImageIcon;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.image.ImageFactory;
import com.globalsoftwaresupport.image.ImageType;

public class LightStar extends Sprite {

	public LightStar(int x,int y) {
		this.x = x;
		this.y = y;
		initialize();
	}

	private void initialize() {
		ImageIcon image = ImageFactory.createImage(ImageType.LIGHT);
		setImage(image.getImage());
	}

	@Override
	public void move() {
		//laser star coming from the top toward the bottom of the canvas
		this.y += Constants.STAR_VERTICAL_MOVEMENT;
	}
}

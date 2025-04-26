package com.globalsoftwaresupport.objects;

import javax.swing.ImageIcon;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.image.ImageFactory;
import com.globalsoftwaresupport.image.ImageType;

public class Meteor extends Sprite {

	public Meteor(int x, int y) {
		this.x = x;
		this.y = y;
		initialize();
	}

	private void initialize() {
		ImageIcon image = ImageFactory.createImage(ImageType.METEOR);
		setImage(image.getImage());
	}

	@Override
	public void move() {

		// the meteor moves from top to the bottom
		this.y += Constants.METEOR_VERTICAL_TRANSLATION;
	}
}

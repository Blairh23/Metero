package com.globalsoftwaresupport.image;
import javax.swing.ImageIcon;

import com.globalsoftwaresupport.constants.Constants;

public class ImageFactory {

	public static ImageIcon createImage(ImageType image) {
		
		ImageIcon imageIcon = null;
		
		switch (image) {
		case LASER:
			imageIcon = new ImageIcon(Constants.LASER_IMAGE_URL);
			break;
		case LASER_LINE:
			imageIcon = new ImageIcon(Constants.LASER_LINE_URL);
			break;
		case LIGHT:
			imageIcon = new ImageIcon(Constants.LIGHT_URL);
			break;
		case METEOR:
			imageIcon = new ImageIcon(Constants.METEOR_IMAGE_URL);
			break;
		case BACKGROUND:
			imageIcon = new ImageIcon(Constants.BACKGROUND_IMAGE_URL);
			break;
		case SPACESHIP:
			imageIcon = new ImageIcon(Constants.SPACESHIP_URL);
			break;
		default:
			return null;
		}
		
		return imageIcon;
	}
}

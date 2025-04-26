package com.globalsoftwaresupport.objects;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.image.ImageType;
import com.globalsoftwaresupport.image.ImageFactory;

public class SpaceShip extends Sprite {

	//the little change in the horizontal axis
	private int dx;
	
	public SpaceShip() {
		initilize();
	}
	
	private void initilize() {

		this.dead = false;
		
		ImageIcon imageIcon = ImageFactory.createImage(ImageType.SPACESHIP);
		setImage(imageIcon.getImage());
		
		int initialX = Constants.BOARD_WIDTH/2-Constants.SPACESHIP_WIDTH/2;
		int initialY = Constants.BOARD_HEIGHT - 100;
		
		setX(initialX);
		setY(initialY);
	}

	@Override
	public void move() {
		
		x += dx;

		//can not go beyond the canvas on the left side
        if (x <= 0) {
            x = 0;
        }

        //can not go beyond the canvas on the right
        if (x >= Constants.BOARD_WIDTH-Constants.SPACESHIP_WIDTH) {
            x =Constants.BOARD_WIDTH-Constants.SPACESHIP_WIDTH;
        }
	}

	public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        //going to the left
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        //going to the right 
        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {

    	//we have to handle keyReleased events as well - otherwise the spaceship
    	//would not be able to stand still
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}

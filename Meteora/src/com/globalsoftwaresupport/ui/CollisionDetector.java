package com.globalsoftwaresupport.ui;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.objects.Sprite;

public class CollisionDetector {

	public boolean collisionLightStarSpaceShip(Sprite lightStar, Sprite spaceShip) {

		// spaceship light star collision
		if (lightStar.getX() >= (spaceShip.getX()) && lightStar.getX() <= (spaceShip.getX() + Constants.SPACESHIP_WIDTH)
				&& lightStar.getY() >= (spaceShip.getY())
				&& lightStar.getY() <= (spaceShip.getY() + Constants.SPACESHIP_HEIGHT)) {
			return true;
		}

		return false;
	}

	public boolean collisionLaserLineMeteor(Sprite laserLine, Sprite meteor) {

		//no need to check for x coordinate because the laser line fills the canvas horizontally 
		if (laserLine.getY() >= (meteor.getY()) && laserLine.getY() <= (meteor.getY() + Constants.METEOR_HEIGHT)) {
			return true;
		}

		return false;
	}

	public boolean collisionLaserMeteor(Sprite laser, Sprite meteor) {

		int shotX = laser.getX();
		int shotY = laser.getY();
		int meteorX = meteor.getX();
		int meteorY = meteor.getY();

		if (shotX >= (meteorX) && shotX <= (meteorX + Constants.METEOR_WIDTH) && shotY >= (meteorY)
				&& shotY <= (meteorY + Constants.METEOR_HEIGHT)) {
			return true;
		}

		return false;
	}
	
	public boolean collisionMeteorSpaceShip(Sprite meteor, Sprite spaceShip) {

		int meteorX = meteor.getX();
		int meteorY = meteor.getY();
		int spaceShipX = spaceShip.getX();
		int spaceShipY = spaceShip.getY();

		if (meteorX >= (spaceShipX) && meteorX <= (spaceShipX + Constants.SPACESHIP_WIDTH)
				&& meteorY >= (spaceShipY) && meteorY <= (spaceShipY + Constants.SPACESHIP_HEIGHT)) {
			return true;
		}

		return false;
	}
}

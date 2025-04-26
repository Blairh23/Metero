package com.globalsoftwaresupport.objects;

import java.awt.Image;

public abstract class Sprite {

	protected Image image;
	protected int x;
	protected int y;
	protected boolean dead;

	public abstract void move();
	
	public void die() {
		this.dead = true;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}
}

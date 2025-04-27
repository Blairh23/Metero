package com.globalsoftwaresupport.objects;

import com.globalsoftwaresupport.image.ImageFactory;
import com.globalsoftwaresupport.image.ImageType;

public class EnemyShip extends Sprite{

	private boolean visible = true;
	
	public EnemyShip(int x, int y) {
		this.x = x;
		this.y = y;
		initialize();
	}
	private void initialize() {
		var image = ImageFactory.createImage(ImageType.ENEMYSHIP);
		setImage(image.getImage());
	}
	public void move(int direction) {
		this.x = direction;
	}
	
	public boolean isVisiable() {
		return this.visible;
	}
	
	public void setVisiable(boolean visible) {
		this.visible = visible;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}

package com.globalsoftwaresupport.ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.image.ImageFactory;
import com.globalsoftwaresupport.image.ImageType;
import com.globalsoftwaresupport.objects.EnemyShip;


public class GameSpacePanel extends JPanel {

		private Image Space_Image;
		private List<EnemyShip> enemyShips;
	
		public GameSpacePanel() {
			initializeVariables();
			initializeLayout();
			initializeEnemyShips();
		}


		private void initializeEnemyShips() {
			for(int i = 0; i < Constants.ENEMY_SHIPS_ROW; i++) {
				for(int j = 0; j < Constants.ENEMY_SHIPS_COLUMN; j++) {
					EnemyShip enemyShip = new EnemyShip(Constants.ENEMY_SHIPS_INIT_X + Constants.ENEMY_SHIPS_PADDING * j, 
							Constants.ENEMY_SHIPS_INIT_Y + Constants.ENEMY_SHIPS_PADDING * i);
					enemyShips.add(enemyShip);
				}
			}	
		}


		private void initializeVariables() {
			this.Space_Image = ImageFactory.createImage(ImageType.SPACE_BACKGROUND).getImage();
			this.enemyShips = new ArrayList<>();
			System.out.println(Constants.ENEMY_SHIPS_INIT_X);
			
		}
		
		private void initializeLayout() {
			setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
			setFocusable(true);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			handleCanvas(g);
		}

		private void handleCanvas(Graphics g) {
			this.drawSpace_BG(g);
			this.drawEnemyShips(g);
		}
		
		private void drawEnemyShips(Graphics g) {
			for(EnemyShip enemyShip: enemyShips) {
				if(enemyShip.isVisiable()) {
					g.drawImage(enemyShip.getImage(), enemyShip.getX(), enemyShip.getY(), this); 
				}
			}
		}


		public void drawSpace_BG(Graphics g) {
			g.drawImage(Space_Image, 0, 0, null);
		}
	

	
}

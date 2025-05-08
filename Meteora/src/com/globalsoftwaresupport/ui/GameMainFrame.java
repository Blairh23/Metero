package com.globalsoftwaresupport.ui;

import javax.swing.JFrame;

import com.globalsoftwaresupport.constants.Constants;
import com.globalsoftwaresupport.image.ImageFactory;
import com.globalsoftwaresupport.image.ImageType;

public class GameMainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameMainFrame() {
		initializeLayout();
	}

	private void initializeLayout() {
		
		//add(new GamePanel());
		add(new GameSpacePanel());
		
		pack();
		
		setTitle(Constants.GAME_TITLE);
		setIconImage(ImageFactory.createImage(ImageType.METEOR).getImage());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
	}
}

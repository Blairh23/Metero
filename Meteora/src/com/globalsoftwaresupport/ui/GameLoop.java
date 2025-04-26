package com.globalsoftwaresupport.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLoop implements ActionListener {

	private GamePanel board;
	
	public GameLoop(GamePanel board) {
		this.board = board;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		board.doOneLoop();
	}
}
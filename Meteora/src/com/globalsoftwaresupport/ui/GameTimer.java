package com.globalsoftwaresupport.ui;

import java.util.TimerTask;

public class GameTimer extends TimerTask{

	GameHelperMethods gameHelperMethods = new GameHelperMethods();
	
	@Override
	public void run() {
		printSingleElement();
	}
			
			
	private void printSingleElement() {
		while(gameHelperMethods.hasNext()) {
			System.out.println("Element: " + GameHelperMethods.numbers.get(0));
			GameHelperMethods.numbers.remove(0);
		}
	}
}

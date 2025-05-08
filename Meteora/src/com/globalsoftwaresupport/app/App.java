package com.globalsoftwaresupport.app;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.globalsoftwaresupport.ui.GameMainFrame;

public class App implements Runnable {

	public static void main(String[] args) {
		
		//threads
		App obj = new App();
		Thread thread = new Thread(obj);
		thread.start();
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(() -> {
			new GameMainFrame();
		});
	}

	@Override
	public void run() {
			System.out.println("task 2");	
	}
}

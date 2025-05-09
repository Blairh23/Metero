package com.globalsoftwaresupport.ui;

import java.util.Timer;

public class GameTimerTaskScheduler {
	
	private Timer timer = new Timer();
	
	public void scheduleTask(GameTimer task, long delay, long period) {
		timer.schedule(task, delay, period);
	}
	
	public void scheduleOneTimeTask(GameTimer task, long delay, long period) {
		timer.schedule(task,delay, period);
	}
	
	public void cancel() {
		timer.cancel();
	}

}

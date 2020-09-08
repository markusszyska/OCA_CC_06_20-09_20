package Listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import controller.Controller;

public class MyWindowState implements WindowStateListener{

	Controller c;
	
	
	public MyWindowState(Controller c) {
		this.setC(c);
	}
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		this.getC().onResize();
		System.out.println("yes");
		
	}

	private Controller getC() {
		return c;
	}

	private void setC(Controller c) {
		this.c = c;
	}

}

package Listener;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import controller.Controller;
import gui.Frame.GameArea;

public class MyComponentAdapter implements ComponentListener {

	Controller c;

	public MyComponentAdapter(Controller c) {
		this.setC(c);
	}

	public Controller getC() {
		return c;
	}

	public void setC(Controller c) {
		this.c = c;
	}

	@Override
	public void componentResized(ComponentEvent e) {
			this.getC().onResize();
	}

	@Override
	public void componentMoved(ComponentEvent e) {
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub

	}

}

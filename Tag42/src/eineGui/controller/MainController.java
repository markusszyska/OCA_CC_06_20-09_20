package eineGui.controller;

import java.awt.event.ActionEvent;

import eineGui.gui.MyMainFrame;

public class MainController {
	MyMainFrame mainFrame;
		
	public MyMainFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(MyMainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public MainController() {
		this.setMainFrame(new MyMainFrame());
		
		this.getMainFrame().addActionListenerToLeftButton1(this::leftActionBtn1);
	}
	
	void leftActionBtn1(ActionEvent e) {
		System.out.println("Button 1 gedrueckt");
	}
}

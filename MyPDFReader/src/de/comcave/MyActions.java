package de.comcave;

import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;

public class MyActions {

	private JScrollPane scrollPane;
	
	public MyActions() {
		
	}
	
	
	public MyActions(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}


	public static void exitAction(ActionEvent e) {
		System.exit(0);
	}
	
	public static void clickAction(ActionEvent e) {
		System.out.println("Klick die vierte");
	}
	
	public void readScrollPane(ActionEvent e) {
		System.out.println("Scrollpane :" + scrollPane.getViewport());
	}
}

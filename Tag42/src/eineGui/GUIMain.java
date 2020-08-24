package eineGui;

import java.awt.EventQueue;

import javax.swing.SwingUtilities;



import eineGui.controller.MainController;

public class GUIMain {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->new MainController());		
	}
}

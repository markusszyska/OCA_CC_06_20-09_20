/**
 * 
 */
package main;

import javax.swing.SwingUtilities;

import controller.WelcomeScreenController;
import models.ApplicationModel;
import ui.WelcomeScreen;
import utils.CSVReadWriter;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {			
			@Override
			public void run() {
				try {
					WelcomeScreen welcomeScreen = new WelcomeScreen();
					ApplicationModel appModel = new ApplicationModel();
					WelcomeScreenController welcomeScreenController = new WelcomeScreenController(welcomeScreen,appModel);
					welcomeScreenController.initController();
					
//					CSVReadWriter writer = new CSVReadWriter();
//					writer.writeData("data\\employee.csv");
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

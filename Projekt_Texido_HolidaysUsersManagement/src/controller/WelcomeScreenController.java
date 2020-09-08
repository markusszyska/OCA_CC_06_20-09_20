/**
 * 
 */
package controller;

import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import models.ApplicationModel;
import ui.TermsAndUseScreen;
import ui.WelcomeScreen;

/**
 * @author Lic.Raul Alejandro Salas texido
 *
 */
public class WelcomeScreenController  {
	
	private WelcomeScreen welcomeScreen;
	private ApplicationModel appModel;
	
	public WelcomeScreenController(WelcomeScreen welcomeScreen, ApplicationModel appModel) {
		this.welcomeScreen = welcomeScreen;
		this.appModel = appModel;
		this.initView();
	}
	
	private void initView() {
		welcomeScreen.setBounds(0,0,350,450);
		welcomeScreen.setResizable(false);
		welcomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		welcomeScreen.setVisible(true);
		welcomeScreen.setLocationRelativeTo(null);
	}
	
	public void initController() {this.welcomeScreen.getBtnEnter().addActionListener(e->loginHandle());}
	
	private void loginHandle() {
			String userAuthenticateName = this.welcomeScreen.getTextEmployeeName().getText().trim();
			if(isNotValidInput(userAuthenticateName)) {
				JOptionPane.setDefaultLocale(Locale.ENGLISH);
				JOptionPane.showMessageDialog(null, "You must enter the name");
			}else {
				this.appModel.setUserAuthenticateName(userAuthenticateName);
				//navigate to TermsAndUseScreen
				TermsAndUseScreen termsAndUseScreen = new  TermsAndUseScreen();
				TermAndUseController termUseController = new TermAndUseController(termsAndUseScreen,appModel);
				termUseController.initController();
				welcomeScreen.setVisible(false);
			}
		
	}
	
	private Boolean isNotValidInput(String input) {
		return input.equals("");
	}
	
}

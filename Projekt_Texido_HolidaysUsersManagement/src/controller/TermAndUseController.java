/**
 * 
 */
package controller;

import models.ApplicationModel;
import ui.PrincipalScreen;
import ui.TermsAndUseScreen;

/**
 * @author Lic.Raul Alejandro Salas Texido
 *
 */
public class TermAndUseController{
	private TermsAndUseScreen termsAndUseScreen;
	private ApplicationModel appModel;
	
	public TermAndUseController(TermsAndUseScreen termsAndUseScreen, ApplicationModel appModel) {
		this.termsAndUseScreen = termsAndUseScreen;
		this.appModel = appModel;
		this.initView();
	}
	
	private void initView() {
		termsAndUseScreen.setBounds(0,0,600,360);
    	termsAndUseScreen.setResizable(false);
    	termsAndUseScreen.setVisible(true);
    	termsAndUseScreen.setLocationRelativeTo(null);
	}
	
	
	public void initController() {
		this.termsAndUseScreen.getChAccept().addChangeListener(l->chAcceptState());
		this.termsAndUseScreen.getBtnAccept().addActionListener(l->navigateTo());
	}

	private void navigateTo() {
		PrincipalScreen principalScreen = new PrincipalScreen();
		PrincipalScreenController principalController = new PrincipalScreenController(principalScreen, appModel);
		principalController.initController();
		this.termsAndUseScreen.setVisible(false);
	}

	private void chAcceptState() {
		if(this.termsAndUseScreen.getChAccept().isSelected()) 
		{
			this.termsAndUseScreen.getBtnAccept().setEnabled(true);
			this.termsAndUseScreen.getBtnCancel().setEnabled(false);
		}else {
			this.termsAndUseScreen.getBtnAccept().setEnabled(false);
			this.termsAndUseScreen.getBtnCancel().setEnabled(true);
		}
	}

}

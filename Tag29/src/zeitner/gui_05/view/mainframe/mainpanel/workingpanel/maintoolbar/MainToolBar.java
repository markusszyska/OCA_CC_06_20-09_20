package zeitner.gui_05.view.mainframe.mainpanel.workingpanel.maintoolbar;

import javax.swing.JToolBar;

import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.maintoolbar.exitbutton.ExitButton;


public class MainToolBar extends JToolBar {

	private static final long serialVersionUID = 8788260821736861305L;

	public MainToolBar() {
		super("mainToolBar");
		
		ExitButton exitButton = new ExitButton();
		exitButton.setVisible(true);
				
		super.add(exitButton);
		super.setVisible(true);
	}
}

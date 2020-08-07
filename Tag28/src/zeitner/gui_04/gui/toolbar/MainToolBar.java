package zeitner.gui_04.gui.toolbar;

import javax.swing.JToolBar;

import zeitner.gui_04.gui.button.ExitButton;

public class MainToolBar extends JToolBar {
	public MainToolBar() {
		super("mainToolBar");
		
		ExitButton exitButton = new ExitButton();
		exitButton.setVisible(true);
				
		super.add(exitButton);
		super.setVisible(true);
	}
}

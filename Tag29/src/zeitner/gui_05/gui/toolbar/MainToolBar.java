package zeitner.gui_05.gui.toolbar;

import javax.swing.JToolBar;

import zeitner.gui_05.gui.button.ExitButton;

public class MainToolBar extends JToolBar {

	private static final long serialVersionUID = 4879137291255528966L;

	public MainToolBar() {
		super("mainToolBar");
		
		ExitButton exitButton = new ExitButton();
		exitButton.setVisible(true);
				
		super.add(exitButton);
		super.setVisible(true);
	}
}

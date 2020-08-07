package assmann.taschenrechner.gui.menubar;

import javax.swing.JMenuBar;

import assmann.taschenrechner.gui.menubar.menu.FileMenu;

public class MainFrameMenuBar extends JMenuBar {

	private static final long serialVersionUID = -1436065308964877901L;

	public MainFrameMenuBar() {
		FileMenu fileMenu = new FileMenu();
		super.add(fileMenu);
		super.setVisible(true);
	}
}

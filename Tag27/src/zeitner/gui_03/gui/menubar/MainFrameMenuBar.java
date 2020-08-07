package zeitner.gui_03.gui.menubar;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import zeitner.gui_03.gui.menubar.menu.FileMenu;

public class MainFrameMenuBar extends JMenuBar {
	public MainFrameMenuBar() {
		
		JMenu fileMenu = new FileMenu();
		fileMenu.setVisible(true);
		
		super.add(fileMenu);
		super.setVisible(true);
	}
}

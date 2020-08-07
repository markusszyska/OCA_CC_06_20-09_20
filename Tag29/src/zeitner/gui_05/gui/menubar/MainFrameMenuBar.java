package zeitner.gui_05.gui.menubar;

import javax.swing.JMenuBar;

import zeitner.gui_05.gui.menubar.menu.FileMenu;

public class MainFrameMenuBar extends JMenuBar {

	private static final long serialVersionUID = 1882518306710561949L;

	public MainFrameMenuBar() {
		
		FileMenu fileMenu = new FileMenu();
		fileMenu.setVisible(true);
		
		super.add(fileMenu);
		super.setVisible(true);
	}
}

package zeitner.gui_05.gui.menubar.menu;

import javax.swing.JMenu;

import zeitner.gui_05.gui.menubar.menu.menuitem.ExitItem;

public class FileMenu extends JMenu {

	private static final long serialVersionUID = -2694446278263768595L;

	public FileMenu() {
		super("File");
		
		ExitItem exitItem = new ExitItem();
		exitItem.setVisible(true);
		
		super.add(exitItem);
		super.setVisible(true);
		
	}
}

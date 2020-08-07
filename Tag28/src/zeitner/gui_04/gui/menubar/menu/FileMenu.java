package zeitner.gui_04.gui.menubar.menu;

import javax.swing.JMenu;

import zeitner.gui_04.gui.menubar.menu.menuitems.ExitItem;

public class FileMenu extends JMenu {
	public FileMenu() {
		super("File");
		
		ExitItem exitItem = new ExitItem();
		exitItem.setVisible(true);
		
		super.add(exitItem);
		super.setVisible(true);
		
	}
}

package assmann.taschenrechner.gui.menubar.menu;

import javax.swing.JMenu;

import assmann.taschenrechner.gui.menubar.menu.menuitem.ExitMenuItem;

public class FileMenu extends JMenu {

	private static final long serialVersionUID = -2628427526092631559L;

	public FileMenu() {
		super("File");
		ExitMenuItem exitMenuItem = new ExitMenuItem();
		super.add(exitMenuItem);
		super.setVisible(true);
	}
}

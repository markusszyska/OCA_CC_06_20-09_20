package zeitner.gui_05.view.mainframe.mainframemenubar.filemenu;

import javax.swing.JMenu;

import zeitner.gui_05.view.mainframe.mainframemenubar.filemenu.menuitem.ExitItem;


public class FileMenu extends JMenu {

	private static final long serialVersionUID = 6601697559441938016L;

	public FileMenu() {
		super("File");
		
		ExitItem exitItem = new ExitItem();
		exitItem.setVisible(true);
		
		super.add(exitItem);
		super.setVisible(true);
		
	}
}

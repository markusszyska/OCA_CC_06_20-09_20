package zeitner.gui_05.view.mainframe.mainframemenubar.filemenu.menuitem;

import javax.swing.JMenuItem;

public class ExitItem extends JMenuItem {

	private static final long serialVersionUID = 6690656703076057278L;

	public ExitItem() {
		super("Exit");
		super.addActionListener(new ExitListener());
		super.setVisible(true);
	}
}

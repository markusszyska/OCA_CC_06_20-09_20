package zeitner.gui_05.gui.menubar.menu.menuitem;

import javax.swing.JMenuItem;

import zeitner.gui_05.gui.actionlistener.ExitListener;

public class ExitItem extends JMenuItem {

	private static final long serialVersionUID = -5306482024338760239L;

	public ExitItem() {
		super("Exit");
		super.addActionListener(new ExitListener());
		super.setVisible(true);
	}
}

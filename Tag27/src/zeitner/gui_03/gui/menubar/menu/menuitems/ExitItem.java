package zeitner.gui_03.gui.menubar.menu.menuitems;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import zeitner.gui_03.actionlistener.ExitListener;

public class ExitItem extends JMenuItem {
	public ExitItem() {
		super("Exit");
		super.addActionListener(new ExitListener());
		super.setVisible(true);
	}
}

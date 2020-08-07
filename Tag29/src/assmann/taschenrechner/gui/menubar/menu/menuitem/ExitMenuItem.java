package assmann.taschenrechner.gui.menubar.menu.menuitem;

import javax.swing.JMenuItem;

import assmann.taschenrechner.actionlistener.ExitListener;

public class ExitMenuItem extends JMenuItem {

	private static final long serialVersionUID = 4977789317659636824L;

	public ExitMenuItem() {
		super("Exit");
		super.addActionListener(new ExitListener());
		super.setVisible(true);
	}
}

package zeitner.gui_05.view.mainframe.mainframemenubar.filemenu.menuitem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

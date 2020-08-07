package zeitner.gui_03.gui.button;

import javax.swing.JButton;

import zeitner.gui_03.actionlistener.ExitListener;

public class ExitButton extends JButton {
	public ExitButton() {
		super();
		super.setText("Exit");
		super.addActionListener(new ExitListener());
		super.setVisible(true);
	}
}

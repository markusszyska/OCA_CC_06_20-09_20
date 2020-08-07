package zeitner.gui_05.gui.button;

import javax.swing.JButton;

import zeitner.gui_05.gui.actionlistener.UmschaltListener;
import zeitner.gui_05.gui.label.IDisplay;

public class UmschaltButton extends JButton {

	private static final long serialVersionUID = 819617937313677019L;
	public UmschaltButton(String text, IDisplay display) {
		super();
		super.setText(text);
		super.addActionListener(new UmschaltListener(display));
		super.setVisible(true);
	}
	public UmschaltButton() {
		super();
		//this("StandardText",new Display());
	}
}

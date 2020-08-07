package zeitner.gui_05.gui.label;

import java.awt.Color;

import javax.swing.JLabel;

public class Display extends JLabel implements IDisplay{

	private static final long serialVersionUID = 235680143296374280L;

	public Display() {
		super();
		super.setText("Hallo");
		super.setBackground(Color.CYAN);
		super.setOpaque(true);
		super.setVisible(true);
	}
}

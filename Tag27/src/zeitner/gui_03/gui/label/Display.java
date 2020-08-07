package zeitner.gui_03.gui.label;

import java.awt.Color;

import javax.swing.JLabel;

public class Display extends JLabel implements IDisplay{
	public Display() {
		super();
		super.setText("Hallo");
		super.setBackground(Color.YELLOW);
		super.setOpaque(true);
		super.setVisible(true);
	}
}

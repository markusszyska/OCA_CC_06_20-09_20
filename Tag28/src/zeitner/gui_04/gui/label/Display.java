package zeitner.gui_04.gui.label;

import java.awt.Color;

import javax.swing.JLabel;

public class Display extends JLabel implements IDisplay{
	public Display() {
		super();
		super.setText("Hallo");
		super.setBackground(Color.CYAN);
		super.setOpaque(true);
		super.setVisible(true);
	}
}

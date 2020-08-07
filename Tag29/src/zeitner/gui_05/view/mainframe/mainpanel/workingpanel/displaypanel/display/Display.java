package zeitner.gui_05.view.mainframe.mainpanel.workingpanel.displaypanel.display;

import java.awt.Color;

import javax.swing.JLabel;

public class Display extends JLabel implements IDisplay{

	private static final long serialVersionUID = 5308671098496513657L;

	public Display() {
		super();
		super.setText("Hallo");
		super.setBackground(Color.CYAN);
		super.setOpaque(true);
		super.setVisible(true);
	}
}

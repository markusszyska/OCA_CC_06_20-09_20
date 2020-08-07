package zeitner.gui_05.view.mainframe.mainpanel.workingpanel.displaypanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.displaypanel.display.Display;

public class DisplayPanel extends JPanel {
	

	private static final long serialVersionUID = -3927942285226079418L;
	private Display display;
	
	public Display getDisplay() {
		return this.display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public DisplayPanel() {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.BLUE);
		
		this.setDisplay(new Display());
		display.setVisible(true);
		
		JLabel footer = new JLabel("Ich bin der Footer ...");
		footer.setBackground(Color.GRAY);
		footer.setOpaque(true);
		footer.setVisible(true);
		
		
		super.add(display, BorderLayout.CENTER);
		super.add(footer, BorderLayout.PAGE_END);
		
		super.setVisible(true);
	}

}

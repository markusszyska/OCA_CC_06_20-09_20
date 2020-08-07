package zeitner.gui_05.gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class WorkingPanel extends JPanel {

	private static final long serialVersionUID = -1545048536907240612L;

	public WorkingPanel() {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.YELLOW);
		
		DisplayPanel displayPanel = new DisplayPanel();
		displayPanel.setVisible(true);
		ButtonPanel buttonPanel = new ButtonPanel(displayPanel.getDisplay());
		buttonPanel.setVisible(true);

		super.add(displayPanel, BorderLayout.PAGE_START);
		super.add(buttonPanel, BorderLayout.CENTER);
			
		super.setVisible(true);
	}
}

package zeitner.gui_04.gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_04.gui.button.ExitButton;
import zeitner.gui_04.gui.button.UmschaltButton;
import zeitner.gui_04.gui.label.Display;

public class WorkingPanel extends JPanel {
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

package zeitner.gui_05.view.mainframe.mainpanel.workingpanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.buttonpanel.ButtonPanel;
import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.displaypanel.DisplayPanel;

public class WorkingPanel extends JPanel {

	private static final long serialVersionUID = -1309597365762435585L;

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

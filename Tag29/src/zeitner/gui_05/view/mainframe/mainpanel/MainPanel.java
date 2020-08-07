package zeitner.gui_05.view.mainframe.mainpanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.WorkingPanel;
import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.maintoolbar.MainToolBar;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = -8454812851629954282L;

	public MainPanel() {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.RED);
		
		WorkingPanel workingPanel = new WorkingPanel();
		workingPanel.setVisible(true);
		
		MainToolBar mainToolBar = new MainToolBar();
		mainToolBar.setVisible(true);
		
		super.add(mainToolBar, BorderLayout.PAGE_START);
		super.add(workingPanel, BorderLayout.CENTER);

		super.setVisible(true);
	}
}

package zeitner.gui_03.gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JToolBar;

import zeitner.gui_03.gui.button.ExitButton;
import zeitner.gui_03.gui.button.UmschaltButton;
import zeitner.gui_03.gui.label.Display;
import zeitner.gui_03.gui.toolbar.MainToolBar;

public class MainPanel extends JPanel {
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

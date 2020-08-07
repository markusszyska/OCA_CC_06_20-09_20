package zeitner.gui_05.gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_05.gui.toolbar.MainToolBar;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1268432344262382883L;

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

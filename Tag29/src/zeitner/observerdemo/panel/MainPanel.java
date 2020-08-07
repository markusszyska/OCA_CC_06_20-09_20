package zeitner.observerdemo.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 1268432344262382883L;

	public MainPanel() {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.RED);
		
		WorkingPanel workingPanel = new WorkingPanel();
		workingPanel.setVisible(true);

		super.add(workingPanel, BorderLayout.CENTER);

		super.setVisible(true);
	}
}

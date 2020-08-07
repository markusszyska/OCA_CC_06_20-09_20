package zeitner.observerdemo.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.observerdemo.data.ObservableData;

public class WorkingPanel extends JPanel {

	private static final long serialVersionUID = -1545048536907240612L;

	public WorkingPanel() {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.YELLOW);
		
		ObservableData observableData = new ObservableData("Welt");
		
		DisplayPanel displayPanel = new DisplayPanel(observableData);
		displayPanel.setVisible(true);
		ButtonPanel buttonPanel = new ButtonPanel(observableData);
		buttonPanel.setVisible(true);

		super.add(displayPanel, BorderLayout.PAGE_START);
		super.add(buttonPanel, BorderLayout.CENTER);
			
		super.setVisible(true);
	}
}

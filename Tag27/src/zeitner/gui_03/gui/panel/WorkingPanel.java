package zeitner.gui_03.gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_03.gui.button.ExitButton;
import zeitner.gui_03.gui.button.UmschaltButton;
import zeitner.gui_03.gui.label.Display;

public class WorkingPanel extends JPanel {
	public WorkingPanel() {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.RED);
		
		Display display = new Display();
		display.setVisible(true);
		
		UmschaltButton umschaltButton = new UmschaltButton("Welt",display);
		umschaltButton.setVisible(true);

		super.add(display, BorderLayout.PAGE_START);
		super.add(umschaltButton, BorderLayout.CENTER);
			
		super.setVisible(true);
	}
}

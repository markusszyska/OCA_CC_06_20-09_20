package zeitner.gui_04.gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_04.gui.button.UmschaltButton;
import zeitner.gui_04.gui.label.IDisplay;


public class ButtonPanel extends JPanel {
	public ButtonPanel(IDisplay display) {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.GREEN);
		
		UmschaltButton umschaltButton = new UmschaltButton("Welt",display);
		umschaltButton.setVisible(true);

		super.add(umschaltButton, BorderLayout.CENTER);
		
		super.setVisible(true);
	}
}

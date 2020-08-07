package zeitner.gui_05.gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_05.gui.button.UmschaltButton;
import zeitner.gui_05.gui.label.IDisplay;


public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 2743472090557366677L;

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

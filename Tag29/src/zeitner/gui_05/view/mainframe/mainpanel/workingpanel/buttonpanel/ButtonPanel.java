package zeitner.gui_05.view.mainframe.mainpanel.workingpanel.buttonpanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.buttonpanel.umschaltbutton.UmschaltButton;
import zeitner.gui_05.view.mainframe.mainpanel.workingpanel.displaypanel.display.IDisplay;


public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = -8488581060910320374L;

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

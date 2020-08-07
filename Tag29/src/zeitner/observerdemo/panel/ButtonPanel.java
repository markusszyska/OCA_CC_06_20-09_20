package zeitner.observerdemo.panel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import zeitner.observerdemo.button.UmschaltButton;
import zeitner.observerdemo.data.IObservableData;


public class ButtonPanel extends JPanel {

	private static final long serialVersionUID = 2743472090557366677L;

	public ButtonPanel(IObservableData observableData) {
		super();
		super.setLayout(new BorderLayout());
		super.setBackground(Color.GREEN);
		
		UmschaltButton umschaltButton = new UmschaltButton("Welt",observableData);
		umschaltButton.setVisible(true);

		super.add(umschaltButton, BorderLayout.CENTER);
		
		super.setVisible(true);
	}
}

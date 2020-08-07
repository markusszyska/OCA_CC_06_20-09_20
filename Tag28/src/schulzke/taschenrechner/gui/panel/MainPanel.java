package schulzke.taschenrechner.gui.panel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

import schulzke.taschenrechner.gui.GridBagContraints.ButtonPosition;
import schulzke.taschenrechner.gui.button.InputButton;
import schulzke.taschenrechner.gui.label.IOutputLabel;
import schulzke.taschenrechner.gui.label.OutputLabel;

public class MainPanel extends JPanel {

	public MainPanel() {
		super();
		super.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		OutputLabel outputLabel = new OutputLabel();
		outputLabel.setVisible(true);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 5;
		super.add(outputLabel, gbc);

		String strButton[] = { "7", "8", "9", "<", "AC", "4", "5", "6", "x", ":", "1", "2", "3", "+", "-", "0", ".",
				"+/-", "=" };

		InputButton inputButton[] = new InputButton[19];

		int x = 0;
		int y = 1;

		for (int i = 0; i < strButton.length; i++) {

			//Color background = Color.decode("#111111");
			Color background = Color.RED;
			//if end of line go to next line
			if (x == 5) {
				x = 0;
				y++;
			}
			//right items
			if (x > 2) {
				//background = Color.decode("#333333");
				background = Color.GREEN;
			}
			if (x == 3 && y == 4) {
				//background = Color.decode("#336389");
				background = Color.yellow;
			}

			//if end of line go to next line
			inputButton[i] = new InputButton(strButton[i], background, outputLabel);

			super.add(inputButton[i], new ButtonPosition(x, y));
			x++;
		}
		super.setVisible(true);
	}
}

package schulzke.taschenrechner.gui.GridBagContraints;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ButtonPosition extends GridBagConstraints {
	public ButtonPosition(int x, int y) {
		super.insets = new Insets(2, 2, 2, 2);
		super.anchor = GridBagConstraints.CENTER;
		super.fill = GridBagConstraints.BOTH;
		super.gridwidth = 1;
		super.gridx = x;
		super.gridy = y;
	}
	public ButtonPosition() {
	}
}

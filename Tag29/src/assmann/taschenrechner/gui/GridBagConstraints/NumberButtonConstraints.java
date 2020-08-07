package assmann.taschenrechner.gui.GridBagConstraints;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class NumberButtonConstraints extends GridBagConstraints {

	private static final long serialVersionUID = 3380554666112293797L;

	public NumberButtonConstraints(int x, int y) {
		super();
		super.fill = GridBagConstraints.BOTH;
		super.weightx = 0.33;
		super.weighty = 0.25;
		super.insets = new Insets(1, 1, 1, 1);
		
		super.gridx = x;
		super.gridy = y;
	}
}

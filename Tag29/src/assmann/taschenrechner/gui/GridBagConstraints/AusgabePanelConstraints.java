package assmann.taschenrechner.gui.GridBagConstraints;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class AusgabePanelConstraints extends GridBagConstraints {

	private static final long serialVersionUID = -5766632840245959827L;

	public AusgabePanelConstraints() {
		super();
		super.fill = GridBagConstraints.BOTH;
		super.ipady = 40;
		super.weightx = 1;
		super.weighty = 0.3;
		super.gridwidth = 2;
		super.gridx = 0;
		super.gridy = 0;
		super.insets = new Insets(2, 2, 2, 2);
	}
}

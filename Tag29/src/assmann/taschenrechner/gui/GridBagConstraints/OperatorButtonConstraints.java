package assmann.taschenrechner.gui.GridBagConstraints;

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class OperatorButtonConstraints extends GridBagConstraints {

	private static final long serialVersionUID = -5358165215485672939L;

	public OperatorButtonConstraints(int x, int y) {
		super();
		super.fill = GridBagConstraints.BOTH;
		super.weightx = 0.5;
		super.weighty = 0.25;
		super.insets = new Insets(1, 1, 1, 1); 
		
		super.gridx = x;
		super.gridy = y;
	}
	
	public OperatorButtonConstraints(int x, int y, int width) {
		super();
		super.fill = GridBagConstraints.BOTH;
		super.weightx = 0.5;
		super.weighty = 0.25;
		super.insets = new Insets(1, 1, 1, 1); 
		
		super.gridx = x;
		super.gridy = y;
		super.gridwidth = width;
	}
}

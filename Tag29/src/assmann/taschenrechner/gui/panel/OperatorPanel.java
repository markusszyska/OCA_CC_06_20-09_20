package assmann.taschenrechner.gui.panel;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import assmann.taschenrechner.gui.GridBagConstraints.OperatorButtonConstraints;
import assmann.taschenrechner.gui.button.DeleteAllButton;
import assmann.taschenrechner.gui.button.DeleteOneButton;
import assmann.taschenrechner.gui.button.OperatorButton;
import assmann.taschenrechner.gui.button.ResultButton;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class OperatorPanel extends JPanel {

	private static final long serialVersionUID = -4741406570716801742L;

	public OperatorPanel(IAusgabeTextfeld ausgabeTextfeld) {
		super();
		super.setLayout(new GridBagLayout());

		OperatorButton button;

		// add buttons
		DeleteOneButton buttonDelOne = new DeleteOneButton("BS", ausgabeTextfeld);
		super.add(buttonDelOne, new OperatorButtonConstraints(0,0));

		DeleteAllButton buttonDelAll = new DeleteAllButton("AC", ausgabeTextfeld);
		super.add(buttonDelAll, new OperatorButtonConstraints(1,0));

		button = new OperatorButton("*", ausgabeTextfeld);
		super.add(button, new OperatorButtonConstraints(0,1));

		button = new OperatorButton("/", ausgabeTextfeld);
		super.add(button, new OperatorButtonConstraints(1,1));

		button = new OperatorButton("+", ausgabeTextfeld);
		super.add(button, new OperatorButtonConstraints(0,2));

		button = new OperatorButton("-", ausgabeTextfeld);
		super.add(button, new OperatorButtonConstraints(1,2));

		ResultButton resultButton = new ResultButton("=", ausgabeTextfeld);
		super.add(resultButton, new OperatorButtonConstraints(0,3,2));

		super.setVisible(true);
	}
}

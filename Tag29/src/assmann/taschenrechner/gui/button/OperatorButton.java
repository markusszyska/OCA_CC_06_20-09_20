package assmann.taschenrechner.gui.button;

import java.awt.Dimension;

import javax.swing.JButton;

import assmann.taschenrechner.actionlistener.OperatorButtonListener;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class OperatorButton extends JButton {

	private static final long serialVersionUID = -6468927089549439658L;

	public OperatorButton(String s, IAusgabeTextfeld ausgabeTextfeld) {
		super(s);
		super.addActionListener(new OperatorButtonListener(ausgabeTextfeld));
		super.setFont(super.getFont().deriveFont(32.0f));
		super.setPreferredSize(new Dimension(90, 70));
		super.setVisible(true);
	}
}

package assmann.taschenrechner.gui.button;

import java.awt.Dimension;

import javax.swing.JButton;

import assmann.taschenrechner.actionlistener.NegateButtonListener;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class NegateButton extends JButton {

	private static final long serialVersionUID = 3782114110350444317L;

	public NegateButton(String s, IAusgabeTextfeld ausgabeTextfeld) {
		super(s);
		super.addActionListener(new NegateButtonListener(ausgabeTextfeld));
		super.setFont(super.getFont().deriveFont(32.0f));
		super.setPreferredSize(new Dimension(90, 70));
		super.setVisible(true);
	}
}

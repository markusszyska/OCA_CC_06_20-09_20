package assmann.taschenrechner.gui.button;

import java.awt.Dimension;

import javax.swing.JButton;

import assmann.taschenrechner.actionlistener.NumberButtonListener;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class NumberButton extends JButton {

	private static final long serialVersionUID = 1088557923209934231L;

	public NumberButton(String s, IAusgabeTextfeld ausgabeTextfeld) {
		super(s);
		super.addActionListener(new NumberButtonListener(ausgabeTextfeld));
		super.setFont(super.getFont().deriveFont(32.0f));
		super.setPreferredSize(new Dimension(90, 70));
		super.setVisible(true);
	}

}
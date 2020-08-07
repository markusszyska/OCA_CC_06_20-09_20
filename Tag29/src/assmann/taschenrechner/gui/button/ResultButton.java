package assmann.taschenrechner.gui.button;

import java.awt.Dimension;

import javax.swing.JButton;

import assmann.taschenrechner.actionlistener.ResultButtonListener;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class ResultButton extends JButton {

	private static final long serialVersionUID = 3382201395162243376L;

	public ResultButton(String s, IAusgabeTextfeld ausgabeTextfeld) {
		super(s);
		super.addActionListener(new ResultButtonListener(ausgabeTextfeld));
		super.setFont(super.getFont().deriveFont(32.0f));
		super.setPreferredSize(new Dimension(90, 70));
		super.setVisible(true);
	}
}

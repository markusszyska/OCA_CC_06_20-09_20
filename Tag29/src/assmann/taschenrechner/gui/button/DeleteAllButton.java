package assmann.taschenrechner.gui.button;

import java.awt.Dimension;

import javax.swing.JButton;

import assmann.taschenrechner.actionlistener.DeleteAllButtonListener;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class DeleteAllButton extends JButton {

	private static final long serialVersionUID = 7664902368204843913L;

	public DeleteAllButton(String s, IAusgabeTextfeld ausgabeTextfeld) {
		super(s);
		super.addActionListener(new DeleteAllButtonListener(ausgabeTextfeld));
		super.setFont(super.getFont().deriveFont(32.0f));
		super.setPreferredSize(new Dimension(90, 70));
		super.setVisible(true);
	}
}

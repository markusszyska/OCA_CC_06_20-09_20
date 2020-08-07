package assmann.taschenrechner.gui.button;

import java.awt.Dimension;

import javax.swing.JButton;

import assmann.taschenrechner.actionlistener.DeleteOneButtonListener;
import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class DeleteOneButton extends JButton {

	private static final long serialVersionUID = 8178451900812932974L;

	public DeleteOneButton(String s, IAusgabeTextfeld ausgabeTextfeld) {
		super(s);
		super.addActionListener(new DeleteOneButtonListener(ausgabeTextfeld));
		super.setFont(super.getFont().deriveFont(32.0f));
		super.setPreferredSize(new Dimension(90, 70));
		super.setVisible(true);
	}
}

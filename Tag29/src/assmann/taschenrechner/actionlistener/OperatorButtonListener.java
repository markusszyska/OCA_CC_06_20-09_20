package assmann.taschenrechner.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class OperatorButtonListener implements ActionListener {

	private IAusgabeTextfeld ausgabeTextfeld;
	
	public OperatorButtonListener(IAusgabeTextfeld ausgabeTextfeld) {
		super();
		this.ausgabeTextfeld = ausgabeTextfeld;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.ausgabeTextfeld.addOperator(((JButton)e.getSource()).getText());
	}

}

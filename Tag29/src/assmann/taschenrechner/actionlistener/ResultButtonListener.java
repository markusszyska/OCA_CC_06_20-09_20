package assmann.taschenrechner.actionlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import assmann.taschenrechner.gui.textfield.IAusgabeTextfeld;

public class ResultButtonListener implements ActionListener {

	private IAusgabeTextfeld ausgabeTextfeld;
	
	public ResultButtonListener(IAusgabeTextfeld ausgabeTextfeld) {
		super();
		this.ausgabeTextfeld = ausgabeTextfeld;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.ausgabeTextfeld.berechneErgebnis();

	}

}

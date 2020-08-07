package assmann.taschenrechner.gui.panel;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import assmann.taschenrechner.gui.GridBagConstraints.AusgabeTextfeldConstraints;
import assmann.taschenrechner.gui.textfield.AusgabeTextfeld;

public class AusgabePanel extends JPanel {

	private static final long serialVersionUID = 928882036053609719L;
	private AusgabeTextfeld ausgabeTextfeld;
	
	public AusgabeTextfeld getAusgabeTextfeld() {
		return this.ausgabeTextfeld;
	}
	
	private void setAusgabeTextfeld(AusgabeTextfeld ausgabeTextfeld) {
		this.ausgabeTextfeld = ausgabeTextfeld;
	}
	
	public AusgabePanel() {
		super();
		super.setLayout(new GridBagLayout());
		super.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		
		// AusgabeTextfeld
		this.setAusgabeTextfeld(new AusgabeTextfeld());
		
		super.add(ausgabeTextfeld, new AusgabeTextfeldConstraints());
		super.setVisible(true);
	}

}

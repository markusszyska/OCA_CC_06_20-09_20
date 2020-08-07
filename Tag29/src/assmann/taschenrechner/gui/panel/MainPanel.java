package assmann.taschenrechner.gui.panel;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

import assmann.taschenrechner.gui.GridBagConstraints.AusgabePanelConstraints;
import assmann.taschenrechner.gui.GridBagConstraints.OperatorenPanelConstraints;
import assmann.taschenrechner.gui.GridBagConstraints.ZahlenPanelConstraints;

public class MainPanel extends JPanel {

	private static final long serialVersionUID = 317921432226827410L;

	public MainPanel() {
		super();
		super.setLayout(new GridBagLayout());
		
		AusgabePanel ausgabePanel = new AusgabePanel();
		// Anm.: Uebergabeparameter sollten immer Interfaces sein
		ZahlenPanel zahlenPanel = new ZahlenPanel(ausgabePanel.getAusgabeTextfeld());
		OperatorPanel operatorPanel = new OperatorPanel(ausgabePanel.getAusgabeTextfeld());

		// Add Panels to MainPanel
		super.add(ausgabePanel, new AusgabePanelConstraints());
		super.add(zahlenPanel, new ZahlenPanelConstraints());
		super.add(operatorPanel, new OperatorenPanelConstraints());
		
		super.setVisible(true);
	}
}

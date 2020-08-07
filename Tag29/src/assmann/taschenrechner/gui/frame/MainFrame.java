package assmann.taschenrechner.gui.frame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import assmann.taschenrechner.gui.menubar.MainFrameMenuBar;
import assmann.taschenrechner.gui.panel.MainPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -6993733906679622360L;

	public MainFrame() {
		
		// Setze Basics
		super("Taschenrechner");
		super.setSize(400, 600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(new GridBagLayout());
		
		// Create Panel
		MainPanel mainPanel = new MainPanel();
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		super.add(mainPanel, gbc);
		
		// MenuBar
		super.setJMenuBar(new MainFrameMenuBar());

		// Automatische Größenanpassung
		super.pack();
		super.setVisible(true);
	}
}

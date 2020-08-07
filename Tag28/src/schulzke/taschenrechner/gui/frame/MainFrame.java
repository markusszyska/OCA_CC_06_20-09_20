package schulzke.taschenrechner.gui.frame;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import schulzke.taschenrechner.gui.panel.MainPanel;

public class MainFrame extends JFrame {
	public MainFrame() {
		super();
		super.setSize(640,480);
		super.setTitle("Windows CALC");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainPanel mainPanel = new MainPanel();

		super.setLayout(new BorderLayout());
	    super.add(mainPanel, BorderLayout.CENTER);

	}
}

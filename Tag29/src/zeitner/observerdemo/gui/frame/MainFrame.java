package zeitner.observerdemo.gui.frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import zeitner.observerdemo.panel.MainPanel;


public class MainFrame extends JFrame {

	private static final long serialVersionUID = 5648759084434131288L;

	public MainFrame() {
		super();
		super.setSize(800,600);
		super.setTitle("ObserverDemo");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainPanel mainPanel = new MainPanel();
		mainPanel.setVisible(true);


		super.add(mainPanel, BorderLayout.CENTER);
		super.setVisible(true);
	}
}

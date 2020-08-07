package zeitner.gui_05.view.mainframe;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import zeitner.gui_05.view.mainframe.mainframemenubar.MainFrameMenuBar;
import zeitner.gui_05.view.mainframe.mainpanel.MainPanel;



public class MainFrame extends JFrame {

	private static final long serialVersionUID = 3032990415894264488L;

	public MainFrame() {
		super();
		super.setSize(600,600);
		super.setTitle("Mein tolles GUI-Testprogramm!");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainPanel mainPanel = new MainPanel();
		mainPanel.setVisible(true);

		MainFrameMenuBar mainFrameMenuBar = new MainFrameMenuBar();
		mainFrameMenuBar.setVisible(true);
		
		super.setJMenuBar(mainFrameMenuBar);
		super.add(mainPanel, BorderLayout.CENTER);
		super.setVisible(true);
	}
}

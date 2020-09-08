package pizzabaecker.view.frame;

import javax.swing.JFrame;

import pizzabaecker.view.panel.BottomPanel;
import pizzabaecker.view.panel.MainPanel;
import pizzabaecker.view.panel.RightPanel;

public class MainFrame extends JFrame {

	/*
	 * Attributes
	 */	
	
	private static final long serialVersionUID = 8142336224223080477L;
	private MainPanel mainPanel;
	private BottomPanel bottomPanel;
	private RightPanel rightPanel;
	
	/*
	 * Getter/Setter
	 */
	public MainPanel getMainPanel() {
		return mainPanel;
	}
	private void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	public BottomPanel getBottomPanel() {
		return bottomPanel;
	}
	private void setBottomPanel(BottomPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}
	public RightPanel getRightPanel() {
		return rightPanel;
	}
	private void setRightPanel(RightPanel rightPanel) {
		this.rightPanel = rightPanel;
	}
	
	/*
	 * Constructor
	 */
	public MainFrame() {
		// Setze Basics
		super("Pizza Verbindung 2");
		super.setSize(800, 600);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setLayout(null);
		
		// Add Panels (absolut values)
		this.setMainPanel(new MainPanel());
		this.getMainPanel().setBounds(0,0,700,520);
		
		this.setBottomPanel(new BottomPanel());
		this.getBottomPanel().setBounds(0,520,800,80);
		
		this.setRightPanel(new RightPanel());
		this.getRightPanel().setBounds(700,0,100,520);
		
		super.add(this.getRightPanel());
		super.add(this.getBottomPanel());
		super.add(this.getMainPanel());

		super.setResizable(false);
		super.setVisible(true);
	}

}

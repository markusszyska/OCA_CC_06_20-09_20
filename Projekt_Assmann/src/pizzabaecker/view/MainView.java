package pizzabaecker.view;

import javax.swing.UIManager;

import pizzabaecker.view.frame.MainFrame;

public class MainView {
	
	/*
	 * Attributes
	 */
	private MainFrame mainFrame;
	
	/*
	 * Getter/Setter
	 */
	public MainFrame getMainFrame() {
		return mainFrame;
	}
	private void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	/*
	 * Constructor
	 */
	public MainView() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.setMainFrame(new MainFrame());
		this.getMainFrame().setVisible(true);
	}
}

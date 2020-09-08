package ml.brainin.smallpizzeria.view;

import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

import ml.brainin.smallpizzeria.controller.MainController;
import ml.brainin.smallpizzeria.view.mainpanel.OrderPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class Pizzeria.
 */
public class Pizzeria extends JFrame {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -9090319245521012517L;
	
	/** The Constant FRAME_HEIGHT. */
	public static final int FRAME_HEIGHT = 640; 
	
	/**
	 * Instantiates a new pizzeria.
	 *
	 * @param mainController the main controller
	 * @param title the title
	 */
	public Pizzeria(MainController mainController, String title) {
		super(title);
		setLayout(new GridLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		OrderPanel orderPanel = new OrderPanel(mainController);
		this.add(orderPanel);
        Toolkit myToolKit =Toolkit.getDefaultToolkit();
        int screenWidth=myToolKit.getScreenSize().width;
        int screenHeight=myToolKit.getScreenSize().height;
        int frameWidth = orderPanel.getPreferredSize().width;
        int x = (screenWidth-frameWidth)/2;
        int y = (screenHeight-FRAME_HEIGHT)/2;
        this.setBounds(x, y, frameWidth, FRAME_HEIGHT);
		setVisible(true);
		
		}

}

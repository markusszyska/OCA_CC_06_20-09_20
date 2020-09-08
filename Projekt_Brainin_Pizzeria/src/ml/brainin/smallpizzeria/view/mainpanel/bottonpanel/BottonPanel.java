package ml.brainin.smallpizzeria.view.mainpanel.bottonpanel;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import ml.brainin.smallpizzeria.view.mainpanel.IButtonAction;
import ml.brainin.smallpizzeria.view.mainpanel.OrderPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.ButtonPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class BottonPanel.
 */
public class BottonPanel extends JPanel {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1486298872676803601L;
	
	/**
	 * Instantiates a new botton panel.
	 *
	 * @param iButtonAction the i button action
	 */
	public BottonPanel(IButtonAction iButtonAction) {
		super();
		ButtonPanel clearPanel = new ButtonPanel("Clear order");
		clearPanel.getButton().addActionListener((event)->iButtonAction.doClearOrderAction());
		ButtonPanel confirmPanel = new ButtonPanel("Make order");
		confirmPanel.getButton().addActionListener((event)->iButtonAction.doMakeOrderAction());
		ButtonPanel savePanel = new ButtonPanel("Save");
		savePanel.getButton().addActionListener((event)->iButtonAction.doSaveOrderAction());
		this.setLayout(new GridLayout(1,2));
		this.setPreferredSize(new Dimension(250, 60));
		this.add(confirmPanel);
		this.add(savePanel);
		this.add(clearPanel);
		this.setVisible(true);
		
	}

}

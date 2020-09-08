package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class ButtonPanel.
 */
public class ButtonPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The j button. */
	private JButton jButton;
	
	/**
	 * Instantiates a new button panel.
	 *
	 * @param name the name
	 */
	public ButtonPanel(String name) {
		super();
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(250, 60));
		this.setBorder(new EtchedBorder());
		jButton = new JButton(name);
		this.jButton.setPreferredSize(new Dimension(120, 35));
		this.add(jButton);
		this.setVisible(true);
	}
	
	/**
	 * Gets the button.
	 *
	 * @return the button
	 */
	public JButton getButton() {
		return jButton;
	}
}

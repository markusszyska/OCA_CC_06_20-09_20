package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class WithDeliveryDataPanel.
 */
public class WithDeliveryDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The j check box. */
	private JCheckBox jCheckBox;
	
	/**
	 * Instantiates a new with delivery data panel.
	 *
	 * @param name the name
	 */
	public WithDeliveryDataPanel(String name) {
		super();
		super.setLayout(new BorderLayout());
		JLabel label = new JLabel(name);
		label.setFont(new Font("Dialog", 0, 14));
		label.setPreferredSize(new Dimension(100, 35));
		super.add(label, BorderLayout.WEST);
		this.jCheckBox = new JCheckBox("");  
		this.jCheckBox.setFont(new Font("Dialog", 1, 14));
		this.jCheckBox.setPreferredSize(new Dimension(150, 35));
		super.add(this.jCheckBox, BorderLayout.CENTER);
		super.setBorder(new EtchedBorder());
		this.setVisible(true);

	}
	
	/**
	 * Checks if is with delivery.
	 *
	 * @return true, if is with delivery
	 */
	public boolean isWithDelivery() {
		return this.jCheckBox.isSelected();
	}
}

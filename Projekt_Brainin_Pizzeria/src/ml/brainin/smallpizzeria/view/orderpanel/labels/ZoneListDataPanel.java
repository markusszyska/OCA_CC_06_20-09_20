package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;

// TODO: Auto-generated Javadoc
/**
 * The Class ZoneListDataPanel.
 */
public class ZoneListDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The j combo box. */
	private JComboBox<DeliveryPrice> jComboBox;
	
	/**
	 * Instantiates a new zone list data panel.
	 *
	 * @param name the name
	 * @param deliveryPrices the delivery prices
	 */
	public ZoneListDataPanel(String name, List<DeliveryPrice> deliveryPrices) {
		super();
		super.setLayout(new BorderLayout());
		JLabel label = new JLabel(name);
		label.setFont(new Font("Dialog", 0, 14));
		label.setPreferredSize(new Dimension(100, 35));
		super.add(label, BorderLayout.WEST);
		this.jComboBox = new JComboBox<>();
		DefaultComboBoxModel<DeliveryPrice> defaultComboBoxModel = new DefaultComboBoxModel<>();
		for (DeliveryPrice deliveryPrice : deliveryPrices) {
			defaultComboBoxModel.addElement(deliveryPrice);
		}
		this.jComboBox.setModel(defaultComboBoxModel);
		this.jComboBox.setSelectedIndex(0);
		this.jComboBox.setFont(new Font("Dialog", 1, 14));
		this.jComboBox.setPreferredSize(new Dimension(150, 35));
		super.add(this.jComboBox, BorderLayout.CENTER);
		super.setBorder(new EtchedBorder());
		this.setVisible(true);
	}
	
	/**
	 * Gets the selected index.
	 *
	 * @return the selected index
	 */
	public int getSelectedIndex() {
		return this.jComboBox.getSelectedIndex();
	}

	/**
	 * Gets the selected item.
	 *
	 * @return the selected item
	 */
	public DeliveryPrice getSelectedItem() {
		return (DeliveryPrice)this.jComboBox.getSelectedItem();
	}
	
	/**
	 * Sets the delivery price.
	 *
	 * @param deliveryPrice the new delivery price
	 */
	public void setDeliveryPrice(DeliveryPrice deliveryPrice) {
		jComboBox.setSelectedItem(deliveryPrice);
	}
	
	/**
	 * Clear delivery price.
	 */
	public void clearDeliveryPrice() {
		jComboBox.setSelectedIndex(0);
	}
}

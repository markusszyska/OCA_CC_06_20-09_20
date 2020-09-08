package ml.brainin.smallpizzeria.view.mainpanel.centerpanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import java.util.List;

import ml.brainin.smallpizzeria.model.order.Order;
import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;
import ml.brainin.smallpizzeria.view.orderpanel.labels.AmountTextFieldDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.OrderTextAreaDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.PizzaListDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.TextFieldDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.WithDeliveryDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.ZoneListDataPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class CenterPanel.
 */
public class CenterPanel extends JPanel {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5973354605888729809L;
	
	/** The amount data panel. */
	private AmountTextFieldDataPanel amountDataPanel;
	
	/** The order data panel. */
	private OrderTextAreaDataPanel orderDataPanel;
	
	/** The Constant WIDTH. */
	public static final int WIDTH = 400;
	
	/**
	 * Instantiates a new center panel.
	 */
	public CenterPanel() {
		this.setLayout(new FlowLayout());
		amountDataPanel = new AmountTextFieldDataPanel("Amaunt :");
		orderDataPanel = new OrderTextAreaDataPanel("Order :");
		this.add(orderDataPanel);
		this.add(amountDataPanel);
	}
	
	/**
	 * Sets the order.
	 *
	 * @param order the new order
	 */
	public void setOrder(Order order) {
		orderDataPanel.setText(order.getOrderString());
		amountDataPanel.setText(order.getOrderAmount());
	}
	
	/**
	 * Sets the preferred size.
	 *
	 * @param height the new preferred size
	 */
	public void setPreferredSize(int height) {
		super.setPreferredSize(new Dimension(WIDTH+20, height));
	}
	
	/**
	 * Clear order.
	 */
	public void clearOrder() {
		orderDataPanel.setText("");
		amountDataPanel.setText("");
	}
}

package ml.brainin.smallpizzeria.view.mainpanel.rightpanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import java.util.List;
import java.util.Vector;

import ml.brainin.smallpizzeria.model.order.Order;
import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;
import ml.brainin.smallpizzeria.view.mainpanel.IListSelection;
import ml.brainin.smallpizzeria.view.orderpanel.labels.AmountTextFieldDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.OrderTextAreaDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.OrdersListDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.PizzaListDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.TextFieldDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.WithDeliveryDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.ZoneListDataPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class RightPanel.
 */
public class RightPanel extends JPanel {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5973354605888729809L;
	
	/** The daily amount data panel. */
	private AmountTextFieldDataPanel dailyAmountDataPanel;
	
	/** The order data panel. */
	private OrdersListDataPanel orderDataPanel;
	
	/** The Constant WIDTH. */
	public static final int WIDTH = 400;
	
	/**
	 * Instantiates a new right panel.
	 *
	 * @param iListSelection the i list selection
	 */
	public RightPanel(IListSelection iListSelection) {
		this.setLayout(new FlowLayout());
		dailyAmountDataPanel = new AmountTextFieldDataPanel("Daily amount :");
		orderDataPanel = new OrdersListDataPanel("History :", iListSelection);
		this.add(orderDataPanel);
		this.add(dailyAmountDataPanel);
	}
	
	/**
	 * Adds the order.
	 *
	 * @param order the order
	 * @param dailyAmount the daily amount
	 */
	public void addOrder(Order order, float dailyAmount) {
		orderDataPanel.addOrder(order);
		dailyAmountDataPanel.setText(dailyAmount);
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
	 * Sets the orders history.
	 *
	 * @param ordersHistory the new orders history
	 */
	public void setOrdersHistory(Vector<Order> ordersHistory) {
		float dailyAmount = 0;
		for(Order order : ordersHistory) {
			dailyAmount += order.getOrderAmount();
			addOrder(order, dailyAmount);
		}
	}
	/**
	 * Do clear order action.
	 */
	public void clearOrder() {
		orderDataPanel.clearOrder();
	}

}

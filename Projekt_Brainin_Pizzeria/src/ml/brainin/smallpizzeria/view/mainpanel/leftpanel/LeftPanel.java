package ml.brainin.smallpizzeria.view.mainpanel.leftpanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import java.util.List;

import ml.brainin.smallpizzeria.model.order.Order;
import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;
import ml.brainin.smallpizzeria.model.utils.InputDataRuntimeException;
import ml.brainin.smallpizzeria.view.orderpanel.labels.OrderTextAreaDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.PizzaListDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.TextFieldDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.TimeFieldDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.WithDeliveryDataPanel;
import ml.brainin.smallpizzeria.view.orderpanel.labels.ZoneListDataPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class LeftPanel.
 */
public class LeftPanel extends JPanel {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5973354605888729809L;
	
	/** The order id data panel. */
	private TextFieldDataPanel orderIdDataPanel;
	
	/** The adress data panel. */
	private TextFieldDataPanel adressDataPanel;
	
	/** The phone data panel. */
	private TextFieldDataPanel phoneDataPanel;
	
	/** The create data panel. */
	private TimeFieldDataPanel createDataPanel;
	
	/** The current data panel. */
	private TimeFieldDataPanel currentDataPanel;
	
	/** The pizza list data panel. */
	private PizzaListDataPanel pizzaListDataPanel;
	
	/** The zone list data panel. */
	private ZoneListDataPanel zoneListDataPanel;
	
	/**
	 * Instantiates a new left panel.
	 *
	 * @param deliveryPrices the delivery prices
	 * @param pizzaPrices the pizza prices
	 */
	public LeftPanel(List<DeliveryPrice> deliveryPrices, List<PizzaPrice> pizzaPrices) {
		this.setLayout(new FlowLayout());
		orderIdDataPanel = new TextFieldDataPanel("Order id :");
		orderIdDataPanel.setEditable(false);
		zoneListDataPanel = new ZoneListDataPanel("Delivery zone :", deliveryPrices);
		adressDataPanel = new TextFieldDataPanel("Adress :");
		phoneDataPanel = new TextFieldDataPanel("Phone :");
		createDataPanel = new TimeFieldDataPanel("Created time :");
		currentDataPanel = new TimeFieldDataPanel("Time :");
		currentDataPanel.runTimer();
		pizzaListDataPanel = new PizzaListDataPanel("Pizza :", pizzaPrices);
		this.add(currentDataPanel);
		this.add(orderIdDataPanel);
		this.add(createDataPanel);
		this.add(adressDataPanel);
		this.add(phoneDataPanel);
		this.add(pizzaListDataPanel);
		this.add(zoneListDataPanel);
		this.setPreferredSize(new Dimension(270, 
				((this.getComponentCount()-1)*adressDataPanel.getPreferredSize().height)+
				pizzaListDataPanel.getPreferredSize().height));
		this.setVisible(true);
	}
	
	/**
	 * Calculate order.
	 *
	 * @return the order
	 * @throws InputDataRuntimeException the input data runtime exception
	 */
	public Order calculateOrder() throws InputDataRuntimeException{
		if (adressDataPanel.getText().isEmpty()) {
			throw new InputDataRuntimeException("Please, enter the adress");
		}else if (phoneDataPanel.getText().isEmpty()) {
			throw new InputDataRuntimeException("Please, enter the phone");
		}else if (pizzaListDataPanel.getSelectedValuesList().isEmpty()) {
			throw new InputDataRuntimeException("Please, choose a pizza");
		}
		createDataPanel.setLocalDateTime();
		Order order = new Order(
				adressDataPanel.getText(),
				phoneDataPanel.getText(),
				pizzaListDataPanel.getSelectedValuesList(),
				zoneListDataPanel.getSelectedItem(),
						createDataPanel.getCurrentDateTime());
		order.calculateOrder();
		return order;
	}
	
	/**
	 * Sets the order.
	 *
	 * @param order the new order
	 */
	public void setOrder(Order order) {
		orderIdDataPanel.setText(String.valueOf(order.getOrderId()));
		adressDataPanel.setText(order.getAdress());
		phoneDataPanel.setText(order.getPhone());
		pizzaListDataPanel.setPizzaPrices(order.getPizzaPrices());
		zoneListDataPanel.setDeliveryPrice(order.getDeliveryPrice());
		createDataPanel.setText(order.getCreatedTime());
	}
	
	/**
	 * Clear order.
	 */
	public void clearOrder() {
		orderIdDataPanel.setText("");
		adressDataPanel.setText("");
		phoneDataPanel.setText("");
		pizzaListDataPanel.clearPizzaPrices();
		zoneListDataPanel.clearDeliveryPrice();
		createDataPanel.setText("");
	}
}

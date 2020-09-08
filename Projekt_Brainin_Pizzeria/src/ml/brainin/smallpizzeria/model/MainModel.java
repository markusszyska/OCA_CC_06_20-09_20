package ml.brainin.smallpizzeria.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import ml.brainin.smallpizzeria.model.history.OrdersHistory;
import ml.brainin.smallpizzeria.model.order.Order;
import ml.brainin.smallpizzeria.model.prices.BasePriceObject;
import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;
import ml.brainin.smallpizzeria.model.utils.FileLoader;
import ml.brainin.smallpizzeria.model.utils.InputDataRuntimeException;

// TODO: Auto-generated Javadoc
/**
 * The Class MainModel.
 */
public class MainModel {
	
	/** The delivery prices. */
	private Vector<DeliveryPrice> deliveryPrices = new Vector<>();
	
	/** The pizza prices. */
	private Vector<PizzaPrice> pizzaPrices = new Vector<>();
	
	/** The daily amount. */
	private float dailyAmount = 0.0f;
	
	/** The orders history. */
	private OrdersHistory ordersHistory;
	
	/** The file loader. */
	private FileLoader fileLoader;
	
	/**
	 * Instantiates a new main model.
	 */
	public MainModel() {
		fileLoader = new FileLoader();
		ordersHistory = fileLoader.loadHistory();
		if (ordersHistory == null) {
			ordersHistory = new OrdersHistory();
		}
		loadPrices();
	}
	
	/**
	 * Load prices.
	 */
	private void loadPrices() {
		List<BasePriceObject> list;
		try {
			list = fileLoader.loadFile(FileLoader.LOAD_ZONE_PRICES);
			list.stream().forEach(basePriceObject -> this.addDeliveryPrice((DeliveryPrice)basePriceObject));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			list = fileLoader.loadFile(FileLoader.LOAD_PIZZA_PRICES);
			list.stream().forEach(basePriceObject -> this.addPizzaPrice((PizzaPrice)basePriceObject));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Gets the history.
	 *
	 * @return the history
	 */
	public Vector<Order> getHistory() {
		return (Vector<Order>)ordersHistory.getHistory().clone();
	}
	
	/**
	 * Adds the order to history.
	 *
	 * @param order the order
	 */
	public void addOrderToHistory(Order order) {
		ordersHistory.addOrderToHistory(order);
		this.setDailyAmount(order.getOrderAmount());
		fileLoader.saveHistory(ordersHistory);
	}
	
	/**
	 * Sets the daily amount.
	 *
	 * @param amount the new daily amount
	 */
	public void setDailyAmount(float amount) {
		this.dailyAmount += amount;
	}
	
	/**
	 * Gets the daily amount.
	 *
	 * @return the daily amount
	 */
	public float getDailyAmount() {
		return dailyAmount;
	}
	
	/**
	 * Gets the delivery prices.
	 *
	 * @return the delivery prices
	 */
	public Vector<DeliveryPrice> getDeliveryPrices() {
		Vector<DeliveryPrice> copy = new Vector<>();
		copy.addAll(deliveryPrices);
		return copy;
	}

	/**
	 * Adds the delivery price.
	 *
	 * @param deliveryPrice the delivery price
	 */
	private void addDeliveryPrice(DeliveryPrice deliveryPrice) {
		this.deliveryPrices.add(deliveryPrice);
	}

	/**
	 * Gets the pizza prices.
	 *
	 * @return the pizzaPrices
	 */
	public Vector<PizzaPrice> getPizzaPrices() {
		Vector<PizzaPrice> copy = new Vector<>();
		copy.addAll(pizzaPrices);
		return copy;
	}

	/**
	 * Adds the pizza price.
	 *
	 * @param pizzaPrice the pizza price
	 */
	private void addPizzaPrice(PizzaPrice pizzaPrice) {
		this.pizzaPrices.add(pizzaPrice);
	}
}

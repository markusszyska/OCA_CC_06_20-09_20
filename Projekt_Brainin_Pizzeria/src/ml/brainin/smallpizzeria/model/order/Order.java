package ml.brainin.smallpizzeria.model.order;

import java.io.Serializable;
import java.util.Vector;

import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;

// TODO: Auto-generated Javadoc
/**
 * The Class Order.
 */
public class Order implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4588036704855052431L;
	
	/** The adress. */
	private String adress;
	
	/** The phone. */
	private String phone;
	
	/** The created time. */
	private String createdTime;
	
	/** The pizza prices. */
	private Vector<PizzaPrice> pizzaPrices;
	
	/** The delivery price. */
	private DeliveryPrice deliveryPrice;
	
	/** The order amount. */
	private float orderAmount;
	
	/** The order string. */
	private String orderString = "";
	
	/** The order id. */
	private long orderId = System.currentTimeMillis()/1000;
	
	/**
	 * Instantiates a new order.
	 *
	 * @param adress the adress
	 * @param phone the phone
	 * @param pizzaPrices the pizza prices
	 * @param deliveryPrice the delivery price
	 * @param createdTime the created time
	 */
	public Order(String adress, String phone, Vector<PizzaPrice> pizzaPrices, DeliveryPrice deliveryPrice, String createdTime) {
		this.setAdress(adress);
		this.setPhone(phone);
		this.setPizzaPrices(pizzaPrices);
		this.setDeliveryPrice(deliveryPrice);
		this.setCreatedTime(createdTime);
		this.calculateOrder();
		this.setOrderString();
	}
	
	/**
	 * Calculate order.
	 */
	public void calculateOrder() {
		 for (PizzaPrice pizzaPrice : this.pizzaPrices) {
			 this.orderAmount += pizzaPrice.getPizzaPrice();
			 orderString += pizzaPrice.toString() + " : " + pizzaPrice.getPizzaPrice()+ " euro." + "\n"; 
		 }
		 
		 if (deliveryPrice != null) {
			 this.orderAmount += deliveryPrice.getPrice();
			 orderString += "\nDelivery : " + deliveryPrice.toString() + " price : "+deliveryPrice.getPrice();
		 }
	}
	
	/**
	 * Gets the order id.
	 *
	 * @return the order id
	 */
	public long getOrderId() {
		return orderId;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Order: "+orderId+" Date : "+this.getCreatedTime();
	}
	
	/**
	 * Gets the order string.
	 *
	 * @return the order string
	 */
	public String getOrderString() {
		return orderString;
	}

	/**
	 * Sets the order string.
	 */
	private void setOrderString() {
		this.orderString = ("Order id : "+orderId+"\nDate : "+this.getCreatedTime()+"\n");
	}
	
	/**
	 * Gets the adress.
	 *
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * Sets the adress.
	 *
	 * @param adress the new adress
	 */
	private void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	private void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the created time.
	 *
	 * @return the created time
	 */
	public String getCreatedTime() {
		return createdTime;
	}

	/**
	 * Sets the created time.
	 *
	 * @param createdTime the new created time
	 */
	private void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * Gets the pizza prices.
	 *
	 * @return the pizza prices
	 */
	public Vector<PizzaPrice> getPizzaPrices() {
		Vector<PizzaPrice> copy = new Vector<>();
		copy.addAll(pizzaPrices);
		return copy;
	}

	/**
	 * Sets the pizza prices.
	 *
	 * @param pizzaPrices the new pizza prices
	 */
	private void setPizzaPrices(Vector<PizzaPrice> pizzaPrices) {
		this.pizzaPrices = pizzaPrices;
	}
	
	/**
	 * Gets the delivery price.
	 *
	 * @return the delivery price
	 */
	public DeliveryPrice getDeliveryPrice() {
		return deliveryPrice;
	}
	
	/**
	 * Sets the delivery price.
	 *
	 * @param deliveryPrice the new delivery price
	 */
	public void setDeliveryPrice(DeliveryPrice deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	
	/**
	 * Gets the order amount.
	 *
	 * @return the order amount
	 */
	public float getOrderAmount() {
		return orderAmount;
	}
}

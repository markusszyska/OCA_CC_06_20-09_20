package ml.brainin.smallpizzeria.model.prices;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class PizzaPrice.
 */
public class PizzaPrice extends BasePriceObject implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -605339216929332252L;
	
	/**
	 * Instantiates a new pizza price.
	 *
	 * @param pizzaName the pizza name
	 * @param pizzaPrice the pizza price
	 */
	public PizzaPrice(String pizzaName, float pizzaPrice) {
		super(pizzaName, pizzaPrice);
	}
	
	/**
	 * Gets the pizza name.
	 *
	 * @return the pizzaType
	 */
	public String getPizzaName() {
		return super.getName();
	}
	
	/**
	 * Gets the pizza price.
	 *
	 * @return the pizzaPrice
	 */
	public float getPizzaPrice() {
		return super.getPrice();
	}
}

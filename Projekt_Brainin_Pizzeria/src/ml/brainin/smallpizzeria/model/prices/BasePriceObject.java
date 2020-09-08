package ml.brainin.smallpizzeria.model.prices;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class BasePriceObject.
 */
public class BasePriceObject  implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7711556095261439050L;
	
	/** The name. */
	private String name;
	
	/** The price. */
	private float price;
	
	/** The id. */
	private long id = System.currentTimeMillis();
	
	/**
	 * Instantiates a new base price object.
	 *
	 * @param name the name
	 * @param price the price
	 */
	public BasePriceObject(String name, float price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param price the price to set
	 */
	private void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() {
		return getName();
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return this.id;
	}
	
	/**
	 * Equals.
	 *
	 * @param basePriceObject the base price object
	 * @return true, if successful
	 */
	public boolean equals(BasePriceObject basePriceObject) {
		return this.name.equals(basePriceObject.getName());
	}
}

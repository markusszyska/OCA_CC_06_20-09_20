package ml.brainin.smallpizzeria.model.prices;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class DeliveryPrice.
 */
public class DeliveryPrice extends BasePriceObject implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5005594118899027437L;
	
	/**
	 * Instantiates a new delivery price.
	 *
	 * @param deliveryZone the delivery zone
	 * @param deliveryPrice the delivery price
	 */
	public DeliveryPrice(String deliveryZone, float deliveryPrice) {
		super(deliveryZone, deliveryPrice);
	}
	
	/**
	 * Gets the delivery zone.
	 *
	 * @return the deliveryZone
	 */
	public String getDeliveryZone() {
		return super.getName();
	}
	
	/**
	 * Gets the delivery price.
	 *
	 * @return the deliveryPrice
	 */
	public float getDeliveryPrice() {
		return super.getPrice();
	}

}

package ml.brainin.smallpizzeria.model.history;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.sound.midi.Synthesizer;

import ml.brainin.smallpizzeria.model.order.Order;

// TODO: Auto-generated Javadoc
/**
 * The Class OrdersHistory.
 */
public class OrdersHistory implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8920656194127743030L;
	
	/** The history. */
	private Vector<Order> history = new Vector<>();
	
	/**
	 * Adds the order to history.
	 *
	 * @param order the order
	 */
	public void addOrderToHistory(Order order) {
		getHistory().add(order);
	}
	
	/**
	 * Gets the history.
	 *
	 * @return the history
	 */
	public Vector<Order> getHistory() {
		Vector<Order> copy = new Vector<>();
		if (!history.isEmpty()) {
			copy.addAll(history);
		}
		return history;
	}
	
	/**
	 * Sets the history.
	 *
	 * @param history the history to set
	 */
	public void setHistory(Vector<Order> history) {
		this.history = history;
	}
}

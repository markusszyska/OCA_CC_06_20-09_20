package ml.brainin.smallpizzeria.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import ml.brainin.smallpizzeria.model.MainModel;
import ml.brainin.smallpizzeria.model.order.Order;
import ml.brainin.smallpizzeria.model.prices.BasePriceObject;
import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;
import ml.brainin.smallpizzeria.model.utils.FileLoader;
import ml.brainin.smallpizzeria.model.utils.InputDataRuntimeException;
import ml.brainin.smallpizzeria.view.Pizzeria;

// TODO: Auto-generated Javadoc
/**
 * The Class MainController.
 */
public class MainController {
	
	/** The main model. */
	private MainModel mainModel;
	
	/** The pizzeria. */
	private Pizzeria pizzeria;
	
	/**
	 * Instantiates a new main controller.
	 */
	public MainController() {
		mainModel = new MainModel();
		new Pizzeria(this, "Pappa Rouch");
	}
	
	/**
	 * Gets the orders history.
	 *
	 * @return the orders history
	 */
	public Vector<Order> getOrdersHistory(){
		return mainModel.getHistory();
	}
	
	/**
	 * Show message exception.
	 *
	 * @param e the e
	 */
	public static void showMessageException(String e){

        if (e == null || e.isEmpty()) return;
        JOptionPane.showMessageDialog(new JFrame(),e,"Error",JOptionPane.ERROR_MESSAGE);
    }

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception ex) {
			java.util.logging.Logger.getLogger(MainController.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
        		new MainController();
            }
        });
	}

	/**
	 * Adds the order to history.
	 *
	 * @param order the order
	 */
	public void addOrderToHistory(Order order) {
		mainModel.addOrderToHistory(order);
	}
	
	/**
	 * Gets the daily amount.
	 *
	 * @return the daily amount
	 */
	public float getDailyAmount() {
		return mainModel.getDailyAmount();
	}
	
	/**
	 * Gets the delivery prices.
	 *
	 * @return the delivery prices
	 */
	public List<DeliveryPrice> getDeliveryPrices() {
		return mainModel.getDeliveryPrices();
	}

	/**
	 * Gets the pizza prices.
	 *
	 * @return the pizza prices
	 */
	public List<PizzaPrice> getPizzaPrices() {
		return mainModel.getPizzaPrices();
	}
}

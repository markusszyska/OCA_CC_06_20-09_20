package ml.brainin.smallpizzeria.view.mainpanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JPanel;

import ml.brainin.smallpizzeria.controller.MainController;
import ml.brainin.smallpizzeria.model.order.Order;
import ml.brainin.smallpizzeria.model.prices.DeliveryPrice;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;
import ml.brainin.smallpizzeria.model.utils.InputDataRuntimeException;
import ml.brainin.smallpizzeria.view.Pizzeria;
import ml.brainin.smallpizzeria.view.mainpanel.bottonpanel.BottonPanel;
import ml.brainin.smallpizzeria.view.mainpanel.centerpanel.CenterPanel;
import ml.brainin.smallpizzeria.view.mainpanel.leftpanel.LeftPanel;
import ml.brainin.smallpizzeria.view.mainpanel.rightpanel.RightPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class OrderPanel.
 */
public class OrderPanel extends JPanel implements IListSelection , IButtonAction{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 7812798377235286119L;
	
	/** The left panel. */
	private LeftPanel leftPanel;
	
	/** The center panel. */
	private CenterPanel centerPanel;
	
	/** The right panel. */
	private RightPanel rightPanel;
	
	/** The order. */
	private Order order;
	
	/** The main controller. */
	private MainController mainController;
	
	/**
	 * Instantiates a new order panel.
	 *
	 * @param mainController the main controller
	 */
	public OrderPanel(MainController mainController) {
		super();
		this.mainController = mainController;
		this.setLayout(new BorderLayout());
		leftPanel = new LeftPanel(mainController.getDeliveryPrices(), mainController.getPizzaPrices());
		this.add(leftPanel, BorderLayout.WEST);
		centerPanel = new CenterPanel();
		centerPanel.setPreferredSize(leftPanel.getPreferredSize().height);
		this.add(centerPanel, BorderLayout.CENTER);
		rightPanel = new RightPanel(this);
		rightPanel.setPreferredSize(leftPanel.getPreferredSize().height);
		this.add(rightPanel, BorderLayout.EAST);
		BottonPanel bottonPanel = new BottonPanel(this);
		this.add(bottonPanel, BorderLayout.SOUTH);
		this.setPreferredSize(new Dimension(leftPanel.getPreferredSize().width+
				centerPanel.getPreferredSize().width+
				rightPanel.getPreferredSize().width+20, 
				Pizzeria.FRAME_HEIGHT-
				bottonPanel.getPreferredSize().height));
		rightPanel.setOrdersHistory(mainController.getOrdersHistory());
		this.setVisible(true);

	}
	
	/**
	 * Do make order action.
	 */
	public void doMakeOrderAction() {
		try {
			order = leftPanel.calculateOrder();
			centerPanel.setOrder(order);
		}catch(InputDataRuntimeException inputDataRuntimeException) {
			MainController.showMessageException(inputDataRuntimeException.getLocalizedMessage());
		}
	}
	
	/**
	 * Do save order action.
	 */
	public void doSaveOrderAction() {
		try {
			mainController.addOrderToHistory(order);
			rightPanel.addOrder(order, mainController.getDailyAmount());
			centerPanel.clearOrder();
			leftPanel.clearOrder();
			order = null;
		}catch(InputDataRuntimeException inputDataRuntimeException) {
			MainController.showMessageException(inputDataRuntimeException.getLocalizedMessage());
		}
	}
	
	/**
	 * Do clear order action.
	 */
	public void doClearOrderAction() {
		leftPanel.clearOrder();
		centerPanel.clearOrder();
		rightPanel.clearOrder();
		order = null;
	}
	
	/**
	 * Select order.
	 *
	 * @param order the order
	 */
	@Override
	public void selectOrder(Order order) {
		this.order = null;
		leftPanel.setOrder(order);
		centerPanel.setOrder(order);
	}

}

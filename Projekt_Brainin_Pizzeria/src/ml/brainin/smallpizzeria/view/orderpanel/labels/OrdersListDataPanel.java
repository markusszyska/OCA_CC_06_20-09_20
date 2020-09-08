package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import ml.brainin.smallpizzeria.model.order.Order;
import ml.brainin.smallpizzeria.model.prices.PizzaPrice;
import ml.brainin.smallpizzeria.view.mainpanel.IListSelection;
import ml.brainin.smallpizzeria.view.mainpanel.centerpanel.CenterPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class OrdersListDataPanel.
 */
public class OrdersListDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The j list. */
	private JList<Order> jList;
	
	/**
	 * Instantiates a new orders list data panel.
	 *
	 * @param name the name
	 * @param iListSelection the i list selection
	 */
	public OrdersListDataPanel(String name, IListSelection iListSelection) {
		super();
		super.setLayout(new BorderLayout());
		JLabel label = new JLabel(name);
		label.setFont(new Font("Dialog", 1, 14));
		label.setPreferredSize(new Dimension(100, 150));
		label.setVerticalAlignment(JLabel.TOP);
		super.add(label, BorderLayout.WEST);
		this.jList = new JList<>();
		DefaultListModel<Order> defaultListModel = new DefaultListModel<>();
		this.jList.setModel(defaultListModel);
		this.jList.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent mouseEvent){
				if (jList.getSelectedValue() != null) {
					iListSelection.selectOrder(jList.getSelectedValue());
				}
			}
		});
		this.jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.jList.setFont(new Font("Dialog", 1, 14));
		this.jList.setBorder(new LineBorder(Color.DARK_GRAY, 1));
		this.jList.setPreferredSize(new Dimension( CenterPanel.WIDTH-label.getPreferredSize().width, CenterPanel.WIDTH));
		super.add(jList, BorderLayout.CENTER);
		this.setBorder(new EtchedBorder());
		this.setVisible(true);
	}
	
	/**
	 * Adds the order.
	 *
	 * @param order the order
	 */
	public void addOrder(Order order) {
		DefaultListModel<Order> defaultListModel = (DefaultListModel<Order>)this.jList.getModel();
		defaultListModel.addElement(order);
	}
	
	/**
	 * Gets the selected index.
	 *
	 * @return the selected index
	 */
	public int getSelectedIndex() {
		return this.jList.getSelectedIndex();
	}

	/**
	 * Gets the selected values list.
	 *
	 * @return the selected values list
	 */
	public Order getSelectedValuesList() {
		return this.jList.getSelectedValue();
	}
	/**
	 * Do clear order action.
	 */
	public void clearOrder() {
		this.jList.clearSelection();
	}

}

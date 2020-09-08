package ml.brainin.smallpizzeria.view.orderpanel.labels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import ml.brainin.smallpizzeria.model.prices.PizzaPrice;

// TODO: Auto-generated Javadoc
/**
 * The Class PizzaListDataPanel.
 */
public class PizzaListDataPanel extends JPanel{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7013144991166499875L;
	
	/** The j list. */
	private JList<PizzaPrice> jList;
	
	/**
	 * Instantiates a new pizza list data panel.
	 *
	 * @param name the name
	 * @param pizzaPrices the pizza prices
	 */
	private int[] selectedIndexes;
	public PizzaListDataPanel(String name, List<PizzaPrice> pizzaPrices) {
		super();
		super.setLayout(new BorderLayout());
		JLabel label = new JLabel(name);
		label.setFont(new Font("Dialog", 0, 14));
		label.setPreferredSize(new Dimension(100, 150));
		label.setVerticalAlignment(JLabel.TOP);

		super.add(label, BorderLayout.WEST);
		this.jList = new JList<>();
		DefaultListModel<PizzaPrice> defaultListModel = new DefaultListModel<>();
		for (PizzaPrice pizzaPrice : pizzaPrices) {
			defaultListModel.addElement(pizzaPrice);
		}
		this.jList.setModel(defaultListModel);
		this.jList.setFont(new Font("Dialog", 1, 14));
		this.jList.setBorder(new LineBorder(Color.DARK_GRAY, 1));
		this.jList.setPreferredSize(new Dimension(150, 150));
		super.add(jList, BorderLayout.CENTER);
		this.setBorder(new EtchedBorder());
		this.setVisible(true);
	}
	
	/**
	 * Gets the selected indices.
	 *
	 * @return the selected indices
	 */
	public int[] getSelectedIndices() {
		return this.jList.getSelectedIndices();
	}

	/**
	 * Gets the selected values list.
	 *
	 * @return the selected values list
	 */
	public Vector<PizzaPrice> getSelectedValuesList() {
		Vector<PizzaPrice> selectedValues = new Vector<>();
		this.jList.getSelectedValuesList().stream().forEach( pizzaPrice->selectedValues.addElement(pizzaPrice));
		return selectedValues;
	}
	
	/**
	 * Sets the pizza prices.
	 *
	 * @param pizzaPrices the new pizza prices
	 */
	public void setPizzaPrices(Vector<PizzaPrice> pizzaPrices) {
		jList.clearSelection();
		selectedIndexes = new int[0];
		DefaultListModel<PizzaPrice> defaultListModel = (DefaultListModel<PizzaPrice>)jList.getModel();
		for (int index = 0; index < defaultListModel.size(); index++) {
			PizzaPrice pizzaPrice = defaultListModel.get(index);
			List<PizzaPrice> list = pizzaPrices.stream().filter(pp-> pp.equals(pizzaPrice)).collect(Collectors.toList());
			if (!list.isEmpty()) {
				int[] tmp = new int[selectedIndexes.length+1];
				IntStream.range(0, selectedIndexes.length).forEachOrdered(i->{
					tmp[i] = selectedIndexes[i];
				});
				selectedIndexes = tmp;
				selectedIndexes[selectedIndexes.length-1] = index;
			}
		}
		jList.setSelectedIndices(selectedIndexes);
	}
	
	/**
	 * Clear pizza prices.
	 */
	public void clearPizzaPrices() {
		jList.clearSelection();
	}
}

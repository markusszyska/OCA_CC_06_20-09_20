package pizzabaecker.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import pizzabaecker.Controller;
import pizzabaecker.model.pizza.PizzaBottom;

public class NewPizzaListener implements ActionListener {
	/*
	 * Attributes
	 */
	private Controller controller;

	/*
	 * Getter/Setter
	 */
	private Controller getController() {
		return controller;
	}
	private void setController(Controller controller) {
		this.controller = controller;
	}
	public NewPizzaListener(Controller controller) {
		this.setController(controller);
	}

	/*
	 * Method
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Retundanz wieder, neue Pizza-Dialog
		PizzaBottom[] choices = PizzaBottom.values();
		PizzaBottom input = (PizzaBottom) JOptionPane.showInputDialog(controller.getMainView().getMainFrame(), "Waehle einen Boden", "Neue Pizza erstellen",
				JOptionPane.QUESTION_MESSAGE, null, 
				choices, // Array of choices
				choices[0]); // Initial choice
		// debugzeile
//		System.out.println(input);
		this.getController().getPizzaria().newPizza(input);
	}
}

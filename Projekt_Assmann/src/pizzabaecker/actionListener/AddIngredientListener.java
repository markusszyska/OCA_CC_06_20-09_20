package pizzabaecker.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pizzabaecker.Controller;
import pizzabaecker.model.pizza.toppings.Cheese;
import pizzabaecker.model.pizza.toppings.Chili;
import pizzabaecker.model.pizza.toppings.Ham;
import pizzabaecker.model.pizza.toppings.Onions;
import pizzabaecker.model.pizza.toppings.Salami;

public class AddIngredientListener implements ActionListener {
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
	public AddIngredientListener(Controller controller) {
		this.setController(controller);
	}
	
	/*
	 * Method
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// call ueber den Controller und getters...
		switch (e.getActionCommand()) {
		case "Cheese":
			this.getController().getPizzaria().getPizza().addIngredient(new Cheese());
			break;
		case "Chili": 
			this.getController().getPizzaria().getPizza().addIngredient(new Chili());
			break;
		case "Ham": 
			this.getController().getPizzaria().getPizza().addIngredient(new Ham());
			break;
		case "Onions": 
			this.getController().getPizzaria().getPizza().addIngredient(new Onions());
			break;
		case "Salami": 
			this.getController().getPizzaria().getPizza().addIngredient(new Salami());
			break;
		}
		//debugzeile
//		System.out.println(this.getController().getPizzaria().getPizza());
	}
}

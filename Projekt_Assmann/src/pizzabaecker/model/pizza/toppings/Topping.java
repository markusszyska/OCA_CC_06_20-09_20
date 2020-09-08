package pizzabaecker.model.pizza.toppings;

import pizzabaecker.model.pizza.IIngredient;

public class Topping implements IIngredient{  
	/*
	 * Attributes
	 */
	private final String NAME;
	private final int PRICE; // Price of the Topping
	private final boolean VEGETABLE; // is this Topping a vegetable?
	private final boolean HOT; // is this Topping hot?
	
	/*
	 * Constructors
	 */
	/*
	 *  Toppings are detailed via its fields. Each specific subclass (topping) calls
	 *  this constructor with its proper characteristics. Resets the counter
	 *  when a topping is placed on a Bottom.
	 */
	public Topping(String name, int price, boolean vegetable, boolean hot) {
		this.NAME = name;
		this.PRICE = price;
		this.VEGETABLE = vegetable;
		this.HOT = hot;
	}
	
	/*
	 * Methods
	 */
	
	// returns the price of the current topping
	@Override
	public int getPrice() {
		return this.PRICE;
	}
	
	@Override
	public String getName() {
		return this.NAME;
	}
	
	// just one non-vegetable (false) results in a non-veggy Pizza
	@Override
	public boolean isVegetable() {
		return this.VEGETABLE;
	}

	/*
	 *  Increases hot toppings counter if the current topping is hot.
	 *  If it adds a 2nd hot topping, the pizza is hot (returns true). 
	 *  Otherwise it looks at the pizza below if that one is hot.
	 *  This ends in the bottom which will return false. 
	 *  This will return false if less than two toppings are hot. 
	 */
	@Override
	public boolean isHot() {
		return this.HOT;
	}
	
	@Override
	public String toString() {
		return "This Topping costs " + (double)this.getPrice()/100 
				+ " €.\nThis Topping is veggy?: " + this.isVegetable()
				+ "\nThis Topping is hot?: " + this.isHot();
	}
	
}

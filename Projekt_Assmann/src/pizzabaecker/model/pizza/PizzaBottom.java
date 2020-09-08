package pizzabaecker.model.pizza;

public enum PizzaBottom implements IIngredient {
	
	CRUSTY("Crusty", 340), MUNCHY("Munchy", 395);
	private final int PRICE;
	private final String NAME;
	
	// different bottoms with a specific price and name
	private PizzaBottom(String name, int price) {
		this.NAME = name;
		this.PRICE = price;
	}
		
	@Override
	public int getPrice() {
		return this.PRICE;
	}
	
	@Override
	public String getName() {
		return this.NAME;
	}
	
	@Override
	public boolean isVegetable() {
		return true;
	}

	@Override
	public boolean isHot() {
		return false;
	}
	
	@Override public String toString()  {
		return this.getName();
	}
	
}

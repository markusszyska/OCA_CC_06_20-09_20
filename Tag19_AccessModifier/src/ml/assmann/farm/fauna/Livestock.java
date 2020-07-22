package ml.assmann.farm.fauna;

import ml.assmann.farm.flora.Vegetable;

public class Livestock extends Mammal {
	
	/*
	 * Attributes
	 */
	private int salesPrice;

	/*
	 * Getters/Setters
	 */
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	/*
	 * Constructors
	 */
	public Livestock() {
		this.setSalesPrice(0);
	}
	
	public Livestock(String name, int weight, boolean female, int salesPrice) {
		super(name, weight, female);
		this.setSalesPrice(salesPrice);
	}
	
	/*
	 * Methods
	 */
	
	// Livestock eats a vegetable and weight increases by the weight of the vegetable
	public void eat(Vegetable v) {
		this.setWeight(this.getWeight() + v.getWeight());
	}
	
	// Make a baby
	public Livestock procreate(Livestock ls) {
		if(this instanceof Pig && ls instanceof Pig && this.isFemale() != ls.isFemale()) {
			return new Piglet("Piggy", 50, false, (Pig)this, (Pig)ls);
		}
		if(this instanceof Cow && ls instanceof Cow && this.isFemale() != ls.isFemale()) {
			return new Calf("Cowie", 50, false, (Cow)this, (Cow)ls);
		}
		return null;
	}
}

package ml.assmann.farm.flora;

import ml.assmann.farm.fauna.IEdible;

public abstract class Vegetable extends AFlora implements IEdible{
	
	/*
	 * Attributes
	 */
	private String veggieName;
	
	/*
	 * Getters/Setters
	 */
	public String getVeggieName() {
		return this.veggieName;
	}
	
	private void setVeggieName(String veggieName) {
		this.veggieName = veggieName;
	}

	/*
	 * Constructors
	 */
	public Vegetable() {
		this("Standard vegetable");
	}
	
	public Vegetable(String veggieName) {
		this.setVeggieName(veggieName);
	}
	
	public abstract int getWeight();
	
	@Override
	public String toString() {
		return this.getVeggieName() + " weights " + this.getWeight() + " kg";
	}
}

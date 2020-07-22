package ml.assmann.farm.fauna;

public class Pig extends Livestock {
	 
	/*
	 * Constructors
	 */
	public Pig() {
	}
	
	public Pig(String name, int weight, boolean female, int salesPrice) {
		super(name, weight, female, salesPrice);
	}
	
	/*
	 * Methods
	 */
	public String toString() {
//		return this.getName() + " hat noch " + this.getMilchMenge() + " Liter Milch intus.";
		return "";
	}
	
}

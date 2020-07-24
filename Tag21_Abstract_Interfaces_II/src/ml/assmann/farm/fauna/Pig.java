package ml.assmann.farm.fauna;

public class Pig extends ALivestock implements Mammal {
	 
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
	@Override
	public String toString() {
		return "Pig " + this.getName() + " weights " + this.getWeight() + " kg and is worth " + this.getSalesPrice() + " €.";
	}
	
	@Override
	public ALivestock procreate(ALivestock ls) {
		if(ls instanceof Pig && this.isFemale() != ls.isFemale()) {
			return new Piglet("Piggy", 50, false, this, (Pig)ls);
		}
		return null;
	}
	
}

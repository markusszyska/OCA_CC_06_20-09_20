package ml.assmann.farm.fauna;

public class Dog extends Carnivore {

	/*
	 * Constructors
	 */
	public Dog() {

	}
	
	public Dog(String name, int weight, boolean female) {
		super(name, weight, female);
	}

	/*
	 * Methods
	 */
	@Override
	public String toString() {
		return "Dog " + this.getName() + " weights " + this.getWeight() + " kg.";
	}
}

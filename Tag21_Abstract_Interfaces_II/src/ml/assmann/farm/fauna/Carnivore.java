package ml.assmann.farm.fauna;

public abstract class Carnivore extends AFauna{
	
	/*
	 * Constructors
	 */
	public Carnivore() {

	}
	
	public Carnivore(String name, int weight, boolean female) {
		super(name, weight, female);
	}
	
	/*
	 * Methods
	 */
	public boolean eat(IEdible ie) {
		if(ie instanceof AFauna) {
			this.setWeight(this.getWeight() + ie.getWeight());
			return true;
		} else {
			System.out.println("This animal is a carnivore.");
			return false;
		}
	}
}

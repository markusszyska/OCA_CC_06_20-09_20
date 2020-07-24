package ml.assmann.farm.fauna;

public abstract class Omnivore extends AFauna {
	/*
	 * Constructors
	 */
	public Omnivore() {

	}
	
	public Omnivore(String name, int weight, boolean female) {
		super(name, weight, female);
	}
	
	/*
	 * Methods
	 */
	public void eat(IEdible ie) {
		this.setWeight(this.getWeight() + ie.getWeight());
	}
}

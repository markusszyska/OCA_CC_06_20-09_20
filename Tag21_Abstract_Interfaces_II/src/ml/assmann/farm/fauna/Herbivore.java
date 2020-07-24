package ml.assmann.farm.fauna;

import ml.assmann.farm.flora.AFlora;

public abstract class Herbivore extends AFauna {
	
	/*
	 * Constructors
	 */
	public Herbivore() {

	}
	
	public Herbivore(String name, int weight, boolean female) {
		super(name, weight, female);
	}
	
	/*
	 * Methods
	 */
	public boolean eat(IEdible ie) {
		if(ie instanceof AFlora) {
			this.setWeight(this.getWeight() + ie.getWeight());
			return true;
		} else {
			System.out.println("This animal is a herbivore.");
			return false;
		}
	}
}

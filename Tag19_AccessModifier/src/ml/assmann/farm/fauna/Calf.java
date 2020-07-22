package ml.assmann.farm.fauna;

public class Calf extends Cow{

	/*
	 * Attributes
	 */
	private Cow parent1;
	private Cow parent2;
	
	/*
	 * Getters/Setters
	 */
	public Cow getParent1() {
		return parent1;
	}

	public void setParent1(Cow parent1) {
		this.parent1 = parent1;
	}

	public Cow getParent2() {
		return parent2;
	}

	public void setParent2(Cow parent2) {
		this.parent2 = parent2;
	}

	/*
	 * Constructors
	 */
	public Calf() {
		this.setParent1(null);
		this.setParent2(null);		
	}

	public Calf(String name, int weight, boolean female, Cow parent1, Cow parent2) {
		super(name, weight, female, 0, 0);
		this.setParent1(parent1);
		this.setParent2(parent2);
	}
	
	/*
	 * Methods
	 */
	public String toString() {
		return "This is a Calf named " + this.getName();
	}
}

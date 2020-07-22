package ml.assmann.farm.fauna;

public class Piglet extends Pig{

	/*
	 * Attributes
	 */
	private Pig parent1;
	private Pig parent2;
	
	/*
	 * Getters/Setters
	 */
	public Pig getParent1() {
		return parent1;
	}

	public void setParent1(Pig parent1) {
		this.parent1 = parent1;
	}

	public Pig getParent2() {
		return parent2;
	}

	public void setParent2(Pig parent2) {
		this.parent2 = parent2;
	}

	/*
	 * Constructors
	 */
	public Piglet() {
		this.setParent1(null);
		this.setParent2(null);
	}
	
	public Piglet(String name, int weight, boolean female, Pig parent1, Pig parent2) {
		super(name, weight, female, 0);
		this.setParent1(parent1);
		this.setParent2(parent2);
	}
	/*
	 * Methods
	 */
	public String toString() {
		return "This is a Piglet named " + this.getName();
	}
}

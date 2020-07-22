package ml.assmann.farm.fauna;

public class Mammal {
	
	/*
	 * Attributes
	 */
	private String name;
	private int weight;
	private boolean female;
	
	/*
	 * Getters/Setters
	 */
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public boolean isFemale() {
		return this.female;
	}
	
	public void setFemale(boolean female) {
		this.female = female;;
	}
	
	/*
	 * Constructors
	 */
	public Mammal() {
		this.setName("Standard name");
		this.setWeight(100);
		this.setFemale(false);
	}
	
	public Mammal(String name, int weight, boolean female) {
		this.setName(name);
		this.setWeight(weight);
		this.setFemale(female);
	}
}

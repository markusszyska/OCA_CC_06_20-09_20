package ml.assmann.farm.fauna;

public abstract class AFauna {
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
	public AFauna() {
		this.setName("Standard name");
		this.setWeight(100);
		this.setFemale(false);
	}
	
	public AFauna(String name, int weight, boolean female) {
		this.setName(name);
		this.setWeight(weight);
		this.setFemale(female);
	}
	
	/*
	 * Methods
	 */
	@Override
	public String toString() {
		return "Animal " + this.getName() + " weights " + this.getWeight() + " kg";
	}
}

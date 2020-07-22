package ml.assmann.farm.flora;

public class Vegetable {

	/*
	 * Attributes
	 */
	private int weight;
	
	/*
	 * Getters/Setters
	 */
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/*
	 * Constructors
	 */
	public Vegetable() {
		this(0);
	}
	
	public Vegetable(int weight) {
		this.setWeight(weight);
	}
	
}

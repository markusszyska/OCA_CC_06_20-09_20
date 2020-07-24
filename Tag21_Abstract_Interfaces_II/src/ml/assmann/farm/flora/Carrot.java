package ml.assmann.farm.flora;

public class Carrot extends Vegetable {
	
	/*
	 * Attributes
	 */
	private int length;
	
	/*
	 * Getters/Setters
	 */
	public int getLength() {
		return this.length;
	}
	
	private void setLength(int length) {
		this.length = length;
	}
	
	/*
	 * Constructors
	 */
	public Carrot() {
		this(0);
	}
	
	public Carrot(int length) {
		super("Carrot");
		this.setLength(length);
	}
	
	/*
	 * Methods
	 */
	@Override
	public int getWeight() {
		return this.getLength();
	}
}

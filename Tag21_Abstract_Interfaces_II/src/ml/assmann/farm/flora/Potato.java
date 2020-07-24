package ml.assmann.farm.flora;

public class Potato extends Vegetable {
	
	/*
	 * Attributes
	 */
	private int size;
	
	/*
	 * Getters/Setters
	 */
	public int getSize() {
		return this.size;
	}
	
	private void setSize(int size) {
		this.size = size;
	}
	
	/*
	 * Constructors
	 */
	public Potato() {
		this(0);
	}
	
	public Potato(int size) {
		super("Potato");
		this.setSize(size);
	}
	
	/*
	 * Methods
	 */
	@Override
	public int getWeight() {
		return this.getSize();
	}
}

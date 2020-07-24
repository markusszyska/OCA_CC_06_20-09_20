package ml.assmann.farm.fauna;

public abstract class ALivestock extends Herbivore implements IEdible {
	
	/*
	 * Attributes
	 */
	private int salesPrice;

	/*
	 * Getters/Setters
	 */
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}
	
	/*
	 * Constructors
	 */
	public ALivestock() {
		this.setSalesPrice(0);
	}
	
	public ALivestock(String name, int weight, boolean female, int salesPrice) {
		super(name, weight, female);
		this.setSalesPrice(salesPrice);
	}
	
	/*
	 * Methods
	 */
	
	// Make a baby
	public abstract ALivestock procreate(ALivestock ls);
}

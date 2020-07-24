package ml.assmann.farm.fauna;

public class Cow extends ALivestock implements Mammal {
	 
	/*
	 * Attributes
	 */
	private int amountMilk;
	
	/*
	 * Getters/Setter
	 */
	public int getAmountMilk() {
		return this.amountMilk;
	}
	
	private void setAmountMilk(int amountMilk) {
		this.amountMilk = amountMilk;
	}
	
	/*
	 * Constructors
	 */
	public Cow() {
		this.setAmountMilk(0);
	}
	
	public Cow(String name, int weight, boolean female, int salesPrice, int amountMilk) {
		super(name, weight, female, salesPrice);
		this.setAmountMilk(amountMilk);
	}
	
	
	/*
	 * Methods
	 */
	@Override
	public String toString() {
		return "Cow " + this.getName() + " weights " + this.getWeight() + " kg and is worth " + this.getSalesPrice() + " €.";
	}
	
	@Override
	public ALivestock procreate(ALivestock ls) {
		if(ls instanceof Cow && this.isFemale() != ls.isFemale()) {
			return new Calf("Piggy", 50, false, this, (Cow)ls);
		}
		return null;
	}
	
}

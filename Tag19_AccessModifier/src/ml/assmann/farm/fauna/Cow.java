package ml.assmann.farm.fauna;

public class Cow extends Livestock {
	 
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
	public String toString() {
//		return this.getName() + " hat noch " + this.getMilchMenge() + " Liter Milch intus.";
		return "";
	}
	
}

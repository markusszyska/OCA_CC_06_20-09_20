package ml.salastexido.farm;

public class Cow extends Animal{
	private String mainColor;
	private String spotColor;
	private int amountOfMilk;
	
	
	/**
	 * @param mainColor
	 * @param spotColor
	 * @param amountOfMilk
	 */
	public Cow(int id, String name, int weight, double price,String mainColor, String spotColor, int amountOfMilk) {
		super(id,name,weight,price);
		this.mainColor = mainColor;
		this.spotColor = spotColor;
		this.amountOfMilk = amountOfMilk;
	}
	/**
	 * @return the mainColor
	 */
	public String getMainColor() {
		return mainColor;
	}
	/**
	 * @param mainColor the mainColor to set
	 */
	public void setMainColor(String mainColor) {
		this.mainColor = mainColor;
	}
	/**
	 * @return the spotColor
	 */
	public String getSpotColor() {
		return spotColor;
	}
	/**
	 * @param spotColor the spotColor to set
	 */
	public void setSpotColor(String spotColor) {
		this.spotColor = spotColor;
	}
	/**
	 * @return the amountOfMilk
	 */
	public int getAmountOfMilk() {
		return amountOfMilk;
	}
	/**
	 * @param amountOfMilk the amountOfMilk to set
	 */
	public void setAmountOfMilk(int amountOfMilk) {
		this.amountOfMilk = amountOfMilk;
	}
	@Override
	public String toString() {
		return "Cow [mainColor=" + mainColor + ", spotColor=" + spotColor + ", amountOfMilk=" + amountOfMilk
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getWeight()=" + getWeight() + ", getPrice()="
				+ getPrice() + "]";
	}
	
	
	
	
	
}

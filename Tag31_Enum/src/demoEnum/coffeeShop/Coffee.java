package demoEnum.coffeeShop;

public class Coffee {

	private CupSize size;
	
	public void setSize(CupSize size) {
		this.size = size;
	}
	
	public CupSize getSize() {
		return this.size;
	}
	
	@Override
	public String toString() {
		return "Coffee: " + this.getSize();
	}
}

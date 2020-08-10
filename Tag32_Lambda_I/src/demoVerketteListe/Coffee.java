package demoVerketteListe;
enum CupSize{
	SMALL,MEDIUM,LARGE
}
public class Coffee {

	private CupSize cupSize;

	public CupSize getCupSize() {
		return cupSize;
	}

	public void setCupSize(CupSize cupSize) {
		this.cupSize = cupSize;
	}
	
	public Coffee(CupSize cupSize) {
		this.setCupSize(cupSize);
	}
	
	public String toString() {
		return "DemoCoffee: CupSize: " + this.getCupSize();
	}
	
}

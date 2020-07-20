package bauernhof;

public class Nutztier extends Saeugetier{
	private double preis;

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	public Nutztier() {
		this.setPreis(0);
	}
	public Nutztier(double preis) {
		this.setPreis(preis);
	}
	
	public String toString() {
		String ausgabe = super.toString();
		ausgabe+= "\nPreis:" + this.getPreis();
		return ausgabe;
	}
	
	
	public void bewegen() {
		System.out.println("bewegen() in Nutztier");
	}
	
}

package ml.neumann.bauernhof.fauna;

public class Nutztiere extends Saeugetiere {
	private int alter; 
	private int gewicht;
	
	//Getter Setter
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	} 

	// Konstruktor
	public Nutztiere() {
		super();
		this.setAlter(5);
		this.setGewicht(150);
	}
	
	public String toString() {
		String ausgabe = super.toString();
		ausgabe+="\nAlter: " + this.getAlter();
		ausgabe+="\nGewicht: " + this.getGewicht();	
		return ausgabe; 
		}
	
	// Methode Vermehren 
	public void vermehren() {
		
	}
}

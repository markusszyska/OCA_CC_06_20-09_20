package neumann.bauernhof.tiere.nutztiere;

public class Schwein extends Nutztiere{
	int gewicht; 
	
	// getter/setter
	
	public int getGewicht() {
		return this.getGewicht();
	}
	
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	// Konstruktor 
	public Schwein() {
		super.setName("Standardschwein");
		this.setGewicht(50);
		
	}

	public Schwein(String name, int gewicht) {
		super.setName(name);
		this.setGewicht(gewicht);
	}
	// ToString 
	
	public String toString() {
		String ausgabe="";
		ausgabe="Das Schwein wiegt "+ this.getGewicht();
		return ausgabe;
	}
	
	public void wirdGewogen() {
		if (this.getGewicht() >1 ){
			System.out.println("Das Schwein wiegt " + this.getGewicht());
		}
	}
	
}

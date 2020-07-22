package ml.neumann.fahrzeugrennen;

public class Rennwagen extends Auto {
	
	public Rennwagen() {
		super();
		this.setMaxGeschwindigkeit(220);
	
	}
	// ToString Methode 
	public String toString() {
		String ausgabe=super.toString(); 
		
		return ausgabe;
		}
}

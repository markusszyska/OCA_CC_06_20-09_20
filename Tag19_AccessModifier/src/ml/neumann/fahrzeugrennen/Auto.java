 package ml.neumann.fahrzeugrennen;

public class Auto extends Fahrzeug 
{

	//Konstruktor Auto 
	public Auto() {
	super();
	this.setGeschwindigkeit(150);
	this.setMaxGeschwindigkeit(230);
	this.setRaeder(4);
	
	}
	// ToString Methode 
	public String toString() {
		String ausgabe=super.toString(); 
	
		return ausgabe;
		}
	
	
}

	



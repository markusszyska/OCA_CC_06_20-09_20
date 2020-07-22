package ml.neumann.fahrzeugrennen;

public class Fahrrad extends Fahrzeug{

	
	public Fahrrad() {
	this.setMaxGeschwindigkeit(30);
	this.setRaeder(2);
	
	}
	// ToString Methode 
	public String toString() {
	String ausgabe=	super.toString();
	return ausgabe;
	}
}

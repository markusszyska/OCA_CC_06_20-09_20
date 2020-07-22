package ml.neumann.fahrzeugrennen;

public class Auto extends Fahrzeug {

	// Konstruktor Auto
	public Auto() {
		super();
		this.setMaxGeschwindigkeit(230);
		this.setGeschwindigkeit(150);		
		this.setRaeder(4);
	}

	// ToString Methode
	public String toString() {
		String ausgabe = super.toString();

		return ausgabe;
	}

}

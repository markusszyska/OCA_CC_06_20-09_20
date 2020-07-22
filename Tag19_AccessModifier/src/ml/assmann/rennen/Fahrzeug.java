package ml.assmann.rennen;

public class Fahrzeug {
	private double position; // in Km
	private double geschwindigkeit; // in Km/H
	private double maxGeschwindigkeit;
	private int anzahlRaeder;

	/*
	 * Getter/Setter
	 */
	public double getPosition() {
		return position;
	}
	public void setPosition(double position) {
		this.position = position;
	}
	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}
	public void setGeschwindigkeit(double geschwindigkeit) {
		this.geschwindigkeit = (geschwindigkeit > this.maxGeschwindigkeit) ? this.maxGeschwindigkeit : geschwindigkeit;
	}
	public double getMaxGeschwindigkeit() {
		return this.maxGeschwindigkeit;
	}
	private void setMaxGeschwindigkeit(double maxGeschwindigkeit) {
		this.maxGeschwindigkeit = maxGeschwindigkeit;
	}
	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}
	private void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}
	
	/*
	 * Konstruktoren
	 */
	public Fahrzeug() {
	}
	
	public Fahrzeug(double maxGeschwindigkeit, int anzahlRaeder) {
		this.setMaxGeschwindigkeit(maxGeschwindigkeit);
		this.setAnzahlRaeder(anzahlRaeder);
	}
	
	/*
	 * Methoden
	 */
	
	// dauer in Minuten
	public void bewege(double dauer) {
		if(dauer == 0.0 || this.getGeschwindigkeit() == 0.0) return;
		double weg = dauer / 60 * this.getGeschwindigkeit();
		this.setPosition(this.getPosition() + weg);
	}
	
	public String toString() {
		return "Position: " + this.getPosition() + "\nMaximal Geschwindigkeit: " + this.getMaxGeschwindigkeit()
			+ "\nGeschwindigkeit: " + this.getGeschwindigkeit() + "\nAnzahl der Raeder: " + this.getAnzahlRaeder();
		
	}
}

package ml.assmann.bauernhof.objekte;

public class Eimer {
	
	/*
	 * Attribute
	 */
	private int fuellmenge;
	private int maxFuellmenge;
	
	/*
	 * Getter/Setter
	 */
	public int getFuellmenge() {
		return this.fuellmenge;
	}
	
	public void setFuellmenge(int fuellmenge) {
		if(fuellmenge > this.getMaxFuellmenge()) {
			System.out.println("Dieser Eimer ist uebergelaufen.");
			this.fuellmenge = maxFuellmenge;
		} else if(fuellmenge < 0) {
			System.out.println("Man kann keine negative Menge in diesen Eimer einfuellen.");
			this.fuellmenge = 0;
		} else 
			this.fuellmenge = fuellmenge;
	}
	
	public int getMaxFuellmenge() {
		return maxFuellmenge;
	}
	
	private void setMaxFuellmenge(int maxFuellmenge) {
		if(maxFuellmenge < 0) {
			System.out.println("Die maximale Fuellmenge kann nicht negativ sein.");
		} else
			this.maxFuellmenge = maxFuellmenge;
	}
	
	/*
	 * Konstruktoren
	 */
	
	// Parameterlos
	public Eimer() {
		this(0,0);
	}
	
	// Voll parametrisiert
	public Eimer(int fuellmenge, int maxFuellmenge) {
		setFuellmenge(fuellmenge);
		setMaxFuellmenge(maxFuellmenge);
	}
	
	/*
	 * Methoden
	 */
	
	// fuellen(int fuellMenge) - fuellt den Eimer mit der Menge fuellMenge
	public void fuellen(int fuellmenge) {
		this.setFuellmenge(this.getFuellmenge()+fuellmenge);
	}
	
	// int passtRein() - gibt die Menge zurueck die noch in den Eimer passt
	public int passtRein() {
		return this.getMaxFuellmenge() - this.getFuellmenge();
	}

	public String toString() {
		return "Eimer:\n\tMaximale Fuellmenge: " + this.getMaxFuellmenge() + "\n\tAktuelle Fuellmenge: " + this.getFuellmenge();
	}
	
	
	
	
	
	
}

package ml.assmann.bauernhof.objekte;

public class Stall {
	
	/*
	 * Attribute
	 */
	private Tuer tuer;
	
	/*
	 * Setter/Getter
	 */
	public Tuer getTuer() {
		return this.tuer;
	}
	
	public void setTuer(Tuer tuer) {
		this.tuer = tuer;
	}
	
	/*
	 * Konstruktoren
	 */
	
	// Parameterlos - jeder Stall hat ne Tuer
	public Stall() {
		this(new Tuer());
	}
	
	// Voll Parametrisiert - Man verbaut eine eigene Tuer
	public Stall(Tuer tuer) {
		this.setTuer(tuer);
	}
	
	/*
	 * Methoden
	 */

	// aufschliessen(Schluessel schl) - ruft entsprechende Funktion von Tuer auf und uebergibt den Schluessel.
	public void aufschliessen(Schluessel schl) {
		this.getTuer().aufschliessen(schl);
	}

	// abschliessen(Schluessel schl) - ruft entsprechende Funktion von Tuer auf und uebergibt den Schluessel.
	public void abschliessen(Schluessel schl) {
		this.getTuer().abschliessen(schl);
	}
	
	// passtSchluessel
	public boolean passtSchluessel(Schluessel schl) {
		return this.getTuer().passtSchluessel(schl);
	}
}

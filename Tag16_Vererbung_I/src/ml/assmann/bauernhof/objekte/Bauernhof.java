package ml.assmann.bauernhof.objekte;

public class Bauernhof {

	/*
	 * Attribute
	 */
	private Stall stall;

	/*
	 * Getter/Setter
	 */
	public Stall getStall() {
		return this.stall;
	}

	public void setStall(Stall stall) {
		this.stall = stall;
	}

	/*
	 * Konstruktor
	 */
	public Bauernhof() {
		this.setStall(new Stall());
	}

	/*
	 * Methoden
	 */

}

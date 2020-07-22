package ml.vi;

public class Fahrzeug {

	private float position = 0;
	private float geschwindigkeit = 0;
	private float max_geschwindigkeit = 0;
	private int anzahlRaeder = 0;

	public Fahrzeug() {

	}

	public Fahrzeug(float position, float geschwindigkeit, float max_geschwindigkeit, int anzahlRaeder) {
		this.position = position;
		this.geschwindigkeit = geschwindigkeit;
		this.max_geschwindigkeit = max_geschwindigkeit;
		this.anzahlRaeder = anzahlRaeder;
	}

	public void bewege(double dauer) {
		this.position += (dauer / 60) * this.geschwindigkeit;
	}

	public void setPosition(float position) {
		this.position = position;
	}

	public float getPosition() {
		return this.position;
	}

	public float getGeschwindigkeit() {
		return geschwindigkeit;
	}

	public void setGeschwindigkeit(float geschwindigkeit) {
		if (geschwindigkeit > max_geschwindigkeit) {
			this.geschwindigkeit = max_geschwindigkeit;
			System.out.println("Geschwindigkeit von " + geschwindigkeit + " auf Max gestellt: " + max_geschwindigkeit);
		} else {
			this.geschwindigkeit = geschwindigkeit;
		}
	}

	public float getMaxGeschwindigkeit() {
		return max_geschwindigkeit;
	}

	public void setMaxGeschwindigkeit(float max_geschwindigkeit) {
		this.max_geschwindigkeit = max_geschwindigkeit;
	}

	public float getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	@Override
	public String toString() {
		return "Fahrzeug [position=" + this.position + ", geschwindigkeit=" + this.geschwindigkeit
				+ ", max_geschwindigkeit=" + this.max_geschwindigkeit + ", anzahlRaeder=" + this.anzahlRaeder + "]";
	}

}

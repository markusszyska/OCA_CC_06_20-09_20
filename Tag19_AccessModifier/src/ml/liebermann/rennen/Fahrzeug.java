package ml.liebermann.rennen;

public class Fahrzeug {
	private double position;
	private int kmh;
	public int raeder = 0;
	public int maxKmh;
	
	public double getPosition() {
		return position;
	}
	public void setPosition(double position) {
		this.position = position;
	}
	public int getKmh() {
		return kmh;
	}
	public void setKmh(int kmh) {
		this.kmh = kmh;
	}
	
	public void bewegen(double duration) {
		this.setPosition(this.getPosition() + duration / 60 * this.getGeschwindigkeit());
	}
	
	public void setGeschwindigkeit(int kmh) {
		if(kmh <= this.getMaxGeschwindigkeit()) {
			this.kmh = kmh;
		}
	}
	public int getGeschwindigkeit() {
		return this.kmh;
	}
	public int getMaxGeschwindigkeit() {
		return 0;
	}
	public void setMaxGeschwindigkeit(int maxKmh) {
		this.maxKmh = maxKmh;
	}
	public int getRaeder() {
		return raeder;
	}
	public void setRaeder(int raeder) {
		this.raeder = raeder;
	}
	
	public Fahrzeug() {
		
	}
	
	public Fahrzeug(int raeder, int maxGeschwindigkeit) {
		this.setRaeder(raeder);
		this.setGeschwindigkeit(maxGeschwindigkeit);
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " mit einer aktuellen Geschwindigkeit von " + this.getGeschwindigkeit();
	}
	
}

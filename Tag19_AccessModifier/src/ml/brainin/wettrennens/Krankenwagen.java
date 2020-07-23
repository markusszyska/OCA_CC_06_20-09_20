package ml.brainin.wettrennens;

public class Krankenwagen extends Fahrzeug{

	private boolean isBlaulichtEin;
	
	public boolean isBlaulichtEin() {
		return isBlaulichtEin;
	}

	public void setBlaulichtEin(boolean isBlaulichtEin) {
		this.isBlaulichtEin = isBlaulichtEin;
	}

	public Krankenwagen() {
		super("Krankenwagen", 140);
		setDrivers(4);
		setGeschwindigkeit(80);

	}

}

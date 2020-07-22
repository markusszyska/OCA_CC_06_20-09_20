package ml.assmann.rennen;

public class Auto extends Fahrzeug{
	public Auto() {
		super(140,4);
	}
	public Auto(double maxGeschwindigkeit) {
		super(maxGeschwindigkeit,4);
	}
}

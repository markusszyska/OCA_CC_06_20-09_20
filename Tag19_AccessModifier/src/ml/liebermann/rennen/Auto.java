package ml.liebermann.rennen;

public class Auto extends Fahrzeug{
	private static int raeder = 4;
	private static int maxKmh = 140;
	
	public Auto() {
		super(raeder, maxKmh);
	}
	public Auto(int maxGeschwindigkeit) {
		super(raeder, maxGeschwindigkeit);	
	}
	public Auto(int raeder, int maxGeschwindigkeit) {
		super(raeder, maxGeschwindigkeit);
	}
	@Override
	public int getMaxGeschwindigkeit() {
		return maxKmh;
	}
	@Override
	public String toString() {
		return super.toString();
	}
}

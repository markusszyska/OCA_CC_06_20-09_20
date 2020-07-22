package ml.liebermann.rennen;

public class Fahrrad extends Fahrzeug{
	private static int raeder = 2;
	private static int maxKmh = 30;
	
	public Fahrrad() {
		super(raeder, maxKmh);
	}
	public Fahrrad(int maxGeschwindigkeit) {
		super(raeder, maxGeschwindigkeit);
	}
	public Fahrrad(int raeder, int maxGeschwindigkeit) {
		super(raeder, maxGeschwindigkeit);
		
	}
	@Override
	public int getMaxGeschwindigkeit() {
		return maxKmh;
	}
}

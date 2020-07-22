package ml.liebermann.rennen;

public class Rennwagen extends Auto {
	private static int raeder = 4;
	private static int maxKmh = 220;
	
	public Rennwagen() {
		super(raeder, maxKmh);
	}
	public Rennwagen(int maxGeschwindigkeit) {
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

package ml.liebermann.rennen;

public class Krankenwagen extends Auto {
	private static int raeder = 4;
	private static int maxKmh = 140;
	private boolean blaulicht = false;
	
	public Krankenwagen() {
		super(raeder, maxKmh);
	}
	public Krankenwagen(int maxGeschwindigkeit) {
		super(raeder, maxGeschwindigkeit);
		
	}
	public boolean isBlaulicht() {
		return blaulicht;
	}
	public void setBlaulicht(boolean blaulicht) {
		this.blaulicht = blaulicht;
	}
	
	@Override
	public int getMaxGeschwindigkeit() {
		return maxKmh;
	}
	@Override
	public String toString() {
		String tmp = " aus ";
		if(this.isBlaulicht())
			tmp = " an ";
		return super.toString() + " und die Sirene ist" + tmp ;
	}
	
	
	
}

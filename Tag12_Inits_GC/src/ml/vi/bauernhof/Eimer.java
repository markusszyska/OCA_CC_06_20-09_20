package ml.vi.bauernhof;

public class Eimer {

	private double fuellmenge;
	private final double max_fuellmenge = 5000;

	public Eimer() {
		this(0);
	}

	public Eimer(int fuellmenge) {
		this.fuellmenge = fuellmenge;
	}

	@Override
	public String toString() {
		return "Eimer [fuellmenge=" + fuellmenge + ", max_fuellmenge=" + max_fuellmenge + "]";
	}

	public double getFuellmenge() {
		return fuellmenge;
	}

	public void setFuellmenge(double fuellmenge) {
		
		if(fuellmenge > max_fuellmenge)
			this.fuellmenge = max_fuellmenge;
		else
			this.fuellmenge = fuellmenge;
	}

	public double getMax_fuellmenge() {
		return max_fuellmenge;
	}

}

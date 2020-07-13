package ml.salastexido.bauernhof;

public class Eimer {
	private int fuellmenge;
	private int maxfuellmenge; //optional
	
	
	public Eimer(int fuellmenge, int maxfuellmenge){
		this.fuellmenge = fuellmenge;
		this.maxfuellmenge = maxfuellmenge;
	}
	
	public Eimer(int fuellmenge) {
		this(fuellmenge,30);
	}

	public Eimer() {
		this(0,30);
	}
	
	public int getFuellmenge() {
		return fuellmenge;
	}

	public void setFuellmenge(int fuellmenge) {
		this.fuellmenge = fuellmenge;
	}

	public int getMaxfuellmenge() {
		return maxfuellmenge;
	}

	public void setMaxfuellmenge(int maxfuellmenge) {
		this.maxfuellmenge = maxfuellmenge;
	}
	
	
	
	
}

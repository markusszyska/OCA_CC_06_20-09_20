package ml.brainin.bauernhof;

public class Eimer {
	private int fuellmenge;
	private int maxFuellmenge;

	
	public Eimer() {
		this(0,200);
	}
	public Eimer(int fuellmenge, int maxFuellmenge) {
		this.setMaxFuellmenge(maxFuellmenge);
		this.setFuellmenge(fuellmenge);
	}
	public int getFuellmenge() {
		return fuellmenge;
	}
	public void setFuellmenge(int fuellmenge) {
		this.fuellmenge += fuellmenge;
		if (fuellmenge != 0)
			System.out.println("Aktuel Fuelmenge : "+fuellmenge);
		if (fuellmenge >= maxFuellmenge) {
			System.out.println("Der Eimer ist voll");
		}
	}
	public int getMaxFuellmenge() {
		return maxFuellmenge;
	}
	public void setMaxFuellmenge(int maxFuellmenge) {
		this.maxFuellmenge = maxFuellmenge;
	}


}

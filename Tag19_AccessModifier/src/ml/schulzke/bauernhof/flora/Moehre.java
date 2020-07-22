package ml.schulzke.bauernhof.flora;

public class Moehre extends Gemuese{
	private int ruebenlaenge;

	public int getRuebenlaenge() {
		return ruebenlaenge;
	}

	public void setRuebenlaenge(int ruebenlaenge) {
		this.ruebenlaenge = ruebenlaenge;
	}

	public Moehre() {
		this("Standartsorte",0);
	}
	
	public Moehre(String sorte, int ruebenlaenge) {
		super(sorte);
		this.setRuebenlaenge(ruebenlaenge);
	}
}

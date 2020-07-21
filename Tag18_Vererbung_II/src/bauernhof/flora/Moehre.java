package bauernhof.flora;

public class Moehre extends Gemuese{
	private int ruebenlaenge;

	public int getRuebenlaenge() {
		return ruebenlaenge;
	}

	public void setRuebenlaenge(int ruebenlaenge) {
		this.ruebenlaenge = ruebenlaenge;
	}
	
	public Moehre() {
		this("Standardsorte", 0);
	}
	
	public Moehre(String sorte, int ruebenlaenge) {
		super(sorte);
		this.setRuebenlaenge(ruebenlaenge);	
	}
	
	@Override
	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nRuebenlaenge: " + this.getRuebenlaenge();
		return ausgabe;
	}
	
	@Override
	public void wirdGegessen() {
		System.out.println("Moehre wird gegessen");
		this.setRuebenlaenge(this.getRuebenlaenge()-1);
	}
}







package bauernhof.flora;

public class Kartoffel extends Gemuese{
	private int knollengroesse;

	public int getKnollengroesse() {
		return knollengroesse;
	}

	public void setKnollengroesse(int knollengroesse) {
		this.knollengroesse = knollengroesse;
	}
	
	public Kartoffel() {
		this("Standardsorte", 0);
	}

	public Kartoffel(String sorte, int knollengroesse) {
		super(sorte);
		this.setKnollengroesse(knollengroesse);	
	}
	@Override
	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nKnollengroesse: " + this.getKnollengroesse();
		return ausgabe;
	}
	
	public void wirdGegessen() {
		System.out.println("Kartoffel wird gegessen");
		this.setKnollengroesse(this.getKnollengroesse()-1);
	}
	
}

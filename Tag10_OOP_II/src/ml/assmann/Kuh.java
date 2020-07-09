package ml.assmann;

public class Kuh {

	//Attribute
	public String name;
	public String hauptfarbe;
	public String fleckenfarbe;
	public int milchmenge;
	public int gewicht;
	
	//Konstruktoren
	public Kuh() {
		this("", "", "", 0, 0);
	}
	
	public Kuh(String name, String hauptfarbe, String fleckenfarbe, int milchmenge, int gewicht) {
		this.name = name;
		this.hauptfarbe = hauptfarbe;
		this.fleckenfarbe = fleckenfarbe;
		this.milchmenge = milchmenge;
		this.gewicht = gewicht;
	}
	
	//Methoden
	public void laufen(int distanz) {
		if(distanz < 0) {
			System.out.println("Bitte geben sie eine gueltige Laufdistanz ein.");
		} else if(this.gewicht >= distanz) {
			this.gewicht -= distanz;
			System.out.println(this.name + " laeuft " + distanz + " km und wiegt nun " + this.gewicht + " kg");
		} else System.out.println(this.name + " kann nicht mehr so weit laufen.");
	}
	
	public void fressen(int menge) {
		if(menge < 0) {
			System.out.println("Bitte geben sie eine gueltige Fressmenge ein.");
		} else if(this.gewicht + menge <= 1000) {
			this.gewicht += menge;
			System.out.println(this.name + " frisst " + menge + " kg und wiegt nun " + this.gewicht + " kg");
		} else System.out.println(this.name + " kann nicht mehr so viel Fressen.");
	}
	
	public void melken() {
		if(this.milchmenge >= 5) {
			this.milchmenge -= 5;
			System.out.println(this.name + " wurde gemolken.");
		}
		else System.out.println(this.name + " kann nicht mehr gemolken werden.");
	}	
}

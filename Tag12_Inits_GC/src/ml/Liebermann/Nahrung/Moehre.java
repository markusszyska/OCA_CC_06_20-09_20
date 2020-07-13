package ml.Liebermann.Nahrung;

import ml.Liebermann.Lebewesen.Bauer;
import ml.Liebermann.Lebewesen.Kuh;
import ml.Liebermann.Lebewesen.Schwein;

public class Moehre {
	public int groesse;

	public Moehre(int groesse) {

	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	public void wirdGegessen(Bauer b1) {
		this.setGroesse(0);
		System.out.println(b1 + "hat die Moehre gegessen.");
	}

	public void wirdGegessen(Schwein s1) {
		this.setGroesse(0);
		System.out.println(s1 + "hat die Moehre gegessen.");
	}

	public void wirdGegessen(Kuh k1) {
		this.setGroesse(0);
		System.out.println(k1 + "hat die Moehre gegessen.");
	}

}

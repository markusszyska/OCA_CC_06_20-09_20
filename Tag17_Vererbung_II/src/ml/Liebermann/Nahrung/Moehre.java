package ml.Liebermann.Nahrung;

import ml.Liebermann.Lebewesen.Bauer;
import ml.Liebermann.Lebewesen.Kuh;
import ml.Liebermann.Lebewesen.Schwein;

public class Moehre {
	public int ruebenlaenge;

	public Moehre(int ruebenlaenge) {

	}

	public int getRuebenlaenge() {
		return ruebenlaenge;
	}

	public void setRuebenlaenge(int ruebenlaenge) {
		this.ruebenlaenge = ruebenlaenge;
	}

	public void wirdGegessen(Bauer b1) {
		this.setRuebenlaenge(0);
		System.out.println(b1 + "hat die Moehre gegessen.");
	}

	public void wirdGegessen(Schwein s1) {
		this.setRuebenlaenge(0);
		System.out.println(s1 + "hat die Moehre gegessen.");
	}

	public void wirdGegessen(Kuh k1) {
		this.setRuebenlaenge(0);
		System.out.println(k1 + "hat die Moehre gegessen.");
	}

}

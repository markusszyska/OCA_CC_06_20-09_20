package ml.Liebermann.Nahrung;

import ml.Liebermann.Lebewesen.Bauer;
import ml.Liebermann.Lebewesen.Kuh;
import ml.Liebermann.Lebewesen.Schwein;

public class Kartoffel {
private int knollengroesse;
private String sorte;

public Kartoffel(int knollengroesse, String sorte) {
	this.setKnollengroesse(knollengroesse);
	this.setSorte(sorte);
}

public int getKnollengroesse() {
	return knollengroesse;
}

public void setKnollengroesse(int knollengroesse) {
	this.knollengroesse = knollengroesse;
}

public String getSorte() {
	return sorte;
}

public void setSorte(String sorte) {
	this.sorte = sorte;
}

public void wirdGegessen(Bauer b1) {
	this.setKnollengroesse(0);
	System.out.println(b1 + "hat die Moehre gegessen.");
}

public void wirdGegessen(Schwein s1) {
	this.setKnollengroesse(0);
	System.out.println(s1 + "hat die Moehre gegessen.");
}

public void wirdGegessen(Kuh k1) {
	this.setKnollengroesse(0);
	System.out.println(k1 + "hat die Moehre gegessen.");
}



}

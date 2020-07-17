package ml.Liebermann.Nahrung;

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




}

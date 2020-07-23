package ml.brainin.bauernhof.flora;

public class Kartoffel {

	private String sorte;
	private int knollengroesse;
	
	public String getSorte() {
		return sorte;
	}
	public void setSorte(String sorte) {
		this.sorte = sorte;
	}
	public int getKnollengroesse() {
		return knollengroesse;
	}
	public void setKnollengroesse(int knollengroesse) {
		this.knollengroesse = knollengroesse;
	}
	
	public Kartoffel() {
		this.setSorte("Standardsorte");
		this.setKnollengroesse(10);
	}
	
	public Kartoffel(String sorte, int knollengroesse) {
		this.setSorte(sorte);
		this.setKnollengroesse(knollengroesse);
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n----------Kartoffel:";
		ausgabe += "\nSorte: " + this.getSorte();
		ausgabe += "\nKnollengroesse: " + this.getKnollengroesse();
		return ausgabe;
	}
	
	public int wirdGegessen() {
		int tmp = this.getKnollengroesse();
		this.setKnollengroesse(0);
		System.out.println("Die Kartoffel " + this.getSorte() + " wird gegessen.");
		return tmp;
	}
	
	
	
}

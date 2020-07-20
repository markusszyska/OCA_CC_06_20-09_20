package ml.brainin.bauernhof;

public class Moehre {

	private String sorte;
	private int ruebenlaenge;
	
	public String getSorte() {
		return sorte;
	}
	public void setSorte(String sorte) {
		this.sorte = sorte;
	}
	public int getRuebenlaenge() {
		return ruebenlaenge;
	}
	public void setRuebenlaenge(int ruebenlaenge) {
		this.ruebenlaenge = ruebenlaenge;
	}
	
	public Moehre() {
		this.setSorte("Standardsorte");
		this.setRuebenlaenge(10);
	}
	public Moehre(String sorte, int ruebenlaenge) {
		this.setSorte(sorte);
		this.setRuebenlaenge(ruebenlaenge);
	}
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n----------Moehre:";
		ausgabe += "\nSorte: " + this.getSorte();
		ausgabe += "\nRuebenlaenge: " + this.getRuebenlaenge();
		return ausgabe;
	}
	
	public int wirdGegessen() {
		int tmp = this.getRuebenlaenge();
		this.setRuebenlaenge(0);
		System.out.println("Die Moehre " + this.getSorte() + " wird gegessen.");
		return tmp;
	}
	
	
	
	
	
}

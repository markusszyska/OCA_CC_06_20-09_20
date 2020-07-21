package bauernhof.flora;

public class Gemuese {

	private String sorte;

	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}

	public Gemuese() {
		this("Standardsorte");
	}

	public Gemuese(String sorte) {
		this.setSorte(sorte);
	}

	@Override
	public String toString() {
		String ausgabe = "";
		ausgabe += "Sorte: " + this.getSorte();
		return ausgabe;
	}
	
	public void wirdGegessen() {
		System.out.println("Gemuese wird gegessen");
	}
	
	
}

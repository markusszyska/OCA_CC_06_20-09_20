package ml.vi.bauernhof;

public class Kartoffel {
	private String sorte;
	private int knollenGroesse;

	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}

	public int getKnollenGroesse() {
		return knollenGroesse;
	}

	public void setKnollenGroesse(int knollenGroesse) {
		this.knollenGroesse = knollenGroesse;
	}

	public Kartoffel() {
		this("Standardkartoffel", 20);
	}

	public Kartoffel(String sorte, int knollenGroesse) {
		this.setSorte(sorte);
		this.setKnollenGroesse(knollenGroesse);
	}
	
	public int wirdGegessen() {
		int tmp = this.getKnollenGroesse();
		this.setKnollenGroesse(0);
		return tmp;
	}
	
	
	
	
}

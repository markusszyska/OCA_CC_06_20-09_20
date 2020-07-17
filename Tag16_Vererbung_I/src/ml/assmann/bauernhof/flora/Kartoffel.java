package ml.assmann.bauernhof.flora;

public class Kartoffel {
	
	/*
	 * Attribute
	 */
	private int knollengroesse;
	private String sorte;
	
	/*
	 * Getter/Setter
	 */
	public int getKnollengroesse() {
		return this.knollengroesse;
	}
	
	public void setKnollengroesse(int knollengroesse) {
		this.knollengroesse = knollengroesse;
	}
	
	public String getSorte() {
		return this.sorte;
	}
	
	private void setSorte(String sorte) {
		this.sorte = sorte;
	}
	
	/*
	 * Konstruktor
	 */
	public Kartoffel() {
		this(1);
	}
	
	public Kartoffel(int knollengroesse) {
		this.setKnollengroesse(knollengroesse);
		this.setSorte("gemuese");
	}
}

package ml.assmann.bauernhof.flora;

public class Karotte {
	
	/*
	 * Attribute
	 */
	private int ruebenlaenge;
	private String sorte;
	
	/*
	 * Getter/Setter
	 */
	public int getRuebenlaenge() {
		return this.ruebenlaenge;
	}
	
	public void setRuebenlaenge(int ruebenlaenge) {
		this.ruebenlaenge = ruebenlaenge;
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
	public Karotte() {
		this(1);
	}
	
	public Karotte(int ruebenlaenge) {
		this.setRuebenlaenge(ruebenlaenge);
		this.setSorte("gemuese");
	}
}

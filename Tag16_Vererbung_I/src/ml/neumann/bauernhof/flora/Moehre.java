package ml.neumann.bauernhof.flora;

public class Moehre {// attribute 
	private String sorte; 
	private int laenge; 
	
	// getter/setter
	
	public String getSorte() {
		return sorte; 
	}
	public void setSorte(String sorte) {
		this.sorte = sorte;
	}
	
	public int getLaenge() {
		return laenge; 
	}
	
	public void setLaenge(int laenge) {
		this.laenge = laenge;
	}
	
	
	// Konstruktoren 
	
	public Moehre() {
		this.setSorte( "Standardsorte");
		this.setLaenge (10);
		
	}
	
	public Moehre(String sorte, int laenge) {
		this.setSorte(sorte);
		this.setLaenge(laenge);
		
		
	}
	

	// methoden 
	// wenn auch die Moehre vom Schwein gefressen werden soll, 
	//braucht die Moehre auch eine Methode wirdGegessen
	
	public int wirdGegessen() {
	int tmp = this.getLaenge(); 
		this.setLaenge(0); 
		// die Karotte wurde komplett aufgegessen 
		return tmp; 
		// zur Berechnung der Zunahme wird die ursprüngliche Laenge zurück gegeben
	}
	

}

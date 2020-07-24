package ml.neumann.abstrakterBauernhof.flora;

public abstract class APflanze {
	private String sorte;
	private int groesse;
	
// getter /Setter
	public String getSorte() {
		return sorte; 
	}
	public void setSorte(String sorte) {
		this.sorte=sorte;
	}
	
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse= groesse; 
	}
	
	// Konstruktor 
	public APflanze() {
		this.setSorte("Standardsorte");
		this.setGroesse(5);
	}
	
	public APflanze(String sorte, int groesse){
		this.setSorte(sorte);
		this.setGroesse(groesse);
		
	}
	// abstrakte methode 
	
	public abstract void bluehen();
	
	// konkrete methode 
	public int wirdGegessen() {
		int tmp = this.getGroesse();
		this.setGroesse(0);
		System.out.println("Pflanze " + this.getSorte() + " wird gegessen");
		return tmp;
	}
}

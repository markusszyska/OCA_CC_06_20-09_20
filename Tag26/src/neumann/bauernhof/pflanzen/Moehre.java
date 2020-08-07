package neumann.bauernhof.pflanzen;

public class Moehre extends Pflanzen{
// Attribute 
	String farbe;
	
	//getter/setter 
	public String getFarbe() {
		return this.farbe;
	}
	
	private void setFarbe(String farbe) {
		this.farbe=farbe;
	}
	
	// Konstruktor 
	public Moehre () {
	super();
	this.setFarbe("rot");
	}
	
	public Moehre(String sorte, int groesse, String farbe) {
		super(sorte,groesse);
		this.setFarbe(farbe);
		
	}
	
	// Methoden 
	


}

package ml.neumann.bauernhof.fauna;

public class Kuh extends Nutztiere {
	private String farbe;

	
	public String getFarbe()
	{
		return farbe;
	}
	
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	// Konstruktor 
	
	public Kuh() {
		super();
		this.setFarbe("braun");
	}
	
	public String toString () {
		String ausgabe= super.toString();
		ausgabe+="\n Farbe: " + this.getFarbe();
		return ausgabe; 
	}
}


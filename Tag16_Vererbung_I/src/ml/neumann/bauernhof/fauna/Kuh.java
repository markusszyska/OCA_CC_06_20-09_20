package ml.neumann.bauernhof.fauna;

public class Kuh {

	private String name; 
	private String farbe; 
	private int gewicht; 
	private int milchmenge;
	private int preis; 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	public int getMilchmenge() {
		return milchmenge;
	}
	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	} 
	
	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis= preis;
	}
	
	// Konstruktoren
	public Kuh()
	{this.setName("Standardkuh");
	this.setFarbe("schwarz");
	this.setGewicht(500);
	this.setMilchmenge(20);
	this.setPreis(250);
	}
	
	public Kuh(String name, String farbe, int gewicht, int milchmenge, int preis)
	{
		this.setName(name);
		this.setFarbe(farbe);
		this.setGewicht(gewicht);
		this.setMilchmenge(milchmenge);
		this.setPreis(preis);
	}
	
	
	// methoden
	// methode Kuh wird gemolken 
	
	public int wirdGemolken()
	{int tmp = this.getMilchmenge();
	
	this.setMilchmenge(0);
	//Nach dem Melken ist milchmenge = 0 
	return tmp; 
			}
}






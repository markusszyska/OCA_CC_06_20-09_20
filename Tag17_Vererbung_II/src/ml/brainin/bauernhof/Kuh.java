package ml.brainin.bauernhof;
import java.util.concurrent.ThreadLocalRandom;


public class Kuh {
	
	//Attribute
	private String name = "";
	private String hauptFarbe = "";
	private String fleckenFarbe = "";
	private int gewicht = 0;
	private int maxGewicht = 700; // Durchschnittsgewicht Simmentaler Kuhrasse (kg)
	private int drMilchMelken = 24; // tägliche durchschnittliche Milchmelken (kg)
	private int milchMelken = drMilchMelken; 
	private double verkaufsPreis = 0;
	private long id = System.currentTimeMillis();
	
	public long getId() {
		return id;
	}
	
	public boolean equals(Kuh kuh) {
		return this.id == kuh.getId();
	}
	
	
	public Kuh(String name, String hauptFarbe, String fleckenFarbe, int gewiht) {
		this.name = name;
		this.hauptFarbe = hauptFarbe;
		this.fleckenFarbe = fleckenFarbe;
		this.gewicht = gewiht;
		System.out.println(toString());
	}

	public void setMaxGewicht(int maxGewicht) {
		this.maxGewicht = maxGewicht;
	}

	public void setDrMilchMelken(int drMilchMelken) {
		this.drMilchMelken = drMilchMelken;
	}
	
	
	public void setMilchMelken(int milchMelken) {
		if (milchMelken < 0) milchMelken = drMilchMelken/2;
		this.milchMelken = milchMelken;
	}
	
	public int getMilchmelken() {
		return milchMelken;
	}
	public boolean isMilchmenge(int melken) {
		return melken < milchMelken;
		
	}
	
	public void setGewicht(int gwt) {
		if (gwt <0) gwt = 0;
		this.gewicht = gwt;
	}
	public int getGewicht() {
		return gewicht;
	}

	public boolean isUeberGewicht() {
		return gewicht > maxGewicht;
	}
	
	public int milken() {
		return ThreadLocalRandom.current().nextInt(drMilchMelken/2, drMilchMelken + 1);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHauptFarbe() {
		return hauptFarbe;
	}
	public void setHauptFarbe(String hauptFarbe) {
		this.hauptFarbe = hauptFarbe;
	}
	public String getFleckenFarbe() {
		return fleckenFarbe;
	}
	public void setFleckenFarbe(String fleckenFarbe) {
		this.fleckenFarbe = fleckenFarbe;
	}
	public int getMaxGewicht() {
		return maxGewicht;
	}
	public int getDrMilchMelken() {
		return drMilchMelken;
	}
	public int getMilchMelken() {
		return milchMelken;
	}
	public double getVerkaufsPreis() {
		return verkaufsPreis;
	}
	public void setVerkaufsPreis(double verkaufsPreis) {
		this.verkaufsPreis = verkaufsPreis* getGewicht();
	}
	public String toString() {
		String ausgabe = "";
		ausgabe+= "\n--------------Kuh:";
		ausgabe += "\nName: "+ this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht();
		return ausgabe;
	}

}

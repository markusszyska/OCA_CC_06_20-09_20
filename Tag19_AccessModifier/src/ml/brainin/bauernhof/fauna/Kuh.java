package ml.brainin.bauernhof.fauna;
import java.util.concurrent.ThreadLocalRandom;


public class Kuh extends Tier{
	
	//Attribute
	private String hauptFarbe = "";
	private String fleckenFarbe = "";
	private int maxGewicht = 700; // Durchschnittsgewicht Simmentaler Kuhrasse (kg)
	private int drMilchMelken = 24; // tägliche durchschnittliche Milchmelken (kg)
	private int milchMelken = drMilchMelken; 

	public Kuh(String name, String hauptFarbe, String fleckenFarbe, int gewiht, boolean isMaenlich) {
		super(name, gewiht, isMaenlich);
		this.hauptFarbe = hauptFarbe;
		this.fleckenFarbe = fleckenFarbe;
		setVerkaufsPreis(7.5);
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
	
	public boolean isUeberGewicht() {
		return getGewicht() > maxGewicht;
	}
	
	public int milken() {
		return ThreadLocalRandom.current().nextInt(drMilchMelken/2, drMilchMelken + 1);
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

}

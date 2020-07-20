package ml.Liebermann.Lebewesen;

import ml.Liebermann.Nahrung.Kartoffel;
import ml.Liebermann.Nahrung.Moehre;

public class Schwein {
	//Attribute
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private double verkaufsPreis = 399.99;
	//Get & Set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public double getVerkaufsPreis() {
		return verkaufsPreis;
	}

	public void setVerkaufsPreis(double verkaufsPreis) {
		this.verkaufsPreis = verkaufsPreis;
	}

	//Konstruktor
	public Schwein(String name, int gewicht, int groesse, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
	}
	
	public void fressen(Moehre moehre) {
		this.setGewicht(moehre.getRuebenlaenge() + this.getGewicht());
		moehre.wirdGegessen(this);
	}
	
	public void fressen(Kartoffel refKartoffel) {
		this.setGewicht(refKartoffel.getKnollengroesse() + this.getGewicht());
		refKartoffel.wirdGegessen(this);
	}
	
	
	public String toString() {
		return "Das Schwein "+ this.getName()+ " "; 
	}
	
}

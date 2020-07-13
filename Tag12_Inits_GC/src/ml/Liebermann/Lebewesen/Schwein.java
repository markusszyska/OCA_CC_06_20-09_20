package ml.Liebermann.Lebewesen;

import ml.Liebermann.Nahrung.Moehre;

public class Schwein {
	//Attribute
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
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

	//Konstruktor
	public Schwein(String name, int gewicht, int groesse, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
	}
	
	public void fressen(Moehre moehre) {
		this.setGewicht(moehre.getGroesse() + this.getGewicht());
		moehre.wirdGegessen(this);
	}
	
	
	public String toString() {
		return "Das Schwein "+ this.getName()+ " "; 
	}
	
}

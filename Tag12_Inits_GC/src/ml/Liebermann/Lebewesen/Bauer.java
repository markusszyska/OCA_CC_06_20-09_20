package ml.Liebermann.Lebewesen;

import ml.Liebermann.Items.Schluessel;
import ml.Liebermann.Nahrung.Moehre;

public class Bauer {
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	
	private Schluessel schluessel;
	
	
	
	public Bauer(String name, int gewicht, int groesse, int alter) {
		
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
	}

	public Schluessel getSchluessel() {
		return this.schluessel;
	}
	public void setSchluessel(Schluessel schluessel) {
		this.schluessel = schluessel;
	}





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
	
	public void isst(Moehre m1) {
		this.setGewicht(this.getGewicht()+ m1.getGroesse());
		m1.wirdGegessen(this);
	}

	public String toString() {
		return "Der Bauer "+ this.getName() + " "; 
	}








}

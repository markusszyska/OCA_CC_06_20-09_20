package ml.assmann.bauernhof.fauna;

import ml.assmann.bauernhof.flora.Karotte;
import ml.assmann.bauernhof.flora.Kartoffel;

public class Schwein {
	 
	/*
	 * Attribute
	 */
	private String name;
	private int verkaufspreis;
	private int gewicht;
	
	/*
	 * Getter/Setter
	 */
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getVerkaufspreis() {
		return this.verkaufspreis;
	}
	
	public void setVerkaufspreis(int verkaufspreis) {
		this.verkaufspreis = verkaufspreis;
	}
	
	public int getGewicht() {
		return this.gewicht;
	}
	
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	/*
	 * Konstruktoren
	 */

	public Schwein(String name, int gewicht, int verkaufspreis) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setVerkaufspreis(verkaufspreis);
	}
	
	/*
	 * Methoden
	 */
	
	// Schwein frisst eine Karotte karotte und gewicht steigt um ruebenlaenge der Karotte
	public void frisst(Karotte karotte) {
		this.setGewicht(this.getGewicht()+karotte.getRuebenlaenge());
	}
	
	// Kuh frisst eine Karotte karotte und gewicht steigt um knollengroesse der Kartoffel
	public void frisst(Kartoffel kartoffel) {
		this.setGewicht(this.getGewicht()+kartoffel.getKnollengroesse());
	}
	
}

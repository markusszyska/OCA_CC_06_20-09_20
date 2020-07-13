package ml.assmann.bauernhof.personen;

import ml.assmann.bauernhof.fauna.Kuh;
import ml.assmann.bauernhof.objekte.Eimer;
import ml.assmann.bauernhof.objekte.Schluessel;
import ml.assmann.bauernhof.objekte.Stall;

public class Bauer {
	/*
	 * Attribute
	 */
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private Schluessel schluessel;
	
	/*
	 * Getter/Setter
	 */
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return this.gewicht;
	}
	
	public void setGewicht(int gewicht) {
		if(gewicht < 0) {
			System.out.println("Das Gewicht kann nicht negativ sein");
			this.gewicht = 0;
		} else
			this.gewicht = gewicht;
	}

	public int getGroesse() {
		return this.groesse;
	}
	
	public void setGroesse(int groesse) {
		if(groesse < 0) {
			System.out.println("Die Groesse kann nicht negativ sein");
			this.groesse = 0;
		} else
			this.groesse = groesse;
	}

	public int getAlter() {
		return this.alter;
	}
	
	public void setAlter(int alter) {
		if(alter < 0) {
			System.out.println("Das Alter kann nicht negativ sein");
			this.alter = 0;
		} else
			this.alter = alter;
	}

	public Schluessel getSchluessel() {
		return this.schluessel;
	}
	
	public void setSchluessel(Schluessel schluessel) {
		this.schluessel = schluessel;
	}
	
	/*
	 * Konstruktoren
	 */

	public Bauer() {
		this("Standardname", 0, 0, 0, new Schluessel());
	}
	
	// Ohne Schluessel
	public Bauer(String name, int gewicht, int groesse, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
	}
	
	// Voll parametrisiert
	public Bauer(String name, int gewicht, int groesse, int alter, Schluessel schluessel) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
		this.setSchluessel(schluessel);
	}
	
	/*
	 * Methoden
	 */
	
	/*
	 * melken(int milchMenge, Kuh k, Eimer e) - ruft entsprechende
	 * Methode bei der Kuh auf und uebergibt Milchmenge und Eimer.
	 */
	public void melken(int milchMenge, Kuh k, Eimer e) {
		k.wirdGemolken(milchMenge, e);
	}

	// nimmSchluesselZuStall(Stall s) - Der Bauer nimmt sich den passenden Schluessel zum Stall
	public void nimmSchluesselZuStall(Stall s) {
		this.setSchluessel(s.getTuer().getSchluessel());
	}
	
	// bekommeSchluessel(Schluessel schl) - Der Bauer bekommt Schluessel schl.
	public void bekommeSchluessel(Schluessel schl) {
		this.setSchluessel(schl);
	}
	
	/*
	 * betrittStall(Stall s) - Der Bauer versucht die Tuer zum Stall s mit seinem Schluessel zu oeffnen
	 * um den Stall zu betreten.
	 */
	public void betrittStall(Stall s) {
		if(s.getTuer().istOffen()) 
			System.out.println("Bauer " + this.getName() + " betritt den Stall ohne Schluessel.");	
		else {
			if(s.passtSchluessel(this.getSchluessel())) {
				System.out.println("Bauer " + this.getName() + " schliesst auf und betritt den Stall.");
				s.aufschliessen(this.getSchluessel());
			} else
				System.out.println("Bauer " + this.getName() + " kommt nicht rein, weil der Schluessel nicht passt.");
		}
	}
	
	/*
	 * verlaesstStall(Stall s) - Der Bauer versucht die Tuer zum Stall s mit seinem Schluessel zu abzuschliessen
	 * wenn er den Stall s verlaesst.
	 */
	public void verlaesstStall(Stall s) {
		if(s.getTuer().istOffen()) {
			if(s.passtSchluessel(this.getSchluessel())) {
				System.out.println("Bauer " + this.getName() + " verlaesst den Stall und schliesst ab.");
				s.abschliessen(this.getSchluessel());
			} else {
				System.out.println("Bauer " + this.getName() + " verlaesst den Stall ohne abzuschliessen.");
			}
		} else {
			if(s.passtSchluessel(this.getSchluessel())) {
				System.out.println("Bauer " + this.getName() 
				+ " schliesst wieder auf, verlaesst den Stall und schliesst ab.");
			} else {
				System.out.println("Bauer " + this.getName() + " ist eingesperrt.");
			}
		}
	}
	
	public String toString() {
		return "Das ist Bauer " + this.getName() + ". Er ist " + this.getAlter() + " Jahre alt, " + this.getGroesse() + " cm gross und wiegt " +  this.getGewicht() + " kg.";
	}
	
	
}

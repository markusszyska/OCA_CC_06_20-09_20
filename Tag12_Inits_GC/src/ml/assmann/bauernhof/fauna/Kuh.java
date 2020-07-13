package ml.assmann.bauernhof.fauna;

import ml.assmann.bauernhof.objekte.Eimer;

public class Kuh {
	 
	/*
	 * Attribute
	 */
	private String name;
	private int milchMenge;
	
	/*
	 * Getter/Setter
	 */
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMilchMenge() {
		return this.milchMenge;
	}
	
	public void setMilchMenge(int milchMenge) {
		if(milchMenge < 0) {
			System.out.println("Die Milchmenge der Kuh kann nicht negativ sein.");
			this.milchMenge = 0;
		} else
			this.milchMenge = milchMenge;
	}

	/*
	 * Konstruktoren
	 */

	public Kuh() {
		this("Standardkuh", 0);
	}

	public Kuh(String name, int milchMenge) {
		this.setName(name);
		this.setMilchMenge(milchMenge);
	}
	
	/*
	 * Methoden
	 */
	
	/*
	 * wirdGemolken(int milchMenge, Eimer eimer) nimmt eine Menge an Milch, die es zu melken gilt,
	 * und einen Eimer an, in den hineingemolken wird.
	 * Falls die Kuh keine Milch mehr hat oder der Eimer voll ist wird nicht gemolken.
	 * Es wird nur so viel gemolken wie Platz im Eimer ist, bzw. wie Milch vorhanden ist.
	 */
	public void wirdGemolken(int milchMenge, Eimer eimer) {
		if (this.getMilchMenge() == 0) {
			System.out.println(this.getName() + " kann nicht mehr gemolken werden");
			return;
		}
		int passtRein = eimer.passtRein();
		if(passtRein == 0) {
			System.out.println("Der Eimer ist schon voll.");
			return;
		}
		
		System.out.println(this.getName() + " wird gemolken...");
		System.out.println();
		
		milchMenge = (milchMenge>passtRein) ? passtRein : milchMenge;
		if(milchMenge > this.getMilchMenge()) {
			int fuellen = this.getMilchMenge();
			eimer.fuellen(fuellen);
			System.out.println(fuellen + " Liter wurde(n) gemolken");
			this.setMilchMenge(0);
		} else {
			eimer.fuellen(milchMenge);
			System.out.println(milchMenge + " Liter wurde(n) gemolken");
			this.setMilchMenge(this.getMilchMenge()-milchMenge);
		}
	}
	
	public String toString() {
		return this.getName() + " hat noch " + this.getMilchMenge() + " Liter Milch intus.";
	}
	
}

package ml.brainin.bauernhof;

import java.awt.List;
import java.util.ArrayList;

import ml.brainin.bauernhof.fauna.Kuh;
import ml.brainin.bauernhof.fauna.Schwein;

public class Bauer {
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private Stall stall;
	private Eimer eimer;
	
	
	
	private ArrayList<Integer> schlusselBunt = new ArrayList<>();
	
	public Bauer() {
		this("Klaus Gruber", 90, 180, 35, new Stall());
	}
	public Bauer(String name, int gewicht, int groesse, int alter, Stall stall) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
		this.setStall(stall);

		System.out.println(toString());
		
		System.out.println("\n--------------------------------------\nTiere:"
				+ "\n--------------------------------------");

		Kuh kuh1 = new Kuh("Ruddy", "schwarz", "weiss", 650, true);
		Kuh kuh2 = new Kuh("Sally", "weiss", "schwarz", 750, false);
		Schwein schwein1 = new Schwein("Moriz", 65, true);
		Schwein schwein2 = new Schwein("Marta", 70, false);
		
		
		stall.addKuh(kuh1);
		stall.addKuh(kuh2);
		stall.addSchwein(schwein1);
		stall.addSchwein(schwein2);

				
		eimer = new Eimer();
	}
	

	
	
	public void wirdGemolken(Kuh kuh) {
		eimer.setFuellmenge(kuh.milken());
		
	}
	public void addSchlussel(int zahl) {
		schlusselBunt.add(zahl);
	}
	public ArrayList<Integer> getSchlusselBunt() {
		return schlusselBunt;
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
	public Stall getStall() {
		return stall;
	}
	public void setStall(Stall stall) {
		this.stall = stall;
	}
	public String toString() {
		String ausgabe = "";
		ausgabe += "Bauer: ";
		ausgabe += "\nName: " + this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht();
		ausgabe += "\nStall: "+this.getStall().getName();
		return ausgabe;
	}

}

package ml.neumann.abstrakterBauernhof.fauna;

import ml.neumann.abstrakterBauernhof.flora.APflanze;

public abstract class ATier {
	private String name; 
	private int alter; 
	private double gewicht;
	private boolean female;
	
	// getter Setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	public boolean isFemale() {
		return female;
	}
	public void setFemale(boolean female) {
		this.female = female;
	}

// Konstruktor
	
public ATier() {
	this.setName("Standardname");
	this.setAlter(5);
	this.setGewicht(100);
	this.setFemale(false);
	
}

public ATier(String name, int alter, int gewicht,boolean female) {
	this.setName(name);
	this.setAlter(alter);
	this.setGewicht(gewicht);
	this.setFemale(female);
}

// abstrakte Methoden

public abstract void machGeraeusch();
	


//konkrete Methode 
public void fressen(APflanze p) {
	this.setGewicht(this.getGewicht()+ p.wirdGegessen());
	System.out.println("Tier " + this.getName() + " frisst Pflanze " + p.getSorte());


	
}
	
 
}


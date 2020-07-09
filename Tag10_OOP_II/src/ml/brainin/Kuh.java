package ml.brainin;
/*
 Machen Sie sich mit dem Aufbau einer Klasse und den Packages vertraut.

Bauen Sie den BauernhofSimulator Ihren Package nach.
Erzeugen Sie auf Grundlage der Klasse Schwein eine
Klasse Kuh.

Kuh soll folgende Attribute besitzen.
Name
Hauptfarbe
Fleckenfarbe
Milchmenge
Gewicht


// laufen sollte das Gewicht verringern, aber nicht unter 0 fallen dürfen
// fressen sollte das Gewicht erhöhen, aber nicht über ein bestimmtes Gewicht
// Eine Methode für die Milchmenge - melken
-- Milchmenge sollte nicht im Negativenbereich abfallen können


 */
public class Kuh {
	
	//Attribute
	private String name = "";
	private String hauptFarbe = "";
	private String fleckenFarbe = "";
	private int gewicht = 0;
	private int maxGewicht = 700; // Durchschnittsgewicht Simmentaler Kuhrasse (kg)
	private int drMilchMelken = 24; // tägliche durchschnittliche Milchmelken (kg)
	private int milchMelken = drMilchMelken; 
	
	public static void main(String[] args) {
		Kuh kuh1 = new Kuh("Ruddy", "schwarz", "weiss");
		Kuh kuh2 = new Kuh("Sally", "weiss", "schwarz");
		kuh1.setGewicht(650);
		kuh2.setGewicht(750);
		
		System.out.println("kuh1 hashCode : "+kuh1.hashCode());
		System.out.println(kuh1.toString());
		System.out.println("isUeberGewicht : "+kuh1.isUeberGewicht());
		System.out.println("---------------");
		System.out.println("kuh2 hashCode : "+kuh2.hashCode());
		System.out.println(kuh2.toString());
		System.out.println("isUeberGewicht : "+kuh2.isUeberGewicht());
	}
	public Kuh(String name, String hauptFarbe, String fleckenFarbe) {
		this.name = name;
		this.hauptFarbe = hauptFarbe;
		this.fleckenFarbe = fleckenFarbe;
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
	
	public String toString() {
		return "Kuh name : "+name+"\nHauptfarbe : "+hauptFarbe+"\nFleckenfarbe :"+fleckenFarbe +"\nAktuelles Gewicht : "+gewicht;
	}
}

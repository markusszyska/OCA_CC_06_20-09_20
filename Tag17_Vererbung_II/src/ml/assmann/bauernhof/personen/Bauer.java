package ml.assmann.bauernhof.personen;

import ml.assmann.bauernhof.fauna.*;
import ml.assmann.bauernhof.flora.*;
import ml.assmann.bauernhof.objekte.*;

public class Bauer {
	/*
	 * Attribute
	 */
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private Bauernhof bauernhof;
	private int kontostand;
	
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
	
	public Bauernhof getBauernhof() {
		return this.bauernhof;
	}
	
	private void setBauernhof(Bauernhof bauernhof) {
		this.bauernhof = bauernhof;
	}
	
	public int getKontostand() {
		return this.kontostand;
	}
	
	private void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}
	
	/*
	 * Konstruktoren
	 */
	
	// Voll parametrisiert
	public Bauer(String name, int gewicht, int groesse, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
		this.setBauernhof(new Bauernhof());
		this.setKontostand(0);
	}
	
	/*
	 * Methoden
	 */
	
	// Fuegt Schwein zum Stall hinzu
	public boolean addToStall(Schwein schwein) {
		return this.getBauernhof().getStall().add(schwein);		
	}
	
	// Fuegt Kuh zum Stall hinzu
	public boolean addToStall(Kuh kuh) {
		return this.getBauernhof().getStall().add(kuh);		
	}
	
	// Verkauft ein Schwein beim Namen
	public void verkaufeSchwein(String name) {
		int erloes = this.getBauernhof().getStall().verkaufeSchwein(name);
		this.setKontostand(this.getKontostand()+erloes);
		if(erloes == 0) {
			System.out.println("Schwein \"" + name + "\" nicht im Stall gefunden.");
		} else {
			System.out.println("Schwein \"" + name + "\" verkauft fuer " + erloes + " €");
		}
	}
	
	// Verkauft ein Schwein beim Namen
	public void verkaufeKuh(String name) {
		int erloes = this.getBauernhof().getStall().verkaufeKuh(name);
		this.setKontostand(this.getKontostand()+erloes);
		if(erloes == 0) {
			System.out.println("Kuh \"" + name + "\" nicht im Stall gefunden.");
		} else {
			System.out.println("Kuh \"" + name + "\" verkauft fuer " + erloes + " €");
		}
	}
	
	// Fuettert eine Kuh mit einer Kartoffel
	public void fuettern(Kuh kuh, Kartoffel kartoffel) {
		kuh.frisst(kartoffel);
		System.out.println("Kuh \"" + kuh.getName() + "\" frisst eine Kartoffel der Groesse " + kartoffel.getKnollengroesse() + " und wiegt nun " + kuh.getGewicht() + " kg");
	}
	
	// Fuettert eine Kuh mit einer Karotte
	public void fuettern(Kuh kuh, Karotte karotte) {
		kuh.frisst(karotte);
		System.out.println("Kuh \"" + kuh.getName() + "\" frisst eine Karotte der Groesse " + karotte.getRuebenlaenge() + " und wiegt nun " + kuh.getGewicht() + " kg");
	}
	
	// Fuettert ein Schwein mit einer Kartoffel
	public void fuettern(Schwein schwein, Kartoffel kartoffel) {
		schwein.frisst(kartoffel);
		System.out.println("Schwein \"" + schwein.getName() + "\" frisst eine Kartoffel der Groesse " + kartoffel.getKnollengroesse() + " und wiegt nun " + schwein.getGewicht() + " kg");
	}
	
	// Fuettert ein Schwein mit einer Kartoffel
	public void fuettern(Schwein schwein, Karotte karotte) {
		schwein.frisst(karotte);
		System.out.println("Schwein \"" + schwein.getName() + "\" frisst eine Karotte der Groesse " + karotte.getRuebenlaenge() + " und wiegt nun " + schwein.getGewicht() + " kg");
	}
	
	/*
	 * Fuettert alle Tiere mit den Karotten und Kartoffeln im Eimer. Geht den Stall von Pferch zu Pferch durch
	 * und wenn ein Tier drin ist wird gefuettert, wenn noch Futter vorhanden ist.
	 * Falls kein Futter mehr im Eimer ist, wird dies ausgegeben (todo: genaue Nachricht ob nicht genug Futter
	 * da ist). Wenn am Ende noch futter vorhanden ist wird dies ausgegeben.
	 */
	public void alleTiereFuettern(Eimer eimer) {
		int aktuelleAnzahlKarotten = eimer.getAnzahlKarotten();
		int aktuelleAnzahlKartoffeln = eimer.getAnzahlKartoffeln();
		boolean karottenStatus = false;
		boolean kartoffelStatus = false;
		
		// Durchlaufe den Stall nach Kuehen
		for(Kuh kuh : this.getBauernhof().getStall().getKuehe()) {
			if(kuh == null) {
				continue;
			}
			if(aktuelleAnzahlKarotten == 0 && !karottenStatus) {
				System.out.println("Die Karotten sind ausgegangen.");
				karottenStatus = true;
			}
			if(aktuelleAnzahlKarotten > 0) {
				this.fuettern(kuh, eimer.getKarotten()[aktuelleAnzahlKarotten - 1]);
				eimer.karotteGefressen();
				aktuelleAnzahlKarotten--;
			}
			if(aktuelleAnzahlKartoffeln == 0 && !kartoffelStatus) {
				System.out.println("Die Kartoffeln sind ausgegangen.");
				kartoffelStatus = true;
			}
			if(aktuelleAnzahlKartoffeln > 0) {
				this.fuettern(kuh, eimer.getKartoffeln()[aktuelleAnzahlKartoffeln - 1]);
				eimer.kartoffelGefressen();
				aktuelleAnzahlKartoffeln--;
			}
			
			// Ist der Eimer leer?
			if(aktuelleAnzahlKartoffeln == 0 && aktuelleAnzahlKarotten == 0 && kartoffelStatus && karottenStatus) {
				System.out.println("Es war zu wenig futter vorhanden.");
				return;
			}
		}
		
		// Durchlaufe den Stall nach Schweinen
		for(Schwein schwein : this.getBauernhof().getStall().getSchweine()) {
			if(schwein == null) {
				continue;
			}
			if(aktuelleAnzahlKarotten == 0 && !karottenStatus) {
				System.out.println("Die Karotten sind ausgegangen.");
				karottenStatus = true;
			}
			if(aktuelleAnzahlKarotten > 0) {
				this.fuettern(schwein, eimer.getKarotten()[aktuelleAnzahlKarotten - 1]);
				eimer.karotteGefressen();
				aktuelleAnzahlKarotten--;
			}
			if(aktuelleAnzahlKartoffeln == 0 && !kartoffelStatus) {
				System.out.println("Die Kartoffeln sind ausgegangen.");
				kartoffelStatus = true;
			}
			if(aktuelleAnzahlKartoffeln > 0) {
				this.fuettern(schwein, eimer.getKartoffeln()[aktuelleAnzahlKartoffeln - 1]);
				eimer.kartoffelGefressen();
				aktuelleAnzahlKartoffeln--;
			}
			
			// Ist der Eimer leer?
			if(aktuelleAnzahlKartoffeln == 0 && aktuelleAnzahlKarotten == 0 && kartoffelStatus && karottenStatus) {
				System.out.println("Es war zu wenig futter vorhanden.");
				return;
			}
		}
		
		// Ist noch Futter da?
		if(aktuelleAnzahlKartoffeln > 0 || aktuelleAnzahlKarotten > 0) {
			System.out.println("Es ist noch Futter uebrig.");
		} else {
			System.out.println("Das Futter hat genau gereicht.");
		}
	}
	
	
	public String toString() {
		return "Das ist Bauer " + this.getName() + ". Er ist " + this.getAlter() + " Jahre alt, " + this.getGroesse() + " cm gross und wiegt " +  this.getGewicht() + " kg.";
	}
	
	
}

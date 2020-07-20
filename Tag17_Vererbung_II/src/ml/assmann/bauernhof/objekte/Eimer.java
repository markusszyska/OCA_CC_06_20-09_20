package ml.assmann.bauernhof.objekte;

import ml.assmann.bauernhof.flora.*;

public class Eimer {
	
	/*
	 * Attribute
	 */
	private Karotte[] karotten;
	private Kartoffel[] kartoffeln;
	private int anzahlKarotten;
	private int anzahlKartoffeln;
	
	
	/*
	 * Getter/Setter
	 */
	public Karotte[] getKarotten() {
		return this.karotten;
	}
	
	private void setKarotten(Karotte[] karotten) {
		this.karotten = karotten;
	}
	
	public Kartoffel[] getKartoffeln() {
		return this.kartoffeln;
	}
	
	private void setKartoffeln(Kartoffel[] kartoffeln) {
		this.kartoffeln = kartoffeln;
	}
	
	public int getAnzahlKarotten() {
		return this.anzahlKarotten;
	}
	
	public void setAnzahlKarotten(int anzahlKarotten) {
		this.anzahlKarotten = anzahlKarotten;
	}
	
	public int getAnzahlKartoffeln() {
		return this.anzahlKartoffeln;
	}
	
	public void setAnzahlKartoffeln(int anzahlKartoffeln) {
		this.anzahlKartoffeln = anzahlKartoffeln;
	}
	
	/*
	 * Konstruktoren
	 */
	
	// Parameterlos
	public Eimer() {
		this(10,10);
	}
	
	// Voll parametrisiert
	public Eimer(int anzahlKartoffeln, int anzahlKarotten) {
		this.setAnzahlKartoffeln(anzahlKartoffeln);
		this.setAnzahlKarotten(anzahlKarotten);
		this.setKartoffeln(new Kartoffel[10]);
		this.setKarotten(new Karotte[10]);
		this.fuellen(anzahlKartoffeln, anzahlKarotten);
	}
	
	/*
	 * Methoden
	 */
	
	// Setzt kartoffel an Position index im Eimer
	private void setKartoffelAt(int index, Kartoffel kartoffel) {
		if(index < 0 || index > this.getKartoffeln().length) {
			System.out.println("Falsche Kartoffelposition");
			return;
		}
		this.getKartoffeln()[index] = kartoffel;
	}
	
	// Setzt karotte an Position index im Eimer
	private void setKarotteAt(int index, Karotte karotte) {
		if(index < 0 || index > this.getKarotten().length) {
			System.out.println("Falsche Karottenposition");
			return;
		}
		this.getKarotten()[index] = karotte;
	}
	
	// Leert den eimer und fuellt ihn mit anzahlKartoffeln Kartoffeln und anzahlKarotten Karotten
	public void fuellen(int anzahlKartoffeln, int anzahlKarotten) {
		for(int index=0;index<this.getKartoffeln().length;index++) {
			if(index < anzahlKartoffeln) this.setKartoffelAt(index, new Kartoffel((int)(Math.random()*50+1)));
			else this.setKartoffelAt(index, null);
		}
		for(int index=0;index<this.getKarotten().length;index++) {
			if(index < anzahlKarotten) this.setKarotteAt(index, new Karotte((int)(Math.random()*50+1)));
			else this.setKarotteAt(index, null);
		}
	}
	
	// Letzte Karotte wird gegessen und entfernt
	public void karotteGefressen() {
		this.setKarotteAt(this.getAnzahlKarotten()-1, null);
		this.setAnzahlKarotten(this.getAnzahlKarotten()-1);
	}
	
	// Letzte Kartoffel wird gegessen und entfernt
	public void kartoffelGefressen() {
		this.setKartoffelAt(this.getAnzahlKartoffeln()-1, null);
		this.setAnzahlKartoffeln(this.getAnzahlKartoffeln()-1);
	}

	public String toString() {
		return "Dieser Eimer ist gefuellt mit " + this.getAnzahlKarotten() + " Karotten und " + this.getAnzahlKartoffeln() + " Kartoffeln";
	}
	
	
	
	
	
	
}

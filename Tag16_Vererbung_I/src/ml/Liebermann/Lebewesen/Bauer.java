package ml.Liebermann.Lebewesen;

import ml.Liebermann.Gebaeude.Stall;
import ml.Liebermann.Items.Schluessel;
import ml.Liebermann.Nahrung.Kartoffel;
import ml.Liebermann.Nahrung.Moehre;
import ml.Liebermann.Bauernhof.*;

public class Bauer {
	private Bauernhof hof;
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private Stall meinStall;
	private Schluessel schluessel;
	private double kontostand;

	public Bauer(String name, int gewicht, int groesse, int alter) {
		hof = new Bauernhof();
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
		this.setKontostand(0);
		this.setMeinStall(hof.getMeinStall());
	}

	public Bauernhof getHof() {
		return hof;
	}

	public void setHof(Bauernhof hof) {
		this.hof = hof;
	}

	public void einpferchen(Schwein s1) {
		meinStall.setSchweinToStall(s1);

	}

	public void einpferchen(Kuh k1) {
		meinStall.setKuhToStall(k1);
	}

	public Schluessel getSchluessel() {
		return this.schluessel;
	}

	public void setSchluessel(Schluessel schluessel) {
		this.schluessel = schluessel;
	}

	public Stall getMeinStall() {
		return meinStall;
	}

	public void setMeinStall(Stall meinStall) {
		this.meinStall = meinStall;
	}

	public double getKontostand() {
		return kontostand;
	}

	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
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
		this.setGewicht(this.getGewicht() + m1.getGroesse());
		m1.wirdGegessen(this);
	}

	public String toString() {
		return "Der Bauer " + this.getName() + " ";
	}

	public void sellSchwein(String name) {
		Schwein refSchwein = meinStall.getSchweinByName(name);
		if (refSchwein != null)
			if (meinStall.delSchweinByRef(refSchwein)) {
				this.setKontostand(refSchwein.getVerkaufsPreis());
			}
	}

	public void sellKuh(String name) {
		Kuh refKuh = meinStall.getKuhByName(name);
		if (refKuh != null)
			if (meinStall.delKuhByRef(refKuh)) {
				this.setKontostand(refKuh.getVerkaufsPreis());
			}
	}
	
	public void fuettern(Schwein refSchwein, Kartoffel refKartoffel) {}

}

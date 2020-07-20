package ml.Liebermann.Lebewesen;

import ml.Liebermann.Items.Eimer;
import ml.Liebermann.Nahrung.Kartoffel;
import ml.Liebermann.Nahrung.Milch;
import ml.Liebermann.Nahrung.Moehre;

public class Kuh {
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private Milch milch = new Milch(20);
	private double verkaufsPreis = 599.99;
	// Get & Set
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
	

	public double getVerkaufsPreis() {
		return verkaufsPreis;
	}

	public void setVerkaufsPreis(double verkaufsPreis) {
		this.verkaufsPreis = verkaufsPreis;
	}

	// Konstruktor
	public Kuh(String name, int gewicht, int groesse, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
	}

	public void fressen(Kartoffel refKartoffel) {
		this.setGewicht(refKartoffel.getKnollengroesse() + this.getGewicht());
		refKartoffel.wirdGegessen(this);
	}
	
	public void fressen(Moehre moehre) {
		this.setGewicht(moehre.getRuebenlaenge() + this.getGewicht());
		moehre.wirdGegessen(this);
	}

	public String toString() {
		return "Die Kuh " + this.getName() + " ";
	}

	public Milch getMilch() {
		return milch;
	}

	public void setMilch(Milch milch) {
		this.milch = milch;
	}

	public void Melken(Eimer e1) {
		if (e1.getMilch().getMilchmenge() + this.getMilch().getMilchmenge() >= e1.getMAX_FUELLMENGE()) {
			this.setMilch(new Milch(
					e1.getMilch().getMilchmenge() + this.getMilch().getMilchmenge() - e1.getMAX_FUELLMENGE()));
			e1.fuellen(new Milch(e1.getMAX_FUELLMENGE()));
		}else {
			this.setMilch(new Milch(this.getMilch().getMilchmenge() - e1.getMilch().getMilchmenge()));
			e1.fuellen(this.milch);
		}
	}
}

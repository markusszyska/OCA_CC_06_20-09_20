package bauernhof.fauna;

import bauernhof.flora.Gemuese;
import bauernhof.flora.Kartoffel;
import bauernhof.flora.Moehre;

public class Schwein extends Nutztier{
	private boolean vegetarier;

	public boolean isVegetarier() {
		return vegetarier;
	}
	public void setVegetarier(boolean vegetarier) {
		this.vegetarier = vegetarier;
	}

	public Schwein() {
		this("Standardname", 0, 0, 0, false);
	}
	
	public Schwein(String name, int gewicht, int alter, int preis, boolean vegetarier) {
		super(name, gewicht, alter, preis);
		this.setVegetarier(vegetarier);
	}
	
//	public void fressen(Moehre m) {
//		m.wirdGegessen();
//	}	
//	public void fressen(Kartoffel k) {
//		k.wirdGegessen();
//	}
	
	public void fressen(Gemuese g) {
		g.wirdGegessen();
	}
	
	
	
	
	@Override
	public String toString() {
		String ausgabe = super.toString();
		ausgabe += "\nVegetarier: " + this.isVegetarier();
		return ausgabe;
	}
	
	
	
	
	
	
	
}

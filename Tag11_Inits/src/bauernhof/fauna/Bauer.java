package bauernhof.fauna;

import bauernhof.flora.Moehre;

public class Bauer {

	private String name;
	private int groesse;
	private int gewicht;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGroesse() {
		return groesse;
	}
	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	public Bauer() {
		this.setName("Standardbauer");
		this.setGewicht(80);
		this.setGroesse(180);
	}
	
	public void fuettern(Schwein s, Moehre m) {
		s.fressen(m);
	}
	
	
	
}

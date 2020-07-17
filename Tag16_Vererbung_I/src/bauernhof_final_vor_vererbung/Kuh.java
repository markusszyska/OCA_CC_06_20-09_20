package bauernhof_final_vor_vererbung;

public class Kuh {
	
	private String name, hauptfarbe, fleckenfarbe;
	private int milchmenge;
	private int gewicht;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHauptfarbe() {
		return hauptfarbe;
	}
	public void setHauptfarbe(String hauptfarbe) {
		this.hauptfarbe = hauptfarbe;
	}
	public String getFleckenfarbe() {
		return fleckenfarbe;
	}
	public void setFleckenfarbe(String fleckenfarbe) {
		this.fleckenfarbe = fleckenfarbe;
	}
	public int getMilchmenge() {
		return milchmenge;
	}
	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}
	
	public Kuh() {
		this("Milkakuh", "lila", "weiss", 100, 500);
	}
	
	public Kuh(String name, String hauptfarbe, String fleckenfarbe, int milchmenge, int gewicht) {
		this.setName(name);
		this.setHauptfarbe(hauptfarbe);
		this.setFleckenfarbe(fleckenfarbe);
		this.setMilchmenge(milchmenge);
		this.setGewicht(gewicht);
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "\n------------------Kuh:";
		ausgabe += "\nName: " + this.getName();
		ausgabe += "\nHauptfarbe: " + this.getHauptfarbe();
		ausgabe += "\nFleckenfarbe: " + this.getFleckenfarbe();
		ausgabe += "\nMilchmenge: " + this.getMilchmenge();
		ausgabe += "\nGewicht: " + this.getGewicht();
		return ausgabe;
	}
	
	public void fressen(Kartoffel k) {
//		k.setKnollengroesse(0);
		System.out.println("Die Kuh " +  this.getName() + " frisst");
		this.setGewicht(this.getGewicht() + k.wirdGegessen());
	}
	
	public void fressen(Moehre m) {
		System.out.println("Die Kuh " +  this.getName() + " frisst");
		this.setGewicht(this.getGewicht() + m.wirdGegessen());
	}
	
	
}

package bauernhof_final_vor_vererbung;

public class Schwein {
	private String name;
	private int gewicht;
	
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

	public Schwein() {
		this.setName("Standardname");
		this.gewicht = 250;
	}
	public Schwein(String name, int gewicht) {
		this.setName(name);
		this.setGewicht(gewicht);
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe+= "\n--------------Schwein:";
		ausgabe += "\nName: "+ this.getName();
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

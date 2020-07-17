package bauernhof_final_vor_vererbung;

public class Bauer {
	private String name;
	private int gewicht;
	private Stall stall;
	
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
	public Stall getStall() {
		return stall;
	}
	public void setStall(Stall stall) {
		this.stall = stall;
	}
	
	public Bauer() {
		this.setName("Standardname");
		this.setGewicht(80);
		this.setStall(new Stall(new Kuh("Kuh im default Konstruktor von Bauer", "weiss", "braun", 100, 400), new Schwein()));
	}
	
	public Bauer(String name, int alter, Stall stall) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setStall(stall);
	}
	
	public String toString() {
		String ausgabe = "";
		ausgabe += "-----------Bauer: ";
		ausgabe += "\nName: " + this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht();
		ausgabe += this.getStall();
		return ausgabe;
	}
	
	public void fuettern(Schwein s, Moehre m) {
		s.fressen(m);
	}
	
	public void fuettern(Schwein s, Kartoffel k) {
		s.fressen(k);
	}
	
	public void fuettern(Kuh k, Moehre m) {
		k.fressen(m);
	}
	
	public void fuettern(Kuh k, Kartoffel k1) {
		k.fressen(k1);
	}
}

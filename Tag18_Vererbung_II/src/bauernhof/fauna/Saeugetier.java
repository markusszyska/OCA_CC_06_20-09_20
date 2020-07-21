package bauernhof.fauna;

public class Saeugetier {
	private String name;
	private int gewicht;
	private int alter;
	
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
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public Saeugetier() {
		this("Standardname", 0, 0);
	}
	
	public Saeugetier(String name, int gewicht, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
	}
	public String toString() {
		String ausgabe = "";
		ausgabe += "Name: " + this.getName();
		ausgabe += "\nGewicht: " + this.getGewicht();
		ausgabe += "\nAlter: " + this.getAlter();
		return ausgabe;
	}
	
	
}

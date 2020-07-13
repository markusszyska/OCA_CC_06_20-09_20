package ml.thurairajah;

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
		this.setName("StandartBauer");
		this.setGewicht(80);
		this.setGroesse(180);
	}
	public void fuettern(Schwein s, Moehre m) {
		s.fressen(m); //in Schwein.java, Z69: fressen(Moehre paramMoehre)
	}
	public void melken(Kuh k, Eimer e) {
		k.melken2(e);
	}
}

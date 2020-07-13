package ml.kukulin.bauernhofsimulator;

public class Bauer {
	
	private String name;
	private int gewicht;
	private int groesse;
	private int alter;
	private boolean schluessel;
	
	public void melken(Kuh k) {
		k.wirdGemolken();
		
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
	
	public void setSchluessel(boolean schluessel) {
		
		this.schluessel = schluessel;
	}
	
	public boolean getSchluessel() {
	
	return schluessel;
	}
	
	public Bauer () {
		new Bauer("",0,0,0,true);
		
	}
	public Bauer ( String name,int gewicht,int groesse, int alter, boolean schluessel ) {
		this.schluessel=schluessel;
		this.setName(name);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
		this.setAlter(alter);
		
		
	}
	
}

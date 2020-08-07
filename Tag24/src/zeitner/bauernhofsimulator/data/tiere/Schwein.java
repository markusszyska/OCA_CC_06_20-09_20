package zeitner.bauernhofsimulator.data.tiere;

import zeitner.bauernhofsimulator.data.essen.IEssbar;

public class Schwein {

	//Attribute (Eigenschaften)
	//immer PRIVATE !!!!
	private String name;
	private int gewicht;
	
	//getter + setter
	//im Zweifelsfall Private !!!
	private String getName(){
		return this.name;
	}
	private void setName(String name){
		this.name = name;
	}
	private int getGewicht(){
		return this.gewicht;
	}
	private void setGewicht(int gewicht){
		if (gewicht >= 100){
			this.gewicht = gewicht;
		} else {
			this.gewicht = 100;
		}
		
		
	}
	//Konstruktoren
	//normalerweise PUBLIC
	//setzt alle Attribute auf gültige Ausgangswerte (initialisiert Diese)
	public Schwein(String name, int gewicht){
		super();
		this.setName(name);
		this.setGewicht(gewicht);
	}
	public Schwein(){
		this("DummySchwein",200);
	}
	//Standardmethoden
	//mind. toString()
	//ggf. clone() und equals()
	@Override
	public String toString() {
		return "Schwein " + this.getName() + " (" + this.getGewicht() + "kg)";
	}
	@Override
	public boolean equals(Object obj) {
		boolean gleich = false;
		if (this.getGewicht()==((Schwein)obj).getGewicht()) {
			if(this.getName().equals(((Schwein)obj).getName())) {
				gleich = true;
			}
		}
		return gleich;
	}
	@Override
	protected Schwein clone() {
		return new Schwein(this.getName(),this.getGewicht());
	}
	//Funktionalität
	//zumeist PUBLIC bis auf HILFSMETHODEN, diese dann private
	public void laufen(int schritte){
		this.setGewicht(this.getGewicht()-schritte);
	}
//	public void fressen(Kartoffel kartoffel, int menge){
//		this.setGewicht(this.getGewicht()+menge);
//		kartoffel.wirdgefressen(menge);
//	}
//	public void fressen(Moehre moehre, int menge){
//		this.setGewicht(this.getGewicht()+menge);
//		moehre.wirdgefressen(menge);
//	}
	public void fressen(IEssbar essbar, int menge){
		this.setGewicht(this.getGewicht()+menge);
		essbar.wirdgefressen(menge);
	}
}













 


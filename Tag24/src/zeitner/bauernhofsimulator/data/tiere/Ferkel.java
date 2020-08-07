package zeitner.bauernhofsimulator.data.tiere;

public class Ferkel extends Schwein{

	//Attribute (Eigenschaften)
	//immer PRIVATE !!!!
	private String fellfarbe;
	
	//getter + setter
	//im Zweifelsfall Private !!!
	private String getFellfarbe() {
		return this.fellfarbe;
	}
	private void setFellfarbe(String fellfarbe) {
		this.fellfarbe = fellfarbe;
	}
	//Konstruktoren
	//normalerweise PUBLIC
	//setzt alle Attribute auf gültige Ausgangswerte (initialisiert Diese)
	public Ferkel(String name, int gewicht, String fellfarbe){
		super(name,gewicht);
		this.setFellfarbe(fellfarbe);
	}
	public Ferkel(){
		this("DummyFerkel",200,"lila");
	}
	//Standardmethoden
	//mind. toString()
	//ggf. clone() und equals()
	@Override
	public String toString() {
		return "Ferkel" + super.toString().substring(7) + " und hat die Fellfarbe : " + this.getFellfarbe();
	}
	@Override
	public boolean equals(Object obj) {
		boolean gleich = false;
		if (super.equals((Schwein)obj)) {
			if(this.getFellfarbe().equals(((Ferkel)obj).getFellfarbe())) {
				gleich = true;
			}
		}
		return gleich;
	}
//	@Override
//	protected Ferkel clone() {
//		return new Ferkel(this.getName(),this.getGewicht(), this.getFellfarbe());
//	}
	//Funktionalität
	//zumeist PUBLIC bis auf HILFSMETHODEN, diese dann private


}













 


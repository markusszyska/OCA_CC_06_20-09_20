package zeitner.bauernhofsimulator.data.essen.gemuese;

public class Kartoffel extends AGemuese{

	//Attribute (Eigenschaften)
	//immer PRIVATE !!!!
	private int knollenzahl;
	
	//getter + setter
	//im Zweifelsfall Private !!!
	protected int getKnollenzahl(){
		return this.knollenzahl;
	}
	protected void setKnollenzahl(int knollenzahl){
		this.knollenzahl = knollenzahl;
	}
	//Konstruktoren
	//normalerweise PUBLIC
	//setzt alle Attribute auf gültige Ausgangswerte (initialisiert Diese)
	public Kartoffel(String sorte, int knollenzah){
		super(sorte);
		this.setKnollenzahl(knollenzah);
	}
	public Kartoffel(){
		this("Beata",200);
	}
	
	//Standardmethoden
	//mind. toString()
	//ggf. clone() und equals()
	@Override
	public String toString() {
		return super.toString() + " (" + this.getKnollenzahl() + "Knollen)";
	}

	//Funktionalität
	//zumeist PUBLIC bis auf HILFSMETHODEN, diese dann private
	public void wachsen(){
		this.setKnollenzahl(this.getKnollenzahl()+ this.getKnollenzahl()/2);
	}
	@Override
	public void wirdgefressen(int menge){
		this.setKnollenzahl(this.getKnollenzahl()-menge);
	}
}

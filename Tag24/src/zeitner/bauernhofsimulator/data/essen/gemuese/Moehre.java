package zeitner.bauernhofsimulator.data.essen.gemuese;

public class Moehre extends AGemuese{

	//Attribute (Eigenschaften)
	//immer PRIVATE !!!!
	private int ruebenlaenge;
	
	//getter + setter
	//im Zweifelsfall Private !!!
	private int getRuebenlaenge(){
		return this.ruebenlaenge;
	}
	private void setRuebenlaenge(int ruebenlaenge){
		this.ruebenlaenge = ruebenlaenge;
	}
	//Konstruktoren
	//normalerweise PUBLIC
	//setzt alle Attribute auf gültige Ausgangswerte (initialisiert Diese)
	public Moehre(String sorte, int ruebenlaenge){
		super(sorte);
		this.setRuebenlaenge(ruebenlaenge);
	}
	public Moehre(){
		this("Hasenglueck",200);
	}
	
	//Standardmethoden
	//mind. toString()
	//ggf. clone() und equals()
	@Override
	public String toString() {
		return super.toString() + " (" + this.getRuebenlaenge() + "m)";
	}

	//Funktionalität
	//zumeist PUBLIC bis auf HILFSMETHODEN, diese dann private
	public void wachsen(){
		this.setRuebenlaenge(this.getRuebenlaenge()+ this.getRuebenlaenge()+50);
	}
	//@Override
	public void wirdgefressen(int menge){
		this.setRuebenlaenge(this.getRuebenlaenge()-menge);
	}

}

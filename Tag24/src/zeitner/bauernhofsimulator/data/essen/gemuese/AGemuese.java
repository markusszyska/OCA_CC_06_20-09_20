package zeitner.bauernhofsimulator.data.essen.gemuese;

import zeitner.bauernhofsimulator.data.essen.IEssbar;

public abstract class AGemuese implements IEssbar {

	//Attribute (Eigenschaften)
	//immer PRIVATE !!!!
	private String sorte;
	
	//getter + setter
	//im Zweifelsfall Private !!!
	private String getSorte(){
		return this.sorte;
	}
	private void setSorte(String sorte){
		this.sorte = sorte;
	}

	//Konstruktoren
	//normalerweise PUBLIC
	//setzt alle Attribute auf gültige Ausgangswerte (initialisiert Diese)
	public AGemuese(String sorte){
		super();
		this.setSorte(sorte);
	}
	public AGemuese(){
		this("DummyGemuese");
	}
	
	//Standardmethoden
	//mind. toString()
	//ggf. clone() und equals()
	@Override
	public String toString() {
		return this.getSorte();
	}

	//Funktionalität
	//zumeist PUBLIC bis auf HILFSMETHODEN, diese dann private
//	public void wachsen(){
//		this.setRuebenlaenge(this.getRuebenlaenge()+ this.getRuebenlaenge()+50);
//	}
	@Override
	public abstract void wirdgefressen(int menge);
}

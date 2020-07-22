package demoAccessMods_II;

public class DemoAccessModsBeimUeberschreiben {
	void go() {}
	
}
class Child extends DemoAccessModsBeimUeberschreiben{
	/*
	 * Beim Ueberschreiben von Methoden darf die Sichtbarkeiten
	 * nicht eingeschraenkt werden
	 */
//	private void go() {}
	//aber erweitert
	public void go() {
		
	}
	//Beim Overloading darf die Sicht eingeschraenkt werden
	private void go(int zahl) {
		
	}
	
	
}
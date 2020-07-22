package demoAccessMods_II;

import demoAccessMods_II.pkg01.Kind;

public class Application {
	public static void main(String[] args) {
		ElternKlasse ek = new Kind();
//		ek.doStuff();
		
		Kind k = new Kind();
		k.doStuff();
		
		ek.go();
		k.go();
	}
}

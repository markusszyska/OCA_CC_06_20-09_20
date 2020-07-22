package demoAccessMods_II.pkg01;

import demoAccessMods_II.ElternKlasse;

public class Kind extends ElternKlasse {
	public void doStuff() {
		System.out.println("doStuff in Kindklasse");
	}
	public void go() {
		super.go();
	}
}

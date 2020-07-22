package demoAccessMods_II.pkg01;

import demoAccessMods_II.DemoAccessModsBeimUeberschreiben;

public class Child extends DemoAccessModsBeimUeberschreiben{
	/*
	 * Hier kann die Sicht eingeschraenkt werden,
	 * da es sich nicht um Overriding handelt
	 */
	private void go() {}
	
}

//Die Reihenfolege ist immer: 
//Paketangabe
package kapitel1;

//Dann imports
import kapitel1.imports.pakA.*;

/*
 * Es darf nur eine public Klasse in der Datei geben
 * und die Klasse muss genauso heissen wie die Datei.
 * 
 * Wenn die Klasse nicht public ist, kann sie anders heissen 
 * als die Datei, kann dann aber nicht mehr gestartet werden.
 * 
 * Solange die Klasse mit der main Methode so heisst wie die Datei
 * kann sie sowohl public als auch paketsichtbar gestartet werden.
 */

public class SourceFileDeclarationRules {
	public static void main(String[] args) {
		System.out.println("Hallo");
	}
}

class A {
	public static void main(String[] args) {
		System.out.println("Hallo");
	}
}
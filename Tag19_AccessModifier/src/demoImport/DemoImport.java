//Die Paketangabe muss die erste Anweisung in der Datei sein
//Kommentare duerfen davor stehen, aber keine Anweisungen
package demoImport;

import demoImport.a.InA;
import demoImport.b.*;

//import static demoImport.a.InA.statAttr;
//import static demoImport.a.InA.doStuff;
import static demoImport.a.InA.*;
import static java.lang.System.out;

public class DemoImport {
//	public static String statAttr = "a.InA.statAttr";
	
	public static void main(String[] args) {
		/*
		 * Der voll qualifizierte Name einer Klasse
		 * besteht aus ihrem Paketpfad und dem Klassennamen
		 * Imports sind zum bekannt machen einer Klasse und dienen 
		 * nur zur Verringerung der Schreibarbeit
		 * "*" importiert keine Subpakete
		 */
		InA aInA = new InA();
		demoImport.b.InA bInA = new demoImport.b.InA();
		
//		System.out.println(aInA.getClass() == bInA.getClass());
		
		InB bInB = new InB();
		InB2 bInB2 = new InB2();
		
		System.out.println(statAttr);
		doStuff();
		
		out.println(aInA);

	}
	
}

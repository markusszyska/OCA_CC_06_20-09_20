package kapitel1.imports;
//Der Import mit * importiert keine Subpakete
import kapitel1.imports.pakA.*;
//import kapitel1.imports.pakA.subPak.ClassD;
//import static kapitel1.imports.pakA.ClassA.go;
//import static kapitel1.imports.pakA.ClassA.*;
//import static kapitel1.imports.pakB.ClassB.*;
public class DemoImports {
	public static void main(String[] args) {
//		ClassD.go();
		/*
		 * Der einzige Zweck von imports ist es Schreibarbeit zu sparen
		 */
		kapitel1.imports.pakA.ClassA.go();
		/*
		 * Mit dem Import kann die Klasse ohne Paketangabe genutzt werden.
		 */
//		ClassA.go();
		/*
		 * Um ein statisches Member einer Klasse ohne Klassennamen nutzen
		 * zu koennen, muss ein statischer Import erfolgen.
		 * Entweder geziehlt gie Methode oder das Attribut, oder mit einem Stern
		 * alle statischen Ihalte der Klasse.
		 * Ein import static der Ihalte einer Klasse macht nicht die Klasse selber bekannt.
		 * 
		 * Mit: import static kapitel1.imports.pakA.ClassA.*;
		 * kann go() somit nur ohne Klassennamen benutzt werden.
		 * 
		 * ClassA.go() erzeugt einen Kompilierfehler, da ClassA nicht bekannt ist.
		 */				
//		go();
//		System.out.println(go);
		/*
		 * Wenn die Inhalte von zwei Klassen statisch mit Stern importiert werden
		 * muss zum Benutzen der Methode der voll qualifizierte Klassenname genutzt werden
		 * 
		 * Ein gezielter statischer Import einer Methode hat hoehrere Prioritaet als
		 * der Import mit Stern.
		 */
		kapitel1.imports.pakA.ClassA.go();
		kapitel1.imports.pakB.ClassB.go();
		/*
		 * Mit imports lassen sich keine Sichtbarkeiten aushebeln
		 * ClassC ist nicht sichtbar trotz import, da sie Paketsichtbarkeit hat.
		 */
//		ClassC.go();
		
	}
}

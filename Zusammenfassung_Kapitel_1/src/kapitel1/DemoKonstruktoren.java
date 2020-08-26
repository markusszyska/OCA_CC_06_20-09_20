package kapitel1;

public class DemoKonstruktoren {

	/*
	 * Kontruktoren:
	 * - Ein Konstruktor muss heissen wie die Klasse
	 * - Konstruktoren koennen Argumente haben, aber keinen Rueckgabetyp
	 * - Konstruktoren koennen ueberladen werden
	 */
	
	//public MeinKonstruktor(){}
	
	/*
	 * Methoden koennen auch so heissen wie die Klasse.
	 */
	public void DemoKonstruktoren() {}
	
	/*
	 * Wenn eine Klasse keinen Konstruktor hat, bekommt sie vom
	 * Compiler den "Default" Konstruktor, einen parameterlosen Konstruktor
	 * Wenn eine Klasse einen parametrisierten Konstruktor hat, steht der 
	 * "Default" Konstruktor nicht mehr zur Verfuegung.
	 * 
	 * Da jeder Konstruktor einer Kindklasse den parameterlosen Konstruktor
	 * der Elternklasse aufruft, gibt es einen Kompilierfehler, wenn dieser nicht vorhanden ist.
	 * 
	 */
}


class Parent{

}

class Child extends Parent{
	
}

package kapitel2.constructors;

public class DemoConstructors {
	public static void main(String[] args) {
	
	}
}

class A {
	/*
	 * Konstruktoren: 
	 * - Ein Konstruktor wird immer ausgefuehrt, wenn ein Objekt
	 * erstellt wird 
	 * - Jeder Elternklassenkonstruktor in der Klassenhirarchie des
	 * Objektes wird aufgerufen.
	 * - Auch abstrakte Klassen haben Konstruktoren
	 * - Konstruktoren haben keinen Rueckgabewert
	 * - Konstruktoren koennen alle Sichtbarkeiten haben
	 * - Wenn eine eine Klasse keinen Konstruktor hat, erstellt der Compiler
	 * 	einen parameterlosen default Konstruktor
	 * - Auch ein Enum hat einen Konstruktor, der immer private ist
	 * - Interfaces haben keinen Konstruktor
	 * 
	 */
	A() {

	}

}

class B {
	B() {
		this(1);
	}
	B(int i){
		super();
	}
}
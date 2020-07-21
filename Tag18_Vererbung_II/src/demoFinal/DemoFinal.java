package demoFinal;

public class DemoFinal extends Parent {

	public static final String STATICFINAL; // = "staticfinal";
	public final String NONSTATICFINAL; // = "nonstatic final";
	/*
	 * Eine statische Konstante muss entweder bei der Deklaration initialisiert
	 * werden oder in einem statischen Initialisierungsblock
	 */
	static {
		STATICFINAL = "staticfinal";
	}
	/*
	 * Eine nicht statische Konstante muss bei der Deklaration, in einem
	 * Initialisierungsblock oder im Konstruktor initialisiert werden
	 */
	{
//		NONSTATICFINAL = "nonstatic final";
	}

	public DemoFinal() {
		NONSTATICFINAL = "nonstatic final";
	}

	public static void main(String[] args) {
		final int zahl;
		zahl = 100;
//		zahl = 10;
		final Object o = new Object();
//		o = new Object();		
	}

	/*
	 * Eine finale Methode kann nicht ueberschrieben werden
	 */
//	void go() {
//
//	}
	/*
	 * Hier wird die geerbte Methode ueberladen.
	 */
	void go(int zahl) {

	}

}

class Parent {
	final void go() {

	}
}

final class A extends Object{
	
}
//The type B cannot subclass the final class A
//class B extends A{
//	
//}
//String ist eine finale Klasse
//class B extends String{
//	
//}



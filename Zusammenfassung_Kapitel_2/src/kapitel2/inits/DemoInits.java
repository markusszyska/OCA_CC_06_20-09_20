package kapitel2.inits;

public class DemoInits {
	/*
	 * Reihenfolge Init Bloecke:
	 * 
	 * 1. Alle statischen Felder von Object abwaerts in der Reihenfolge
	 * wie sie in der Klasse stehen
	 * 2. Alle Instanzfelder -> Bloecke vor Konstruktoren
	 * 
	 */
	public static void main(String[] args) {
		B b = new B();
		System.out.println("---------------zweites Objekt erzeugt--------------");
		B b1 = new B();
		
		B b3 = (B)new A();
	}
}

class A{
	A(){
		System.out.println("Konstruktor von A");
	}
	static String staticStringClassA = retStringStaticParent();
	static {
		System.out.println("class A static");
	}

	{
		System.out.println("class A nonstatic");
	}
	static String retStringStaticParent() {
		System.out.println("retStringStaticParent()");
		return "";
	}
}

class B extends A{
	static {
		System.out.println("class B static");
	}
	{
		System.out.println("class B nonstatic");
	}
	B(){
		System.out.println("Konstruktor von B");
	}
}
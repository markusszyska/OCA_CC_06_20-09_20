package kapitel2.polymorphie.wiederholungPolymorphie;

public class DemoPolymorphie {
	public static void main(String[] args) {
		/*
		 * Der Datentyp einer Referenzvariablen kann nicht geaendert werden
		 * aber sie kann ein Objekt eines Subtypes referenzieren
		 */
		A ref1;
		ref1 = new A();
		ref1 = new B();
		ref1 = new C();
		/*
		 * Um ein Objekt einer Klasse zu referenzieren kann jeder
		 * Supertyp der Klasse genutzt werden
		 */
		I refI = new C();
		A refA = new C();
		B refB = new C();
		C refC = new C();
		
		//Referenzseite = Objektseite
		/*
		 * Die Referenzseite entscheidet welche Methoden 
		 * zur Kompilierzeit zur Verfuegung stehen.
		 * 
		 * Die Objektseite entscheidet darueber, welche Implementation
		 * einer Methode zur Laufzeit ausgefuehrt wird -> Polymorphie von Methoden
		 * 
		 * Polymorphie gilt nur bei Instanzmethoden
		 */
		/*
		 * refI.go(); 
		 * Die Methode go() der Klasse C wird zur Laufzeit ausgefuehrt, 
		 * da der Objekttyp C ist.
		 */
		refI.go();
	}
}

interface I {
	void go();
	default void goDef() {};
}

class A implements I{
	/*
	 * Die Ueberschreibene Methode:
	 * - Muss die selben Argumente haben
	 * - Muss den selben Rueckgabetyp haben, Ausnahme: Covarianz
	 * - Darf die Sicht nicht einschraenken
	 * - Nur Methoden, die von der Kindklasse gesehen werden,
	 *  koennen ueberschrieben werden.
	 * - Darf keine neuen oder allgemeinere checked Exception deklarieren
	 * - Darf weniger oder speziellere Exceptions deklarieren(gilt fuer checked Exceptions)
	 * 
	 */		
	@Override
	public void go() {
		System.out.println("go in A");
		I.super.goDef();
	}
	
	/*
	 * Die Ueberladene Methode:
	 * - Muss unterschiedliche Argumente haben
	 * - Der Rueckgabetyp darf geaendert werden
	 * - Die Sichtbarkeit darf eingeschraenkt werden
	 * - checked Exceptions duerfen hinzugefuegt werden
	 */
	private void go(int i)throws Exception{}
	
	
	final void finalGo() {}
}

class B extends A {
	@Override
	public void go() {
		System.out.println("go in B");	
		super.go();
		
	}
	//final Methoden koennen nicht ueberschrieben werden
	//Cannot override the final method from A
//	void finalGo() {}
}

class C extends B {
	@Override
	public void go() {
		System.out.println("go in C");		
	}
}

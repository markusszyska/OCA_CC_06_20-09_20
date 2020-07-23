package demoAbstract;

public abstract class AAbstractParent extends Grandfather implements IInterface {
	//-----------------Attribute---------------------
	/*
	 * Auf ein statisches Attribut kann ueber den Klassennamen der
	 * abstrakten Elternklasse oder aller Kindklassen zugegriffen werden.
	 */
	public static final int STATICCONSTANT = 5;
	public final int NONSTATICCONSTANT = 10;
	//------------------Methoden---------------------------
	/*
	 * Sobald eine Methode in einer Klasse abstract ist,
	 * muss auch die Klasse abstract sein.
	 */
	public abstract void anAabstractMethodInAbstractParent();
	/*
	 * Eine abstrakte Klasse kann auch konkrete Methoden enthalten,
	 * die dann an die Kindklassen vererbt werden und in den Kindklassen
	 * ueberschrieben werden koennen, aber nicht muessen.
	 */
	public void anNonAbstractMethodInAbstractParent() {
		System.out.println("non abstract method in abstract parent");
	}
	
	/*
	 * Auch eine nicht abstrakte Methode in der abstrakten Klasse
	 * kann eigene andere abstrakte wie auch konkrete Methoden aufrufen
	 */
	public void callAMethodInAbstractParent() {
		this.anNonAbstractMethodInAbstractParent();
		this.anAabstractMethodInAbstractParent();
	}
	
	public static void aStaticMethodInAbstractParent() {
		System.out.println("a static method in abstract parent");
	}
	
	//------------------Konstruktoren-------------
	/*
	 * Auch in einer abstrakten Klasse existieren
	 * Konstruktoren
	 */
	public AAbstractParent() {
		
	}
	
//	public abstract AAbstractParent();
	
	
	
	
}

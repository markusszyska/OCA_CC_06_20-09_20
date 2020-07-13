package demoInit;

public class DemoInit extends ParentInit{

	/*
	 * 1. statischen Init Bloecke der obersten Elternklasse
	 * 
	 * 2. statischen Init Bloecke der Kindklasse
	 * 
	 * 3. Instanz Init Bloecke der Elternklasse
	 * 
	 * 4. restliche Konstruktor der Elternklasse
	 * 
	 * 5. Instanz Init Bloecke der Kindklasse
	 * 
	 * 6. restliche Konstruktor der Kindklasse
	 * 
	 */		
	public static String staticString;
	public String nonStaticString;

	// Initialisierungsbloecke: 2 Arten static und non static

	/*
	 * static Init-Block Wird beim Laden einer Klasse ausgefuehrt, also bevor
	 * Objekte dieser Klasse erzeugt werden koennen. Demozufolge koennen nur
	 * statische Member dieser Klasse benutzt werden. Sie werden von oben nach unten
	 * abgearbeitet und koennen an beliebiger Stelle in der Klasse stehen.
	 */
	static {
		// Nur Zugriff auf die statischen Member der Klasse
//		nonStaticString = "non Static String";
		staticString = "static String in static Init";
//		System.out.println(staticString);
		System.out.println("1st static Init");
		
	}
	static {
		System.out.println("2nd static Init");
	}
	
	//non static Init Block
	/*
	 * Wird bei der Erzeugung jedes Objektes dieser Klasse aufgerufen.
	 * Sie werden von oben nach unten abgearbeitet und koennen an beliebiger
	 * Stelle in der Klasse stehen.
	 * Zugriff auf alle Member der Klasse
	 */
	{
		nonStaticString = "non Static String";
		staticString = "static String in Non Static Init";
		System.out.println("1st instance init block");
	}
	{
		System.out.println("2nd instance init block");
	}
	
	public DemoInit() {
		this(1);
		System.out.println("no arg Contructor");
	}
	
	public DemoInit(int x) {
		super();
		System.out.println("one arg constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Programmstart");
		new DemoInit();
		System.out.println("Programmende");
	}

	
	
}

package kapitel1;

public class Kapitel1 {
	
	public static void main(String... hallo) {		
		System.out.println("Programmende");

	}
	/*
	 * Die main Methode kann ueberladen werden.
	 * Der Einstiegspunkt fuer das Programm ist aber immer die
	 * main Methode mit den special Powers.
	 */
	
	public static void main() {
		System.out.println("Hallo main");
	}
	public static void main(String[] args, Integer zahl) {
		System.out.println("Hallo main mit Integer");
	}
	
	public static void mainMethode() {
		//gueltige main Methoden mit special Powers
		
		//Die eckige Klammer kann hinter dem Bezeichner stehen
//		public static void main(String hallo[])
		
		//Der Name des Parameters kann anders sein
//		public static void main(String[] hallo)
		
		//Varargs sind auch gueltig
		//public static void main(String... hallo)
		
		//static und public koennen vertauscht sein
		//static public void main(String... hallo)
		
		//Die Main Methode kann final sein
		//final public static void main(String[] args)
	}
	
	
	
	public static void identifier() {
		/*
		 * Identifier duerfen mit Buchstaben, Unterstrichen oder Waehrungszeichen
		 * beginnen
		 */
		int _;
		int €;
		/*
		 * Nach dem ersten Buchstaben koennen Zahlen enthalten sein
		 */
		int i1;
//		int 1i;
		/*
		 * Identifier koennen jede Laenge haben
		 */
		int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;		
		/*
		 * Keywords sind verboten
		 */
//		int int;
		//Klassennamen sind keine Keywords
		String String;
		Integer Integer;
	}
}

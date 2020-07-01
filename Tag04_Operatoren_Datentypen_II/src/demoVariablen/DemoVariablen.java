package demoVariablen;

public class DemoVariablen {

	public static void main(String[] args) {
		
		// einzeiliger Kommentar
		
		/*
		 * mehrzeiliger Kommentar
		 */
		
		/**
		 * Java Doc Kommentar
		 * 
		 * @author szysk
		 * @param
		 * @return
		 */
		System.out.println("Hallo Welt");
		
		/*
		 * Variablen sind Wertebehaelter, die Werte wie z.B. Zahlen oder Zeichenketten
		 * aufnehmen koennen. Ueber den Bezeichner der Variablen kann auf den Wert
		 * zugegriffen werden. Einer Variablen weist man einen Wert mit einem
		 * Gleichheitszeichen und dahinter dem Wert zu. Dabei muss der Wert dem 
		 * angegeben Datentyp entsprechen.
		 */
		String meinText = "Hallo Welt";
		System.out.println(meinText);
		
		//Deklaration
		String meinText2;
		//The local variable meinText2 may not have been initialized
		//Erst wenn eine Variable initialisiert ist, kann sie benutzt werden.
//		System.out.println(meinText2);
		
		//Initialisierung
		meinText2 = "Hallo Welt";
		
		//Deklaration und Initialisierung in einem Schritt
		String meinText3 = "Hallo Welt";
		
		//Variablen Bezeichner/Identifier
		//keine Keywords
//		int int = 5;
		int Int = 5;
		
		//Keine Sonderzeichen
//		int +zahl = 5;
		//Bezeichner muessen mit einem Buchstaben beginnen
//		int 5zahl = 5;
		int za3l = 5;
		
		//Alle Waehrungszeichen sind gueltige Bezeichner
		int € = 5;
		int $ = 5;
		int $zahl = 5;
		
		int _ = 5;
		int _zahl = 5;
		
		//Klassennamen sind keine Keywords
		String String = "";
		
		
	}
	
}

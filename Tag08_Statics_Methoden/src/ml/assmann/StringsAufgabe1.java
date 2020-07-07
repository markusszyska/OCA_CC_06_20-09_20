package ml.assmann;

public class StringsAufgabe1 {
	public static void main(String[] args) {
		//Variablen
		String vorname = "Christian";
		String nachname = "Assmann";
		String name = vorname + " " + nachname;
		String kuerzel;
		
		//Teil 1
		System.out.println(name);
		
		//Teil 2
		System.out.println("Länge des Vornamens: " + vorname.length());
		System.out.println("Länge des Nachnamens: " + nachname.length());
		System.out.println("Länge des Namens: " + (name.length()-1));
		
		//Teil 3
		kuerzel = "" + vorname.charAt(0) + nachname.charAt(0);
		System.out.println("Kuerzel: " + kuerzel);
	}
}

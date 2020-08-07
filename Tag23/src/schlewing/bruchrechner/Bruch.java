package schlewing.bruchrechner;

import java.util.Scanner;

public class Bruch {
	
	public static void main(String args[]) {
		
		/* Eingabe String */
		Scanner eingabe_string = new Scanner(System.in);
    	String eingabe = "";
    	System.out.println("--------------------------------- BRUCHRECHNER -----------------------------------");
    	System.out.println("Bruchstrich = /, Addition  = +, Subtraktion = -, Multiplikation = *, Division = : ");
		System.out.println("Bitte geben Sie die Rechenaufgabe Bruchrechnen ein, Ende mit <enter>");
		
		eingabe = eingabe_string.nextLine();
			eingabe_string.close();  /* Schliessen, sonst meckert Compiler */
		
		/* Initialisierung Ergebnis-Array */
		int [] ergebnis_bruch;
			ergebnis_bruch = new int[2];
		
		/* Ueberpruefung Eingabe auf Rechenoperatoren der Bruchrechnung */
		if (eingabe.contains("+")) {
			String ch = "+";
			String bruch1 = eingabe.substring(0,eingabe.indexOf(ch));
			String bruch2 = eingabe.substring(eingabe.indexOf(ch)+1,eingabe.length());
			
			/* Erzeugt neues Objekt und uebergibt Strings beider Brueche an Objekt-Methode */
			addition add = new addition();
			add.setBruch1(bruch1);
			add.setBruch2(bruch2);
		
			/* Holt Ergebnis-Feld per getter-Methode */
			ergebnis_bruch = add.getErgebnis();
		
			/* Ausgabe des Ergebnisses */
			System.out.println("Ergebnis der Addition: ");
	
			/* Feld/Array ausgeben */
				System.out.println(ergebnis_bruch[0]);
				System.out.println("-");
				System.out.println(ergebnis_bruch[1]);
			
			}
		
		/* analog */
		if (eingabe.contains("-")) {
			String ch = "-";
			String bruch1 = eingabe.substring(0,eingabe.indexOf(ch));
			String bruch2 = eingabe.substring(eingabe.indexOf(ch)+1,eingabe.length());
					
			subtraktion sub = new subtraktion();
			sub.setBruch1(bruch1);
			sub.setBruch2(bruch2);
		
			ergebnis_bruch = sub.getErgebnis();
		
			System.out.println("Ergebnis der Subtraktion: ");
			
			/* Feld/Array ausgeben */
			System.out.println(ergebnis_bruch[0]);
			System.out.println("-");
			System.out.println(ergebnis_bruch[1]);
			}
		
		/* analog */
		if (eingabe.contains("*")) {
			String ch = "*";
			String bruch1 = eingabe.substring(0,eingabe.indexOf(ch));
			String bruch2 = eingabe.substring(eingabe.indexOf(ch)+1,eingabe.length());
					
			multiplikation mult = new multiplikation();
			mult.setBruch1(bruch1);
			mult.setBruch2(bruch2);
		
			ergebnis_bruch = mult.getErgebnis();
		
			System.out.println("Ergebnis der multiplikation: ");
			
			/* Feld/Array ausgeben */
			System.out.println(ergebnis_bruch[0]);
			System.out.println("-");
			System.out.println(ergebnis_bruch[1]);
			}
		
		/* analog */
		if (eingabe.contains(":")) {
			String ch = ":";
			String bruch1 = eingabe.substring(0,eingabe.indexOf(ch));
			String bruch2 = eingabe.substring(eingabe.indexOf(ch)+1,eingabe.length());
					
			division div = new division();
			div.setBruch1(bruch1);
			div.setBruch2(bruch2);
		
			ergebnis_bruch = div.getErgebnis();
		
			System.out.println("Ergebnis der division: ");
			
			/* Feld/Array ausgeben */
			System.out.println(ergebnis_bruch[0]);
			System.out.println("-");
			System.out.println(ergebnis_bruch[1]);
			}
	}
}


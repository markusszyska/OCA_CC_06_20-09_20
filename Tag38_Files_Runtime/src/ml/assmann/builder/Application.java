package ml.assmann.builder;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
//		aufgabe1("Haus");
//		aufgabe2();
//		aufgabe3String();
//		aufgabe3StringBuilder();
//		aufgabe4String();
//		aufgabe4StringBuilder();
	}

	/*
	 * Aufgabe 1 - einen String umdrehen
	 */
	private static void aufgabe1(String string) {
		
		//########################################
		//############## mit String ##############
		//########################################
		String ausgabe = "";
		for(int i = string.length()-1;i>=0;i--) {
			ausgabe += string.charAt(i);
		}
		System.out.println("Ausgabe mit String: " + ausgabe);
		
		//########################################
		//########## mit StringBuilder ###########
		//########################################
		StringBuilder builder = new StringBuilder(string);
		System.out.println("Ausgabe mit StringBuilder: " + builder.reverse()); 
	}	
	
	/*
	 * Aufgabe 2 - eine Eingabe verschluesseln.
	 */
	private static void aufgabe2() {
		
		// Eingabe einlesen
		Scanner tastatur = new Scanner(System.in);
		System.out.println("Bitte String eingeben: ");
		String eingabe = tastatur.nextLine();
		
		//########################################
		//############## mit String ##############
		//########################################
		String ausgabe = "";
		
		/*
		 * Ueber den String iterieren und immer 2 Zeichen vorruecken.
		 * Dabei die Zeichenreihenfolge herumdrehen.
		 */
		for(int i = 1;i<eingabe.length();i+=2) {
			ausgabe += "" + eingabe.charAt(i) + eingabe.charAt(i-1);
		}
		
		/*
		 * Falls der String ungerade Laenge hat, muss das letzte Zeichen
		 * angefuegt werden.
		 */
		if(eingabe.length() % 2 != 0) {
			ausgabe += eingabe.charAt(eingabe.length()-1);
		}
		
		// Ausgabe
		System.out.println("Verschlüsselter String mit String: " + ausgabe);
		
		//########################################
		//########## mit StringBuilder ###########
		//########################################
		StringBuilder builder = new StringBuilder(eingabe);
		
		/*
		 * Ueber den Inhalt iterieren und dabei jeweils 2 Zeichen vertauschen mit
		 * replace(). Oder aber mittels substring() und reverse() jeweils 2 Zeichen
		 * tauschen. Benoetigt aber immer neuen StringBuilder und toString()
		 */
		for(int i = 1;i<eingabe.length();i+=2) {
//			builder.replace(i-1, i+1, new StringBuilder(eingabe.substring(i-1,i+1)).reverse().toString());
			String tmp = "" + builder.charAt(i);
			builder.replace(i, i+1, "" + builder.charAt(i-1));
			builder.replace(i-1, i, tmp);
		}
		
		// Ausgabe
		System.out.println("Verschlüsselter String mit StringBuilder: " + builder);
	}
	
	
	/*
	 * Aufgabe 3 (String) - Wert=Value Eingabe ueberpruefen und ausgeben
	 */
	private static void aufgabe3String() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eingabe 'Name=Wert':");
		
		/*
		 * Eingabeloop - Wenn kein =, neue Eingabe. Wenn der Name des Wertes
		 * vergessen wurde, neue Eingabe. Loesung mittels indexOf('=')
		 * und substring()
		 */
		boolean stayInLoop = true;
		do {
			String eingabe = sc.nextLine();
			int x = eingabe.indexOf("=");
			if(x == -1) {
				System.out.println("'=' vergessen, noch einmal eingeben!");
				continue;
			}
			if(x == 0) {
				System.out.println("Name vergessen, noch einmal eingeben!");
				continue;
			}
			System.out.println("Laenge des Strings: " + eingabe.length() 
				+ ", Name: " + eingabe.substring(0, x)
					+ ", Wert: " + eingabe.substring(x+1, eingabe.length())) ;
			stayInLoop = false;
		} while(stayInLoop);	
	}
	
	/*
	 * Aufgabe 3 (StringBuilder) - Wert=Value Eingabe ueberpruefen und ausgeben
	 */
	private static void aufgabe3StringBuilder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eingabe 'Name=Wert':");
		
		/*
		 * Eingabeloop - Wenn kein =, neue Eingabe. Wenn der Name des Wertes
		 * vergessen wurde, neue Eingabe. Loesung mittels indexOf('=')
		 * und substring()
		 */
		boolean stayInLoop = true;
		do {
			StringBuilder eingabe = new StringBuilder(sc.nextLine());
			int x = eingabe.indexOf("=");
			if(x == -1) {
				System.out.println("'=' vergessen, noch einmal eingeben!");
				continue;
			}
			if(x == 0) {
				System.out.println("Name vergessen, noch einmal eingeben!");
				continue;
			}
			System.out.println("Laenge des Strings: " + eingabe.length() 
				+ ", Name: " + eingabe.substring(0, x)
					+ ", Wert: " + eingabe.substring(x+1, eingabe.length())) ;
			stayInLoop = false;
		} while(stayInLoop);	
	}
	
	/*
	 * Aufgabe 4 (String) - eine positive ganze Zahl in binaercode umwandeln
	 */
	private static void aufgabe4String() {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Eingabeloop - Wenn keine positive Zahl oder ueberhaupt keine Zahl, 
		 * neue Eingabe. Abfrage mittels if. hier: mit try-catch rumgespielt.
		 */
		boolean stayInLoop = true;
		int eingabe = 0;
		do {
			try {
				System.out.println("Bitte eine positive ganze Zahl eingeben: ");
				eingabe = sc.nextInt();
				if(eingabe >= 0) {
					stayInLoop = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Das war keine Zahl!");
				sc.nextLine(); //Token wird bei exception nicht aus Scanner geloescht
			}
		} while(stayInLoop);
		
		
		int zahl = eingabe;
		String ausgabe = "";
		
		/*
		 * Umwandlung in binaer mittels loop
		 */
		boolean loopContinue = true;
		while(zahl != 0) {
			ausgabe += zahl % 2;
			zahl = zahl / 2;
		}
		
		/*
		 * String muss nun herumgedreht werden.
		 */
		String ausgabeReverse = "";
		
		// Schoenheits-OP: fuege Nullen an die Ausgabe
		int nullCounter = findNextFormat(ausgabe, 0);
		int digitCount = nullCounter;
		for(;nullCounter>0;nullCounter--) {
			ausgabeReverse += "0";
		}
		
		/*
		 * Drehe String nun herum und fuege alle 4 Stellen
		 * ein Leerzeichen ein.
		 */
		for(int i=ausgabe.length()-1;i>=0;i--) {
			if(digitCount != 0 && digitCount % 4 == 0) {
				ausgabeReverse += " ";
			}
			ausgabeReverse += ausgabe.charAt(i);
			digitCount++;
		}
		
		// Ausgabe
		System.out.println("Binaere darstellung von " + eingabe + " mit String ist: " + ausgabeReverse);
	}
	
	/*
	 * Aufgabe 4 (StringBuilder) - eine positive ganze Zahl in binaercode umwandeln
	 */
	private static void aufgabe4StringBuilder() {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Eingabeloop - Wenn keine positive Zahl oder ueberhaupt keine Zahl, 
		 * neue Eingabe. Abfrage mittels if. hier: mit try-catch rumgespielt.
		 */
		boolean stayInLoop = true;
		int eingabe = 0;
		do {
			try {
				System.out.println("Bitte positive ganze Zahl eingeben: ");
				eingabe = sc.nextInt();
				if(eingabe >= 0) {
					stayInLoop = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Das war keine Zahl!");
				sc.nextLine();
			}
		} while(stayInLoop);
		
		int zahl = eingabe;
		StringBuilder ausgabe = new StringBuilder();
		
		/*
		 * Umwandlung in binaer mittels loop
		 */
		int digitCount = 0;
		int nullCounter = 0;
		
		/*
		 * Im Gegensatz zu String: Fuege Leerzeichen alle 4 Ziffern
		 * direkt ein mittels insert(0, " "). Aber: nullCounter manuell
		 * mitzaehlen um fehlende Nullen am Ende anzufuegen.
		 * 
		 * Zudem: Ergebnis wird direkt in richtiger Reihenfolge
		 * dem StringBuilder hinzugefuegt mittels insert(). Kein
		 * umdrehen mehr noetig.
		 */
		while(zahl != 0) {
			if(digitCount % 4 == 0) {
				ausgabe.insert(0," ");
				nullCounter++;
			}
			ausgabe.insert(0,zahl % 2);
			zahl = zahl / 2;
			digitCount++;
		}
		
		/*
		 * Vorne mit Nullen auffuellen. Leerzeichen sind bereits vorhanden,
		 * deswegen muessen diese an die Methode uebergeben werden.
		 */
		nullCounter = findNextFormat(ausgabe.toString(),nullCounter);
		for(;nullCounter>0;nullCounter--) {
			ausgabe.insert(0,"0");
		}
		System.out.println("Binaere darstellung von " + eingabe + " mit StringBuilder ist: " + ausgabe);
	}

	
	/*
	 * Hilfsmethode um zu ermitteln, wieviele Nullen vorne angehaengt werden muessen.
	 * Anhangig von der aktuellen Ziffernzahl und den Leerzeichen
	 */
	private static int findNextFormat(String binaerzahl, int leerzeichen) {
		int x = binaerzahl.length() - leerzeichen;
		for(int i = 0; i<4;i++) {
			if((x+i) % 4 == 0) {
				x = i;
				break;
			}
		}
		return x;
	}	
	
}

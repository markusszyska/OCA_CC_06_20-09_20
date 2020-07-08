package ml.axelschlewing_aufgabe1;

/* Importieren der Methode Scanner aus Klasse java.util */
import java.util.Scanner;

public class ml_axelschlewing_aufgabe1_stringinversion {
	
	/* Statische Methode mit Parameter�bergabe <String text> und R�ckgabewert <String text2> */
		public static String inversion(String text)
		{
			/* Initialisierung text2 f�r R�ckgabe */
			String text2 = "";
			
			/* Ermittlung der Laenge der Zeichenkette */
			int text_laenge = text.length();
			
			/* Initialisierung der neuen Indexvariable */
			int index_neu = 0;
			
			/* for-Schleife zum Umdrehen der Zeichenkette */
			for (int index = 0; index < text_laenge; index++)
				{
					index_neu = text_laenge - index;
					System.out.print(text.charAt(index_neu-1));
				}
			/* R�ckgabe der Zeichenkette in text2 */
			return text2;
		}
	
	
	public static void main(String[] args) 
		{
			/* Eingabeaufforderung f�r Text */
			System.out.println("Bitte einen Text eingeben: ");
			
			/* Initialisierung von Objekt eingabe f�r Scanner */
			Scanner eingabe = new Scanner(System.in);
			
			/* Einlesen des Textes als ganze Zeile */
			String text = eingabe.nextLine();

			/* Kontrollausgabe des eingebenen Textes */
			System.out.println("Der Text hat " + text.length() + " Zeichen");
			
			/* Initialisierung von text2 */
			String text2;
			
			/* Aufruf statische Methode inversion zum Umkehren der Buchstabenreihenfolge */
			/* �bergabe des eingebenen Textes als Parameter an inversion */
			/* R�ckgabewert ist der Text in umgekehrter Buchstabenreihenfolge */
			text2 = inversion(text);
			
			/* Ausgabe des neuen Strings auf Konsole */
			System.out.println(text2);
		}
}

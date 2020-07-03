package ml.axelschlewing_tag05.ml_axelschlewing_022;

import java.util.Scanner;

public class ml_axelschlewing_022 {
	public static void main(String[] args) {
		System.out.println("Antworten sie mit Ja (j oder J) oder Nein (n oder N):");
		
		/* Einlesen Eingabe-String von der Tastatur */
		Scanner eingabe_antwort = new Scanner(System.in);
		String antwort = eingabe_antwort.next();
		
		/* separiert ein Zeichen aus dem Eingabe-String und gibt dieses an st2 */
		char st2 = antwort.charAt(0);
				
		/* Überprüfung auf ja/nein/sinnlos , anschliessend Ausgabe */
		if (st2 == 'J')
			{	
				System.out.println("Sie haben mit 'Ja' geantwortet");	
			}
		else if ( st2 == 'N')
			{	
				System.out.println("Sie haben mit 'Nein' geantwortet"); 
			}
		else
			{	
				System.out.println("Unzulässige Eingabe !");
			}
	}
}

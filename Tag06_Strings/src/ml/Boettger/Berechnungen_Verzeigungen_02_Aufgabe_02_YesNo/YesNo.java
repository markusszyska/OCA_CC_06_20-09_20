/*
 Aufgabe 2
 
Schreiben Sie ein Programm, das die Ausgabe
"Antworten sie mit Ja (j oder J) oder Nein (n oder N):"
erzeugt. Lesen Sie ein Zeichen von der Tastatur ein und geben Sie je nach
eingegebenem Buchstaben folgende Ausgabe aus:

"Sie haben mit nein geantwortet" oder
"Sie haben mit ja geantwortet" oder aber
"Sie haben eine falsche Eingabe gemacht."

 */

// don't read a single char, therefore use 1 and 0 acc. requesting
// our pilot Mr. Szyska

package ml.Boettger.Berechnungen_Verzeigungen_02_Aufgabe_02_YesNo;

import java.util.Scanner;

public class YesNo {
	public static void main(String[] args) {
		
		byte b_answer = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Please answer with Yes(1) or No(0): ");

		b_answer = sc.nextByte();

		System.out.println();
		if (b_answer == 1)
		{
			System.out.println("You answered yes.");
		}
		else if (b_answer == 0)
		{
			System.out.println("You answered no.");		
		}
		else
		{
			System.out.println("You have made a wrong entry.");
		}	
	}
}

package ml.assmann;

import java.util.Scanner;

public class JaNein {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Variablen deklarieren und initialisieren
		String eingabe = "";
		
		//Eingabe abfragen
		System.out.println("Antworten sie mit Ja (j oder J) oder Nein (n oder N):");
		eingabe = sc.next();
		
		//Eingabe behandeln
		if(eingabe.equals("n") || eingabe.equals("N")) System.out.println("Sie haben mit nein geantwortet");
		else if(eingabe.equals("j") || eingabe.equals("J")) System.out.println("Sie haben mit ja geantwortet");
		else System.out.println("Sie haben eine falsche Eingabe gemacht.");
		
		//Debug
//		System.out.println("Eingabe: " + eingabe);
		
	}
}

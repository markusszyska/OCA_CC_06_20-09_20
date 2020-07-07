package ml.assmann;

import java.util.Scanner;

public class StringsAufgabe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Variablen
		String eingabe = "";
		int ausgabe = 0;

		// Abfrage
		while (true) {
			System.out.println("Geben Sie nur ein Zeichen ein.");
			eingabe = sc.nextLine();
			if (eingabe.length() == 1)
				break; // Brich ab wenn nur ein Zeichen eingegeben wurde
		}

		// Wandle erste Position des Strings (i.e. das Zeichen) in einen int (=ASCII) um
		// und gib es aus
		ausgabe = eingabe.charAt(0);
		System.out.println("\"" + eingabe + "\": " + ausgabe);

	}
}

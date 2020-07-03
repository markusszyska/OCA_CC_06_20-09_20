package ml.neumann;

import java.util.Scanner;

public class Aufgabe_ja_nein {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Antworten Sie mit Ja (1) oder Nein (0)");
	int jn = sc.nextInt();
	
	if (jn == 1) {
		System.out.println("Sie haben mit ja geantwortet");
	} else if (jn == 0) {
		System.out.println ("Sie haben mit Nein geantwortet");
	} else {
		System.out.println ("Sie haben eine falsche Eingabe gemacht");
	}
}
}

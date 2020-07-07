package ml.vi;

import java.util.Scanner;

//Aufgabe 4
//Schreiben Sie ein Programm, das den Benutzer nach einem Kennwort fragt. Dieses Kennwort soll sicher sein. Zunächst bezeichnen wir ein Kennwort als sicher, wenn es mindestens 10 Zeichen beinhaltet. Schreiben Sie eine Funktion, die überprüft, ob das Kennwort diese Anforderung erfüllt. Im Hauptprogramm soll dieses Ergebnis ausgewertet werden. Falls es nicht sicher ist, teilen Sie dem Benutzer mit, wie viele Zeichen fehlen.
//o Erweitern Sie das Kennwortprogramm. Dazu verschärfen wir die Regeln für ein sicheres Kennwort. Als sicher gilt nun ein Kennwort, das aus mindestens einem Großbuchstaben und einer Ziffer besteht. Die Länge spielt nun keine Rolle mehr.
//o Erweitern Sie die Funktion, so dass diese nun prüft, ob im Kennwort sowohl ein Großbuchstabe als auch eine Ziffer steht.
//o Erweitern Sie das Programm nun so, dass die Funktion prüft, ob das Kennwort 10 Zeichen lang ist und mindestens einen Großbuchstaben und eine Ziffer enthält. Testen Sie die Funktion wieder.
//Zusatzaufgabe: Erweitern Sie die Funktion so, dass auch ein Kleinbuchstabe und ein Sonderzeichen enthalten sein muss.

public class Aufg4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String kennwort = scanner.next();

		System.out.println("Mindestens 10 Buchstaben? ");

		if (kennwort.length() < 10)
			System.out.println("Kennwort ist nicht sicher. Es fehlen " + (10 - kennwort.length()) + " Zeichen.");
		else
			System.out.println("Kennwort ist sicher.");

		System.out.println("Mindestens ein Großbuchstabe oder eine Ziffer?");

		boolean check_cap = false;
		boolean check_num = false;

		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			String temp = "" + (char) i;
			if (check_cap = kennwort.contains(temp))
				break;
		}

		for (int i = (int) '0'; i <= (int) '9'; i++) {
			String temp = "" + (char) i;
			if (check_num = kennwort.contains(temp))
				break;
		}

		if (check_cap || check_num)
			System.out.println("Kennwort ist sicher.");
		else
			System.out.println("Kennwort ist nicht sicher");

		System.out.println("Mindestens ein Großbuchstabe und eine Ziffer?");

		if (check_cap && check_num)
			System.out.println("Kennwort ist sicher.");
		else
			System.out.println("Kennwort ist nicht sicher");

		System.out.println("Mindestens 10 Buchstaben, ein Großbuchstabe und eine Ziffer?");

		if (check_cap && check_num && (kennwort.length() > 9))
			System.out.println("Kennwort ist sicher.");
		else
			System.out.println("Kennwort ist nicht sicher");

		scanner.close();

	}

}

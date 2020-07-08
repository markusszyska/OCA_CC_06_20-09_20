package ml.brainin;

import java.util.Scanner;
/*
Schreiben Sie eine Methode, die einen String entgegen nimmt
und die Buchstaben in umgekehrter Reihenfolge zurueckgibt.
Probieren Sie Ihre Methode aus, indem Sie sie aufrufen und ihr
verschiedene Strings uebergeben.
 */

public class Aufgabe_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------");
		while (true) {
			System.out.println("Bitte geben Sie ein Text ein : ");
			String text = sc.nextLine();
			if (text.equals("Ende")) break;
			String revText = doReverce(text);
			System.out.println("Das nuen Text : "+revText);
			System.out.println("--------------------");
		}
		sc.close();
		System.out.println("close .... done");
	}
	public static String doReverce(String text) {
		char[] revChars = text.toCharArray();
		StringBuffer revText = new StringBuffer();
		for (int i = revChars.length-1; i >=0; i--) {
			revText.append(revChars[i]);
		}
		return revText.toString();
	}
}

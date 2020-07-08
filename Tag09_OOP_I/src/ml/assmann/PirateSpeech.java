package ml.assmann;

import java.util.Scanner;

public class PirateSpeech {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variablendeklaration und Initialisierung
		String eingabe = "";
		String ausgabe = "";
		
		//Bearbeitungsschleife
		while(true) {
			System.out.println("Bitte geben Sie einen Text ein der piratifiziert werden soll.");
			eingabe = sc.nextLine();		
			if(eingabe.equals("Ende")) break;
			ausgabe = eingabe.replaceAll("a(?!u)", "arr"); //suche und ersetze alle a denen kein u folgt
			ausgabe = ausgabe.replaceAll("e(?!u)", "err"); //suche und ersetze alle e denen kein u folgt
			ausgabe = ausgabe.replace("i", "irr");
			ausgabe = ausgabe.replace("o", "orr");
			ausgabe = ausgabe.replaceAll("(?<![ae])u", "urr"); //suche und ersetze alle u vor denen kein a oder e ist
			ausgabe = ausgabe.replaceAll("au","aauurghs"); //suche und ersetze alle au
			ausgabe = ausgabe.replaceAll("eu","eeuurghs"); //suche und ersetze alle eu
			System.out.println(ausgabe);
			System.out.println("=================");		
		}
	}
}

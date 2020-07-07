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
			ausgabe = eingabe.replace("a", "arr");
			ausgabe = ausgabe.replace("e", "err");
			ausgabe = ausgabe.replace("i", "irr");
			ausgabe = ausgabe.replace("o", "orr");
			ausgabe = ausgabe.replace("u", "urr");
			System.out.println(ausgabe);
			System.out.println("=================");
			
			
		
		}
	}
}

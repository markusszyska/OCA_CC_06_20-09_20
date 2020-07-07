package ml.Liebermann;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		char q = 'A';
		System.out.println(Character.isDigit(q));
		// Aufgabe1();
		// Aufgabe2('a');
		// Aufgabe3();
		// Aufgabe4();
		Aufgabe5();
	}

	public static void Aufgabe1() {
		String vorname = "Matthias";
		String nachname = "Liebermann";
		String fullyName = vorname + " " + nachname;
		System.out.println(fullyName);
		System.out.println("Name: " + vorname.length());
		System.out.println("Nachname: " + nachname.length());
		System.out.println("Kompletter Name: " + fullyName.length()); // trim?
	}

	public static int Aufgabe2(char buchstabe) {
		char a = buchstabe;
		int newChar = (int) a;
		return newChar;
	}

	public static void Aufgabe3() {
		String eingabe = "";
		String ausgabe = "";
		int newChar;
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte den Text der umgewandelt werden soll eingeben.");
		eingabe = sc.next();

		for (int i = 0; i < eingabe.length(); i++) {
			newChar = (int) eingabe.charAt(i);

			ausgabe += newChar + " ";

		}
		System.out.println(ausgabe);

	}

	public static void Aufgabe4() {
		boolean state = false;
		String kennwort;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Bitte geben Sie ein Sicheres kennwort ein.");
			kennwort = sc.next();

			state = pwLenghtTest(kennwort) && pwHasUpper(kennwort) && pwHasNumber(kennwort) && pwHasSpecialChar(kennwort) ;
			if (!state) {
				if(!pwLenghtTest(kennwort)) {
					System.out.println("Passwort zu kurz bitte fügen Sie " + (10-kennwort.length()) + " Zeichen hinzu");
				}
				if(!pwHasUpper(kennwort)) {
					System.out.println("Bitte dem Passwort einen Großbuchstaben hinzufügen");
				}
				if(!pwHasNumber(kennwort)) {
					System.out.println("Passwort enthält keine Zahl bitte hinzufügen");
				}
				if(!pwHasSpecialChar(kennwort)) {
					System.out.println("Passwort enthält kein Sonderzeichen bitte hinzufügen");
				}	
			}
		} while (!state);
	}

	public static boolean pwLenghtTest(String pw) {
		boolean pwSafe = false;
//		System.out.println(pw.length() >= 10);
		if(pw.length() >= 10) {
			pwSafe = true;
		}
		return pwSafe;
		
	}
	public static boolean pwHasUpper(String pw) {
		boolean pwSafe = false;
		if(!pw.equals(pw.toLowerCase())) {
			pwSafe = true;
		}
		return pwSafe;
		
	}
	
	public static boolean pwHasNumber(String pw) {
		boolean hasNumber= false;
		for (int i = 0; i < 10; i++) {
			if(pw.contains(String.valueOf(i))){
				hasNumber = true;
				System.out.println();
			}	
		}
		return hasNumber;
	}
	
	public static boolean pwHasSpecialChar(String pw) {
		boolean hasSpecialChar = false;
		int newInt;
		for (int i = 0; i < pw.length(); i++) {
			newInt = (int)pw.charAt(i);
//			System.out.println(" " + newInt);
			if((newInt >= 32 && newInt <= 47) ||  (newInt >= 58 && newInt <= 64) || (newInt >= 91 && newInt <= 96)|| (newInt >= 123 && newInt <= 127)) 
			hasSpecialChar = true;
		}
		return hasSpecialChar;
		
		
	}
	public static void Aufgabe5() {
		System.out.println("Dezimalzahl \t Zeichen");
		for (int i = 32; i < 128; i++) {
			System.out.println(i + " \t " + ((char)i));
		}
		
		
		
	}
}
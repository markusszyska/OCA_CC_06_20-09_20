package ml.assmann;

import java.util.Scanner;

public class StringsAufgabe4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Variablen
		String kennwort = "";
		boolean safePassword = false;
		boolean safeNumber = false;
		boolean safeUpperCaseLetter = false;
		boolean safeLowerCaseLetter = false;
		boolean safeSpecialChar = false;
		
		//Abfrage
		System.out.println("Geben Sie ein Kennwort ein.");
		kennwort = sc.nextLine();
		
		//Teil 1 - Laenge
		safePassword = kennwort.length()>=10;
		if(!safePassword) System.out.println("Das Kennwort ist " + (10 - kennwort.length()) + " Zeichen zu kurz");
		
		//Teil 2 - Grossbuchstaben & Zahl
		for(int i = 0;i<kennwort.length();i++) {
			safeNumber = safeNumber || (kennwort.charAt(i) >= 48 && kennwort.charAt(i) <= 57);
			safeUpperCaseLetter = safeUpperCaseLetter || (kennwort.charAt(i) >= 65 && kennwort.charAt(i) <= 90); 
			if(safeNumber && safeUpperCaseLetter) break;
		}
		safePassword = safeNumber && safeUpperCaseLetter;
		if(!safePassword) System.out.println("Das Kennwort muss mindestens einen Grossbuchstaben und eine Zahl enthalten.");
		
		//Zusatz (ASCII)
//		for(int i = 0;i<kennwort.length();i++) {
//			if((kennwort.charAt(i) >= 33 && kennwort.charAt(i) <= 47) 
//					|| (kennwort.charAt(i) >= 58 && kennwort.charAt(i) <= 64) 
//					|| (kennwort.charAt(i) >= 91 && kennwort.charAt(i) <= 96) 
//					|| (kennwort.charAt(i) >= 123 && kennwort.charAt(i) <= 126)) safeSpecialChar = true;
//			if(kennwort.charAt(i) >= 97 && kennwort.charAt(i) <= 122) safeLowerCaseLetter = true;
//		}
//		safePassword = safePassword && safeSpecialChar && safeLowerCaseLetter;
//		if(!safePassword) System.out.println("Das Kennwort muss mindestens einen Grossbuchstaben, einen Kleinbuchstaben, eine Zahl und ein Sonderzeichen enthalten.");
		
		//Zusatz (unicode)
//		for(int i = 0;i<kennwort.length();i++) {
//			if(!(kennwort.charAt(i) >= 48 && kennwort.charAt(i) <= 57) 
//					|| !(kennwort.charAt(i) >= 65 && kennwort.charAt(i) <= 90) 
//					|| !(kennwort.charAt(i) >= 97 && kennwort.charAt(i) <= 122)) safeSpecialChar = true;
//			if(kennwort.charAt(i) >= 97 && kennwort.charAt(i) <= 122) safeLowerCaseLetter = true;
//		}
//		safePassword = safePassword && safeSpecialChar && safeLowerCaseLetter;
//		if(!safePassword) System.out.println("Das Kennwort muss mindestens einen Grossbuchstaben, einen Kleinbuchstaben, eine Zahl und ein Sonderzeichen enthalten.");
	}
}

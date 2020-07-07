package ml.thurairajah;

import java.util.Scanner;

public class Strings_Aufg2_CharToAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Zahl zw. 32 - 126 eingeben:");
	
		int abfrage = sc.nextInt();
		
		while (abfrage != 128) {
		System.out.println("Zahl zw. 32 - 126 eingeben:");
		abfrage = sc.nextInt();
		
		char ch = (char)abfrage;
		
		System.out.println(ch);
		}
		System.out.println("--Ende--");
	
	
	
	}

}

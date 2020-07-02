package ml.kukulin;

import java.util.Scanner;

public class Aufgabe1a {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		
		int zahl = sc.nextInt();
		int tag = zahl/86400;
		int st = (zahl%86400)/3600;
		int min = (zahl%3600)/60;
		int sec = zahl%60;
		
		
		System.out.println( zahl + " Sekunden sind: " + tag + " Tag(e) " + st + " Stunde(n)" + min + " Minute " + sec + "Sekunde(n)" );
		
		
		
		
		
	}
}
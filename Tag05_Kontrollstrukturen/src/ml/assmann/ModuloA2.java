package ml.assmann;

import java.util.Scanner;

public class ModuloA2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Zeiten definieren
		int dauerMinInSek = 60;
		int dauerStdInSek = 3600;
		int dauerTagInSek = 3600*24;
		
		//Eingabe anfordern
		System.out.println("Bitte eine Zeit in Sekunden angeben!");
		int eingabe = sc.nextInt();
		
		//Eingabe umrechnen
		int tage = eingabe / dauerTagInSek;
		int stunden = (eingabe % dauerTagInSek) / dauerStdInSek;
		int minuten = ((eingabe % dauerTagInSek) % dauerStdInSek) / dauerMinInSek;
		int sekunden = ((eingabe % dauerTagInSek) % dauerStdInSek) % dauerMinInSek;
		System.out.println(eingabe + " Sekunden sind " + tage + " Tag(e), " + stunden + " Stunde(n), " + minuten + " Minute(n) und " + sekunden + " Sekunde(n).");	
	}
}

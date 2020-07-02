package ml.thurairajah;

import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl (Sekunden) eingeben");
		int zahl = sc.nextInt();
		int Tage = zahl/60/60/24;
		int Stunden = (zahl/60/60) % 60;
		int Minuten = (zahl/60)%60;
		int Sekunden = zahl % 60;
		
		System.out.println(zahl +" Sekunden sind " + Tage + " Tag(e), " + Stunden + " Stunde(n), "+
		Minuten + " Minute(n) und "+ Sekunden + " Sekunde(n).");

	}
	
}
	
package ml.vi;

import java.util.Scanner;

public class SecondsConverter {

	 public static void main(String[] arg) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Eingabe: ");
		int seconds = scanner.nextInt();
		
		// Zeitinheit in Sekundeneinheiten
		int minute = 60;
		int hour = minute * 60;
		int day = hour * 24;
		
		
		System.out.print("Ausgabe: " + seconds + " Sekunden sind ");
		System.out.print((seconds/day) + " Tage(e), ");
		seconds = seconds % day;
		System.out.print((seconds/hour) + " Stunde(n), ");
		seconds = seconds % hour;
		System.out.print((seconds/minute) + " Minute(n), ");
		seconds = seconds % minute;
		System.out.println(seconds + " Sekunde(n).");
		
		scanner.close();
		
	 }
}

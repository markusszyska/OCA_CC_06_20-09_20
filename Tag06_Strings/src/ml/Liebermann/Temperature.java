package ml.Liebermann;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		boolean precipitation = false;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bitte geben Sie die Temperatur ein");
		final int temp = sc.nextInt();
		//definitiv einer der besten Variablen Namen :D
				
		// Einlesen eines Wahrheitswertes von der Konsole
		System.out.println("Regnet es?");
		String input = sc.next();
		if(input.contains("true") || input.toLowerCase().contains("ja") || input.toLowerCase().contains("yes")) {
			precipitation = true;
		}else if (input.toLowerCase().contains("false") || input.toLowerCase().contains("nein") || input.toLowerCase().contains("no")) {
			precipitation = false;
		}
		//precipitation = true;
		if(temp >= 0 && precipitation) {
			System.out.println("Sauwetter");
		}
		else if(temp >= 0 && temp <=19 && !precipitation) {
			System.out.println("Gehen wir spazieren?");
		}
		else if(temp >= 20 && !precipitation) {
			System.out.println("Gehen wir schwimmen?");
		}
		else if(temp < 0 && precipitation) {
			System.out.println("Komm, geh'n wir Schlittenfahren!");
		}
		else if(temp <= 0 && !precipitation) {
			System.out.println("Lass uns am Lagerfeuer Glühwein trinken.");
		}
		System.out.println(temp + " " + precipitation + " " + input) ;
	}
}

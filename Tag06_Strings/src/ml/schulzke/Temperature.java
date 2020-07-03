package ml.schulzke;

import java.util.Scanner;

public class Temperature {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Temperaturen in Array == Tabellen-Variable temps[0] bis temps[6]
		int[] temps = {-10,-10,15,15,25,25,0};
		//Regen in Array == Tabellen-Variable rain[0] bis rain[6]
		boolean[] rain = {false,true,false,true,false,true,false};
		
		
		Scanner scanner = new Scanner(System.in);
		
		// eine zusätzliche eigene Temperatur
		System.out.println("Heutige Temperatur: ");
		// eigne Temperatur in den letzten Array-Slot speichern
		temps[6] = scanner.nextInt();
		
		scanner = new Scanner(System.in);
		// frage ob es regnet 
		System.out.println("Regnet es heute? ja oder nein");
		String rainy = scanner.nextLine();
		
		//prüfen ob ja oder nein eingeben wurde, wenn nicht User zur erneuten Eingabe zwingen
		while (!rainy.equals("ja")&&!rainy.equals("nein")) {
			System.out.println("Nur \"ja\" oder \"nein\" ist erlaubt! Bitte erneut eingeben: ");
			rainy = scanner.nextLine();
		}
		
		//es wurde ja eingeben also in den letzten slot von dem Regen Array speichern true
		if(rainy.equals("ja")) {
			rain[6] = true;
		}else{
		//es wurde nein eingeben also in den letzten slot von dem Regen Array speichern false
			rain[6] = false;
		}
	
		//für jedes Elment in dem Array temps einmal ausführen / für jede Temperatur einmal ausführen
		for (int i = 0; i < temps.length; i++) {
			//Temperatur unter 0?
			if(temps[i]<0) {
				//Regnet es?
				if(rain[i]==true) {
					System.out.println("Regen und "+temps[i]+"°C Komm, geh'n wir Schlittenfahren!");
				}else {
					System.out.println("Trocken und "+temps[i]+"°C Lass uns am Lagerfeuer Gluehwein trinken.");
				}
			}else {
				//Temperatur größer gleich 0 und kleiner gleich 19
				if(temps[i]>=0&&temps[i]<=19) {
					//Regnet es?
					if(rain[i]==true) {
						System.out.println("Regen und "+temps[i]+"°C So ein Sauwetter!");
					}else {
						System.out.println("Trocken und "+temps[i]+"°C Gehen wir spazieren?");
					}
				}else {
					//Temperatur größer gleich 20
					if(temps[i]>=20) {
						//Regnet es?
						if(rain[i]==true) {
							System.out.println("Regen und "+temps[i]+"°C Ich muss durch den Monsun!");
						}else {
							System.out.println("Trocken und "+temps[i]+"°C Gehen wir schwimmen?");
						}
					}
				}
			}
		}
		//nun folgt die else-if Ausgabe
		System.out.println("\n nun folgt die else-if Ausgabe \n");
		
		//für jedes Elment in dem Array temps einmal ausführen / für jede Temperatur einmal ausführen
		for (int i = 0; i < temps.length; i++) {
			
			if(temps[i]<0) {
				if(rain[i]==true) {
					System.out.println("Regen und "+temps[i]+"°C Komm, geh'n wir Schlittenfahren!");
				}else {
					System.out.println("Trocken und "+temps[i]+"°C Lass uns am Lagerfeuer Gluehwein trinken.");
				}
			}else if(temps[i]>=0&&temps[i]<=19){
				if(rain[i]==true) {
					System.out.println("Regen und "+temps[i]+"°C So ein Sauwetter!");
				}else {
					System.out.println("Trocken und "+temps[i]+"°C Gehen wir spazieren?");
				}
			}else {
				if(rain[i]==true) {
					System.out.println("Regen und "+temps[i]+"°C Ich muss durch den Monsun!");
				}else {
					System.out.println("Trocken und "+temps[i]+"°C Gehen wir schwimmen?");
				}
			}
		}
	}
}
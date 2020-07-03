package ml.bruch;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Temperatur eingeben");

		int tempatur = sc.nextInt();
		
		boolean precipitation = false; 
		
		
		if(tempatur >= 0 && precipitation == true) {
			System.out.println("Sauwetter");
		}
		if(tempatur >= 0 && tempatur <= 19 && precipitation == false) {
				System.out.println("Gehen wir spazieren?");
		}
		if(tempatur >= 20 && precipitation == false) {
			System.out.println("Gehen wir schwimmen?");
		}
		if(tempatur <= 0 && precipitation == true) {
			System.out.println("Komm, geh'n wir Schlittenfahren! ");
		}
		if(tempatur <= 0 && precipitation == false) {
			System.out.println("Lass uns am Lagerfeuer Glühwein trinken.");
		}
	}

}

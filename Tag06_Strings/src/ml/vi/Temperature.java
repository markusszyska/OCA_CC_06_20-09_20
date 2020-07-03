package ml.vi;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ganzzahligen Wert für die Außentemperatur eingeben: ");
		int temperature = sc.nextInt();
		
		System.out.print("Für den Niederschlag „true“ oder „false“ eingeben: ");
		boolean precipitation = Boolean.parseBoolean(sc.next());
		

		System.out.println();
		System.out.println("if:");
		
		if( temperature >= 0 ) {			
			if( precipitation )
				System.out.println("Sauwetter");
			if( !precipitation ) {
				if( temperature >= 0 && temperature <= 19 )
					System.out.println("Gehen wir spazieren?");
				if( temperature >= 20 )
					System.out.println("Gehen wir schwimmen?");
			}			
		}
		if( temperature < 0 ) {
			if( precipitation )
				System.out.println("Komm, geh'n wir Schlittenfahren!");
			if( !precipitation )
				System.out.println("Lass uns am Lagerfeuer Glühwein trinken.");
		}
		
		System.out.println();
		System.out.println("if-/-else-if:");
		
		if( temperature >= 0 ) {			
			if( precipitation )
				System.out.println("Sauwetter");
			else if( !precipitation ) {
				if( temperature >= 0 && temperature <= 19 )
					System.out.println("Gehen wir spazieren?");
				else if( temperature >= 20 )
					System.out.println("Gehen wir schwimmen?");
			}			
		}
		else if( temperature < 0 ) {
			if( precipitation )
				System.out.println("Komm, geh'n wir Schlittenfahren!");
			else if( !precipitation )
				System.out.println("Lass uns am Lagerfeuer Glühwein trinken.");
		}		
		
		sc.close();
	}

}

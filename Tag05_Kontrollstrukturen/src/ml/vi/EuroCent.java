package ml.vi;

import java.util.Scanner;

public class EuroCent {

	 public static void main(String[] arg) {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Eingabe: " );
		int zahl = scanner.nextInt();
		System.out.print("Ausgabe: Das macht " + (zahl/100));
		System.out.println(" Euro und " + (zahl%100) + " Cent");
		
		scanner.close();
		
	 }
}

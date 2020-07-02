package ml.salastexido;

import java.util.Scanner;

public class CentEuroConverter {
	
	public static double convert(double amount) {
		return amount/100;
	}
	
	public static void main(String[] args) {
		//read data from Terminal In
		System.out.printf("Bitte einen Betrag in Cent eingeben: ");
		Scanner scanner  = new Scanner(System.in);
		double numberInCents  = convert(scanner.nextDouble());
		int euro = (int) (numberInCents);
		double cents = (numberInCents-euro);
		System.out.println("Das macht: " + euro + " Euro " + " und " + (int)(cents*100) + " Cent\n");
		scanner.close();
	}
	
}

package ml.vi;

import java.util.Scanner;

public class JaNeinCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		System.out.print("Antworten sie mit Ja (j oder J) oder Nein (n oder N): ");
		
		char input = sc.next(".").charAt(0);
		
		if( input == 'j' || input == 'J')
			System.out.println("Sie haben mit ja geantwortet");
		else if( input == 'n' || input == 'N')
			System.out.println("Sie haben mit nein geantwortet");
		else 
			System.out.println("Sie haben eine falsche Eingabe gemacht.");	
		
		sc.close();
	}

}

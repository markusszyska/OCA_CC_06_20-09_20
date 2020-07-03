/*
 * 
 Aufgabe 1
 
Erstellen Sie ein Programm, welches als Eingabe die Stueckzahl und Einzelpreis
einer Ware vom Anwender erfragt. Bei einer Abnahme von mehr als 10 Stueck gibt
es 5 % Rabatt, bei mehr als 50 Stueck gibt es 10 % Rabatt auf den Kaufpreis
der Ware. Das Programm soll den Gesamtpreis ausrechnen und ausgegeben.
  
 */

package ml.Boettger.Berechnungen_Verzeigungen_02_Aufgabe_01_PriceDiscount;

import java.util.Scanner;

public class PriceDiscount {
	public static void main(String[] args) {
		// read input
		
		int i_number_of_pieces = 0;
		float f_unit_price = 0.00f;
		float f_total_price = 0.00f;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println();
		System.out.print("Please enter the number of pieces: ");
		i_number_of_pieces = sc.nextShort();

		System.out.println();
		System.out.print("Please enter the unit price: ");
		f_unit_price = sc.nextFloat();	
		
		f_total_price = f_unit_price * i_number_of_pieces;
		
		if (i_number_of_pieces > 50)
		{
			// 10 % discount
			f_total_price = 90 * f_total_price / 100;
		}
		else if (i_number_of_pieces > 10) 
		{
			// 5 % discount
			f_total_price = 95 * f_total_price / 100;	
		}
		
		System.out.println();
		System.out.println("The total price is " +
				f_total_price);		
	}
}

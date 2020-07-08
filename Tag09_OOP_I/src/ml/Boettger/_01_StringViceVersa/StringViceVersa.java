/*
 * Aufgabe String umdrehen

Schreiben Sie eine Methode, die einen String entgegen nimmt
und die Buchstaben in umgekehrter Reihenfolge zurueckgibt.
Probieren Sie Ihre Methode aus, indem Sie sie aufrufen und ihr
verschiedene Strings uebergeben.
 */

package ml.Boettger._01_StringViceVersa;

import java.util.Scanner;

public class StringViceVersa {
	public static void main(String[] args) {	
		String s_input = new String();	
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println(
			"\tPlease enter a text in one line: ");
		System.out.println(
			"\tThe text will be printed vice versa.");
		System.out.println(
			"\tEnd the text entry by entering \"End (end)\" on an empty, " +
				"new line.");

		for (;;)
		{	
			System.out.println();
			System.out.print("\t> ");
			s_input = sc.nextLine();
			if (s_input.equalsIgnoreCase("End"))
			{	
				System.out.println();
				System.out.println("\tThis is the end.");
				sc.close();
				return;
			}
			System.out.println("\t" + stringViceVersa(s_input));
		}	
	}
	
	public static String stringViceVersa(String s)
	{
		String s_ViceVersa = "";
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			s_ViceVersa += s.charAt(i);
		}
		return s_ViceVersa;
	}
}

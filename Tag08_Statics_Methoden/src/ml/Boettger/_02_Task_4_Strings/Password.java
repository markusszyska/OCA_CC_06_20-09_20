/*
 
Aufgabe 4
Schreiben Sie ein Programm, das den Benutzer nach einem Kennwort fragt. 
Dieses Kennwort soll sicher sein. Zunaechst bezeichnen wir ein Kennwort als
sicher, wenn es mindestens 10 Zeichen beinhaltet. Schreiben Sie eine Funktion,
die ueberprüft, ob das Kennwort diese Anforderung erfuellt. Im Hauptprogramm
soll dieses Ergebnis ausgewertet werden. Falls es nicht sicher ist, teilen Sie
dem Benutzer mit, wie viele Zeichen fehlen.

- Erweitern Sie das Kennwortprogramm. Dazu verschaerfen wir die Regeln für ein
  sicheres Kennwort. Als sicher gilt nun ein Kennwort, das aus mindestens einem
  Grossbuchstaben und einer Ziffer besteht. Die Laenge spielt nun keine Rolle
  mehr.
  
- Erweitern Sie die Funktion, so dass diese nun prueft, ob im Kennwort sowohl
  ein Grossbuchstabe als auch eine Ziffer steht.
  
- Erweitern Sie das Programm nun so, dass die Funktion prueft, ob das Kennwort
  10 Zeichen lang ist und mindestens einen Grossbuchstaben und eine Ziffer
  enthaelt. Testen Sie die Funktion wieder.
  
Zusatzaufgabe: Erweitern Sie die Funktion so, dass auch ein Kleinbuchstabe und
ein Sonderzeichen enthalten sein muss.

*/

package ml.Boettger._02_Task_4_Strings;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		
		char c_char = ' ';
		
		Boolean b_capital_letter = false;
		Boolean b_digit = false;
		Boolean b_lowercase = false;
		Boolean b_special_characters = false;
		
		String s_input = new String();	
		Scanner sc = new Scanner(System.in);
			
		System.out.println();
		System.out.println("\tPlease enter a password " +
			"followed by RETURN or \"end\".");		
	
		System.out.println(
			"\tEnd the text entry by entering \"End (end)\" on " +
			"an empty, new line.");
			
		System.out.println();
			
		for (;;)
		{
			System.out.println("\tPlease enter a password followed " +
		        "by RETURN or \"end\" - RETURN: ");
			System.out.println();
			System.out.print("\t> ");
			
			s_input = sc.nextLine();
			
			if (s_input.equalsIgnoreCase("End"))
			{	
				break;
			}
			
			// test on length
			
			if (s_input.length() < 10)
			{	
				System.out.println("\tThe password ist not secure - " +
					String.valueOf(10 - s_input.length()) +
						" character(s) are missing!");				
				System.out.println();
				continue;
			}
			
			// test on capital letter and digit

			for (int i = 0; i < s_input.length(); i++)
			{
				c_char = s_input.charAt(i);
				
				if ((int)c_char >= 65 && (int)c_char <= 90)
				{	
					// vaild ASCII code for capital letters (no vowels)
					b_capital_letter = true;
				}	
				if ((int)c_char >= 48 && (int)c_char <= 57)
				{
					// valid ASCII code for digits
					b_digit = true;
				}
				if ((int)c_char >= 97 && (int)c_char < 122)
				{
					b_lowercase = true;
				}				
				if (c_char >= 97 && (int)c_char < 122)
				{
					b_lowercase = true;
				}
				if (c_char == '$' || c_char == '\'' || c_char == '#')
				{	
					// only 3 special characters!!!
					b_special_characters = true;					
				}	
				if (b_capital_letter && b_digit && b_lowercase && 
						b_special_characters)
				{	
					break;
				}			
			}
			if (b_capital_letter && b_digit && b_lowercase && 
				b_special_characters)
			{	
				System.out.println();
				System.out.println("\tThe password is secure.");
			}	
			else				
			{
				System.out.println();
				System.out.println("\tThe password is not secure.");
			}			
		}
		System.out.println();
		System.out.println("\tThis is the end.");
		sc.close();
	}	
}


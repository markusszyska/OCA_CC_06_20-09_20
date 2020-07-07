/*
 * 
Aufgabe 2
Schreiben Sie ein Programm, das einen Buchstaben in den zugehoerigen 
ASCII-Wert umwandelt. Auf der letzten Seite sehen Sie die ASCII-Tabelle.

*/

package ml.Boettger._02_Task_2_Strings;

import java.util.Scanner;

public class Char2ASCII {
	public static void main(String[] args) {
		String s_input = new String();
		char c_char = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("\tPlease only enter a single character " +
			"followed by RETURN or \"end\".");
		System.out.println("\tThe associated ASCII value will be printed."); 
		System.out.println(
		 "\tEnd the text entry by entering \"End (end)\" on " +
		    "an empty, new line.");
		System.out.println();
		
		for (;;)
		{
			System.out.print("\tPlease enter a character followed " +
		        "by RETURN: ");
			s_input = sc.nextLine();
			if (s_input.equalsIgnoreCase("End"))
			{	
				break;
			}	
			c_char = s_input.charAt(0);
			System.out.println("\tThe ASCCI value of \"" + 
				String.valueOf(c_char) + "\" is " + (int)c_char);
			System.out.println();			
		}	
		System.out.println("\tThis is the end.");
		sc.close();
	}	
}	

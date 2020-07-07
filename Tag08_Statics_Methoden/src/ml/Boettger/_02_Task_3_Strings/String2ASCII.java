/*

Aufgabe 3
Schreiben Sie ein Programm, das einen Text einliest und anschliessend die 
ASCII-Codes des Textes ausgibt.

*/
package ml.Boettger._02_Task_3_Strings;

import java.util.Scanner;

public class String2ASCII {
	public static void main(String[] args) {
		String s_input = new String();	
		Scanner sc = new Scanner(System.in);
			
		System.out.println();
		System.out.println("\tPlease enter a text " +
			"followed by RETURN or \"end\".");
			
		System.out.println("\tThe associated ASCII values will be " +
			"printed.");
			
		System.out.println(
			"\tEnd the text entry by entering \"End (end)\" on " +
			"an empty, new line.");
			
		System.out.println();
			
		for (;;)
		{
			System.out.println("\tPlease enter a text followed " +
		        "by RETURN or \"end\" - RETURN: ");
			System.out.println();
			System.out.print("\t> ");
			s_input = sc.nextLine();
			if (s_input.equalsIgnoreCase("End"))
			{	
				break;
			}	
			System.out.println();
			System.out.println("\tThe ASCII values of the text are:");
			System.out.println(("\t================================="));
			
			if (s_input.length() == 0)
			{	
				System.out.println("\tNo text had been entered!");
				System.out.println();
				continue;
			}			
			
			for (int i = 0; i < s_input.length(); i++)
			{	
				System.out.println("\tThe ASCCI value of \"" + 
					String.valueOf(s_input.charAt(i)) + "\" is " + 
						(int)s_input.charAt(i));
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println("\tThis is the end.");
		sc.close();
	}	
}

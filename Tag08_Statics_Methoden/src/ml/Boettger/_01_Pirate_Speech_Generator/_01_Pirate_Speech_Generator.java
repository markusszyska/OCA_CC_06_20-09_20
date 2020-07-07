/*
Pirate Speech Generator
Erzeugen Sie ein Kommandozeilen Programm, wo der Benutzer einen Text eingeben
kann.

In diesem Text sollen alle a, e, i, o und u gegen arr, err, irr, orr und urr 
getauscht werden.

Der Text soll danach ausgegeben werden.
Das Programm soll sich wiederholen, bis der Benutzer "Ende" eintippt.
*/

package ml.Boettger._01_Pirate_Speech_Generator;

import java.util.Scanner;

public class _01_Pirate_Speech_Generator {
	public static void main(String[] args) {
		
		String s_input = new String();
		String s_pirate_speech = new String();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println(
			"\tPlease enter a text in one line: ");
		System.out.println(
			"\tThe Pirate Speech Generator will then prints the changed text");
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
				break;
			}
			s_pirate_speech = s_input.replaceAll("a", "arr");
			s_pirate_speech = s_pirate_speech.replaceAll("e", "err");
			s_pirate_speech = s_pirate_speech.replaceAll("i", "irr");
			s_pirate_speech = s_pirate_speech.replaceAll("o", "orr");
			s_pirate_speech = s_pirate_speech.replaceAll("u", "urr");
			System.out.println("\t" + s_pirate_speech);
		}
		System.out.println();
		System.out.println("\tThis is the end.");
		sc.close();
	}
}

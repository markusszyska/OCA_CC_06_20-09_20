/*
 * PART 1
 * 
Pirate Speech Generator
Erzeugen Sie ein Kommandozeilen Programm, wo der Benutzer einen Text eingeben
kann.
In diesem Text sollen alle a, e, i, o und u gegen arr, err, irr, orr und urr 
getauscht werden.

Der Text soll danach ausgegeben werden.
Das Programm soll sich wiederholen, bis der Benutzer "Ende" eintippt.
*/

/*
 * PART 2
 * 
Erweitern Sie das Programm so, dass au und eu zu aauurghs bzw. zu eeuurghs
werden.

Wichtig, bei dieser Erweiterung soll keine Konstellationen wie arrarruruurghs 
oder Aehnliches entstehen. Testen Sie ihr Programm und Dokumentieren Sie in
ihren Quellcode ihre Gedanken.
*/

/*
 * My solution with '\n', because '\n' cannot be a text character because it
 * will finish the input on the line by "end\n".  
 *  
 * - first: 	convert au to "\nrghs" 		and
 * 			    	 	eu to "\n\nrghs"
 * 
 * - second: 	do the conversion of part 1
 * 
 * - third:		convert "\n\n" to "eeuu" 	and
 * 			            "\n"   to "aauu"
 */

package ml.Boettger._02_Pirate_Speech_Generator_2;

import java.util.Scanner;

public class Pirate_Speech_Generator {

	public static void main(String[] args) {
			
		String s_input = new String();
		String s_output = new String();
		String s_pirate_speech = new String();
			
		Scanner sc = new Scanner(System.in);
			
		System.out.println();
		System.out.println(
				"\tPlease enter a text in one line: ");
		System.out.println(
				"\tThe Pirate Speech Generator will then prints the changed text");
		System.out.println(
				"\tEnd the text entry by entering \"End\" on an empty, " +
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
			
			// first
			s_pirate_speech = s_input.replaceAll("au",
				String.valueOf('\n') + "rghs");	
					
			s_pirate_speech = s_pirate_speech.replaceAll("eu",
				String.valueOf('\n') +
				String.valueOf('\n') + "rghs");	
			
			// System.out.println("1\t" + s_pirate_speech);			
			
			// second
			s_pirate_speech = s_pirate_speech.replaceAll("a", "arr");
			s_pirate_speech = s_pirate_speech.replaceAll("e", "err");
			s_pirate_speech = s_pirate_speech.replaceAll("i", "irr");
			s_pirate_speech = s_pirate_speech.replaceAll("o", "orr");
			s_pirate_speech = s_pirate_speech.replaceAll("u", "urr");
			
			// System.out.println("2\t" + s_pirate_speech);
			
			// third
			s_pirate_speech = 
				s_pirate_speech.replaceAll(
					String.valueOf('\n') + 
					String.valueOf('\n'), "eeuu");
					
			s_pirate_speech = 
				s_pirate_speech.replaceAll(
					String.valueOf('\n'), "aauu");						
					
			System.out.println("\t" + s_pirate_speech);
		}
		System.out.println();
		System.out.println("\tThis is the end.");
		sc.close();
	}
}	

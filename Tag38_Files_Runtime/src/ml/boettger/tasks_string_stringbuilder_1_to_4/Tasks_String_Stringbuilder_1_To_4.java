/*

Nutzen Sie zur Loesung der Aufgaben erst den Datentyp String und anschliessend
die Klasse StringBuilder

Aufgabe 1
Schreiben Sie ein Programm, das einen String umdreht. 
Aus „Haus“ wird z.B „suaH“

Aufgabe 2
Schreiben Sie ein Programm mit einer Funktion, welche einen String 
"verschluesselt“, indem es benachbarte Zeichen, d.h. die Zeichen in den 
Positionen 0 und 1, 2 und 3 usw. im String vertauscht. Der String wird
eingelesen und "verschluesselt" auf dem Bildschirm ausgeben.
 
Bitte String eingeben: test 123 
Verschluesselter String: etts1 32

Aufgabe 3
Schreiben Sie ein Programm, das ein Name-Wert-Paar in der Form Name=Wert
einliest. Falls der Name oder das Gleichheitszeichen fehlt, wird der Benutzer
ueber seine ungueltige Eingabe informiert. Andernfalls sollen der Name und der
Wert extrahiert und in zwei verschiedenen Strings gespeichert werden. Die 
Laenge des Eingabestrings sowie der Name und der Wert werden auf dem Bildschirm
angezeigt.

Beispiel:
Eingabe 'Name=Wert' : value=10 Laenge des Strings: 8 Name: value
Wert: 10

Aufgabe 4
Schreiben Sie ein Programm, das eine positive Ganzzahl als binaere Ziffernfolge
darstellt. Die Ganzzahl wird dezimal von der Tastatur eingelesen. Die
entsprechende binaere Ziffernfolge ist in einem String zu speichern, der an der
Konsole ausgegeben wird. Hinweis: Zur Konvertierung verwenden Sie die Modulo
Division durch 2 und anschliessend die Ganzzahldivision durch 2.

*/

package ml.boettger.tasks_string_stringbuilder_1_to_4;

import java.util.Scanner;

public class Tasks_String_Stringbuilder_1_To_4 {
	
	//#########################################################################
	// task 1 reverse 
	//#########################################################################
	public static String stringReverse(String s)
	{
		String s_reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s_reverse += s.charAt(i);
		}		
		return "\"" + s_reverse + "\"";
	}
	
	public static String stringReverse(StringBuilder sb)
	{
		StringBuilder sb_reverse = new StringBuilder(sb);
		return "\"" + sb_reverse.reverse().toString() + "\"";
	}
	
	//#########################################################################
	// task 2 encrypt
	//#########################################################################
	public static String encrypt(String s) {	
		String s_encrypted = "";
		for (int i = 1; i < s.length(); i += 2) {
			s_encrypted += 
				String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i - 1));
		}
		// in case of uneven length add last character of input string to
		// output string
		return "\"" + (s.length() % 2 == 0 ? 
				s_encrypted : s_encrypted + s.substring(s.length() - 1)) + "\"";
	}

	public static String encrypt(StringBuilder sb) {
		StringBuilder sb_in = new StringBuilder(sb);
		StringBuilder sb_encrypted = new StringBuilder("");
		for (int i = 1; i < sb.length(); i += 2) {
			sb_encrypted.append(
				new StringBuilder(sb_in.substring(i - 1, i + 1)).reverse());
		}
		// in case of uneven length add last character of input string to
		// output string
		return "\"" + (sb.length() % 2 == 0 ? 
			sb_encrypted.toString() : 
			sb_encrypted.toString() + sb.charAt(sb.length() - 1)) + "\"";
	}
	
	//#########################################################################
	// main program
	// ########################################################################
	public static void main(String[] args) {
		String s_input = "Start";	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println();
		System.out.println(
			"\tPlease input text lines, finish program with RETURN only");
		System.out.println();		
		System.out.print("\t-> ");
		
		while (s_input.length() > 0) {

			s_input = scanner.nextLine();
			if (s_input.length() == 0) {
				continue;
			}
			
			System.out.println("\t-> " + s_input);	// echo input
			
			//#################################################################
			// task 1
			//#################################################################
			System.out.print("\t-> 1. Reverse with String:");
			System.out.print(" " +
				Tasks_String_Stringbuilder_1_To_4.stringReverse(s_input));

			System.out.print(" with StringBuilder:");
			System.out.println(" " +
				Tasks_String_Stringbuilder_1_To_4.stringReverse(
						new StringBuilder(s_input)));
			
			//#################################################################
			// task 2
			//#################################################################
			System.out.print("\t-> 2. Encrypt with String:");				
			System.out.print(" " + 
				Tasks_String_Stringbuilder_1_To_4.encrypt(s_input));
			
			System.out.print(" with StringBuilder:");				
			System.out.println(" " + 
				Tasks_String_Stringbuilder_1_To_4.encrypt(
						new StringBuilder(s_input)));
			
			//#################################################################
			// task 3
			//#################################################################
			System.out.println("\t-> 3. Name=Value with String:");
			String [] s_arr = s_input.split("=", 2);
			if (s_arr.length < 2) {
				System.out.println(
					"\t-> Please input \"name=value\" for task 3");
			}
			else {
				System.out.println(
						"\t-> Length of the string: " + s_input.length() + 
						" Name: " + s_arr[0] + 
						" Value: " + s_arr[1]);
			}
			
			System.out.println("\t-> 3. Name=Value with StringBuilder:");
			System.out.println("\t-> Convert to String and do the above!");			

			//#################################################################
			// task 4
			//#################################################################
			System.out.println("\t-> 4. positive integer as binary number:");
			int i = 0;
			try {
				i = Integer.parseUnsignedInt(s_input);
			} catch (NumberFormatException e) {
				System.out.println("\t-> No positve number input for task 4!");
				System.out.print("\t-> ");
				continue;
			}	
			System.out.print("\t-> convert to binary with String: ");
			String binary = "";
			int j = i;
			while (j > 0) {
				binary = j % 2 + binary;
				j = j / 2;
			}			
			System.out.print(binary);
			System.out.print(" with StringBuilder: ");
			StringBuilder sb_binary = 
				new StringBuilder(Integer.toBinaryString(i));
			System.out.println(sb_binary);
			
			//-----------------------------------------------------------------
			
			System.out.print("\t-> ");
		}			
		scanner.close();
		System.out.println();
		System.out.println("\tEnd of program");
		System.out.println();
	}
}

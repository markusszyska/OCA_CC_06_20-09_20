/*
Aufgabe 5
Schreiben Sie ein Programm, das die ASCII-Tabelle ausgibt
*/

package ml.Boettger._02_Task_5_Strings;

public class ASCIITable {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("\tASCII table");
		System.out.println();
		System.out.println(
			"\tDecimal number\tCharacter\tDecimal number\tCharacter");
		System.out.println(
			"\t=========================================================");
		for (int i = 32; i <= 79; i++)
		{	
			if (i == 32)
			{	
				System.out.print("\t32\t\tSpace");
			}	
			if (i > 32)
			{	
				System.out.print("\t" + String.valueOf(i) + 
					"\t\t" + String.valueOf((char)i));
			}			
			System.out.println("\t\t" + String.valueOf(i + 48) +
				"\t\t" + 					
				(i == 79 ? "Deletion" :String.valueOf((char)(i + 48))));	
		}
	}
}

/*

Aufgabe 1
Schreiben Sie ein Programm mit den Variablen "vorname" und "nachname" jeweils
vom Typ "string".

Initialisieren Sie diese beiden Variablen mit Ihrem Vor- und Nachnamen. 
Erzeugen Sie eine weitere Variable "name". Der Inhalt dieser Variablen soll die
Kombination aus der Variablen vorname und der Variablen nachname sein. 

Geben Sie den Inhalt dieser Variablen aus. Erweitern Sie das Programm 
anschliessend so, dass es die Laenge des Vornamens, des Nachnamens
und des kompletten Namens ausgibt.

Erweitern Sie das obige Programm um eine Variable "kuerzel". Diese Variable
soll Ihre Initialen enthalten. Ermitteln Sie diese Initialen aus den 
Variablen "vorname" und Nachname.

*/

package ml.Boettger._02_Task_1_Strings;

public class _02_Task_1_Strings {
	public static void main(String[] args) {
		String s_first_name = "Bernd";
		String s_surname = "Boettger";
		String s_name = "";
		String s_initials = "";

		// calculation
		s_name = s_first_name + " " + s_surname;
		s_initials = String.valueOf(s_first_name.charAt(0)) + "." + 
				String.valueOf(s_surname.charAt(0)) + ".";
		
		// printout
		System.out.println();
		System.out.println("My name is: " + s_name);
		System.out.println();
		System.out.println("The lenght of my first name are " + 
				s_first_name.length() + " characters.");
		System.out.println("The lenght of my surname are " + 
				s_surname.length() + " characters.");
		System.out.println("The lenght of my complete name are " + 
				s_name.length() + " characters.");
		System.out.println("My initials are: " + s_initials);		
	}
}

/*
 
Aufgabe 1
Schreiben Sie ein Programm, welches einen Anwender nach bestimmten Ereignissen
(Geburtsdatum, Hochzeitstag) abfragt und anschliessend einen bestimmten
Jubilaeumstag z.B. seit 100 Tagen verheiratet berechnet. 

Der zu berechnende Jubilaeumstag soll vom Programm ebenfalls abgefragt werden.

Geben Sie im Anschluss eine entsprechend formatierte Meldung auf der Konsole
aus.

Aufgabe 2	STILL MISSING
Schreiben Sie ein Programm, welches einen Text ausliest und aus diesem die 
Datums- und Zeitangaben extrahiert. Geben Sie diese anschliessend auf der
Konsole aus. Benutzen Sie hierzu alle Formatierungen, welche eingefuehrt worden
sind.

 */

package ml.boettger.tasks_date_and_time_1_to_2;

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Tasks_Date_Time_1_To_2 {
	public static void main(String[] args) {
		String s_date_of_birth = "";
		String s_wedding_date = "";
		String s_anniversary_date = "";
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println();
		System.out.print(
			"\tPlease input the date of birth in yyyy-mm-dd-> ");
		s_date_of_birth = scanner.nextLine();
		System.out.println("\t-> " + s_date_of_birth);
		
		System.out.print(
			"\tPlease input the wedding date in yyyy-mm-dd-> ");
		s_wedding_date = scanner.nextLine();
		System.out.println("\t-> " + s_wedding_date);

		System.out.print(
			"\tPlease input the Anniversary date in yyyy-mm-dd-> ");
		s_anniversary_date = scanner.nextLine();
		System.out.println("\t-> " + s_anniversary_date);

		LocalDate d_date_of_birth = LocalDate.parse(s_date_of_birth);
		LocalDate d_wedding_date = LocalDate.parse(s_wedding_date);
		LocalDate d_anniversary_date = LocalDate.parse(s_anniversary_date);				

		Period between = Period.between(d_date_of_birth, d_anniversary_date);
		long daysBetween = 
			ChronoUnit.DAYS.between(d_date_of_birth,  d_anniversary_date);
				
		System.out.println("\tLived " + 
				between.getYears() + " years " +
				between.getMonths() + " months " +
				between.getDays() + " days.");
		System.out.println("\tThis are " + daysBetween + " days.");
				
		between = Period.between(d_wedding_date, d_anniversary_date);
		daysBetween = 
				ChronoUnit.DAYS.between(d_wedding_date,  d_anniversary_date);
		
		System.out.println("\t" + 
				between.getYears() + " years " +
				between.getMonths() + " months " +
				between.getDays() + " days married.");
		System.out.println("\tThis are " + daysBetween + " days.");
	}
}

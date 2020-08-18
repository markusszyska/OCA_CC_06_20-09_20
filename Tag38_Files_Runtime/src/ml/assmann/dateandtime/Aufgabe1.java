package ml.assmann.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aufgabe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ein Datum ein (dd.mm.yyyy):");
		String eingabeString = sc.nextLine();

		// split String in day, month, year
		String[] eingabe = eingabeString.split("\\.");
		
		// create LocalDate with these Strings as ints.
		LocalDate date = LocalDate.of(Integer.parseInt(eingabe[2]),
				Integer.parseInt(eingabe[1]), Integer.parseInt(eingabe[0]));
		
		System.out.println("Welchen Jubilaeumstag moechten Sie wissen? Geben Sie die Anzahl Tage ein");
		LocalDate dateNew = date.plusDays(sc.nextInt());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		System.out.println("Sie koennen dieses Jubilaeum am " + dateNew.format(dtf) + " feiern!");
		sc.close();
	}
}

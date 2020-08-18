package ml.assmann.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie ein Datum und eine Zeit ein (dd.mm.yyyy hh:mm:ss):");
		String eingabeString = sc.nextLine();

		String[] bigSplit = eingabeString.split(" ");
		// split String in day, month, year
		String[] dates = bigSplit[0].split("\\.");
		String[] times = bigSplit[1].split(":");
		
		// create LocalDate with these Strings as ints.
		LocalDate date = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
		LocalTime time = LocalTime.of(Integer.parseInt(times[0]), Integer.parseInt(times[1]), Integer.parseInt(times[2]));
		LocalDateTime datetime = LocalDateTime.of(date, time);
//		LocalDateTime date = LocalDateTime.of(Integer.parseInt(dates[2]),
//				Integer.parseInt(dates[1]), Integer.parseInt(dates[0]),
//				Integer.parseInt(times[0]), Integer.parseInt(times[1]),
//				Integer.parseInt(times[2]));
		
		DateTimeFormatter d_format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		DateTimeFormatter t_format = DateTimeFormatter.ofPattern("HH:mm:ss");
		DateTimeFormatter dt_format = DateTimeFormatter.ofPattern("'Es war einmal am 'dd.MM.yyyy HH:mm:ss");
		
		System.out.println("Ausgabe Date: " + date.format(d_format));
		System.out.println("Ausgabe Time: " + time.format(t_format));
		System.out.println("Ausgabe DateTime: " + datetime.format(dt_format));
		sc.close();
	}
}
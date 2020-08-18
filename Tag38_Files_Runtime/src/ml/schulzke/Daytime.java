package ml.schulzke;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Daytime {
	public static void main(String[] args) {
		
		System.out.println("\n ---------- Aufgabe1 ---------- \n");
		Aufgabe1(LocalDate.of(2020, 1, 8),100);
		Aufgabe1(LocalDate.of(2020, 1, 8),365);
		Aufgabe1(LocalDate.of(2020, 1, 8),-365);
		
		
		System.out.println("\n ---------- Aufgabe2 ---------- \n");
		Aufgabe2("2020-08-13T17:33","Gestern");
		Aufgabe2("1945-05-08T23:01","Der Krieg ist aus!");
		Aufgabe2("79-08-24T05:25","Ich sehe da Rauch?");
		Aufgabe2("1969-07-20T03:56","Niemand hat die Absicht den Mond zu betreten.");

	}
	
	static void Aufgabe1(LocalDate start, int end) {
		LocalDate added = start.plusDays(end);
		System.out.println(	"\nStart: 			"+start+"\n"+
							"Anniversary after: 	"+end+"Days\n"+
							"Yeay: 			"+added);
	}
	
	static void Aufgabe2(String input, String msg) {
		String[] day = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
		String[] month = {"Januar", "Februar", "Maerz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "Novmeber", "Dezember"};
		
		String[] dateTime = input.split("T");
		int[] date = Arrays.stream(dateTime[0].split("-")).mapToInt(Integer::parseInt).toArray();
		int[] time = Arrays.stream(dateTime[1].split(":")).mapToInt(Integer::parseInt).toArray();
		
		LocalDateTime createdDateTime = LocalDateTime.of(date[0], date[1], date[2], time[0], time[1]);
		
		System.out.println(	"\nEs ist "+day[createdDateTime.getDayOfWeek().getValue()-1]+
							" der "+createdDateTime.getDayOfMonth()+". Tag des Monats "+
							month[createdDateTime.getMonthValue()-1]+" im Jahr "+createdDateTime.getYear()+"\n"+
							"die Uhr schlaegt "+createdDateTime.getHour()+"Uhr und "+createdDateTime.getMinute()+"Minuten\n"+
							msg);
		
		
	}
}

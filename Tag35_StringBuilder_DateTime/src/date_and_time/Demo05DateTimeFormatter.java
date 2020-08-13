package date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Demo05DateTimeFormatter {
	public static void main(String[] args) {
//		demoDateTimeFormatter();
		demoFormatter();
	}

	private static void demoFormatter() {
		LocalDate lDate = LocalDate.now();
		LocalTime lTime = LocalTime.now();
		LocalDateTime lDateTime = LocalDateTime.now();

		DateTimeFormatter date_tf = DateTimeFormatter.ofPattern("dd.MMM.yyyy");
		System.out.println(lDate.format(date_tf));

		DateTimeFormatter d_time_tf = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(lTime.format(d_time_tf));
		/*
		 * Exception in thread "main"
		 * java.time.temporal.UnsupportedTemporalTypeException: Unsupported field:
		 * HourOfDay
		 */
//		System.out.println(lDate.format(d_time_tf));

		Locale loc01 = Locale.UK;
		Locale loc02 = Locale.ITALY;
		Locale loc03 = new Locale("fr", "IT");

		DateTimeFormatter Date_Time_f = DateTimeFormatter.ofPattern("GGG EEE dd.MMM.yyyy - a HH:mm:ss", loc03);

		System.out.println(lDateTime.format(date_tf));
		System.out.println(lDateTime.format(d_time_tf));
		System.out.println(lDateTime.format(Date_Time_f));
	}

	private static void demoDateTimeFormatter() {
		/*
		 * The ISO date formatter that formats or parses a date with theoffset if
		 * available, such as '2011-12-03' or '2011-12-03+01:00'.
		 */
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		dtf = DateTimeFormatter.BASIC_ISO_DATE;

		LocalDate date = LocalDate.now();
		System.out.println("date: " + date);

		/*
		 * Exception in thread "main"
		 * java.time.temporal.UnsupportedTemporalTypeException: Unsupported field:
		 * HourOfDay
		 */
//		System.out.println("date: " + date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM)));
		System.out.println("date: " + date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
	}

	public static void demoDateTimeFormatterPattern() {
		LocalDate date1 = LocalDate.of(2018, 12, 24);
		LocalTime time1 = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();

		// Achtung: Die textuellen Teile sind in Hochkomma einzuschlieﬂen
		String datePattern = "'Der 'dd'. Tag im 'MMMM' im Jahr 'yy'.'";
		String timePattern = "'Es ist 'H' Uhr 'm' und 's' sekunden.'";
		String date_timePattern = "'Der 'dd'. Tag im 'MMMM' im Jahr 'yy'.'"
				+ "'\nEs ist 'H' Uhr 'm' und 's' sekunden.'";
		DateTimeFormatter date_tf = DateTimeFormatter.ofPattern(datePattern, Locale.GERMAN);
		DateTimeFormatter time_tf = DateTimeFormatter.ofPattern(timePattern, Locale.GERMAN);
		DateTimeFormatter date_time_tf = DateTimeFormatter.ofPattern(date_timePattern, Locale.GERMAN);

		System.out.println(date1.format(date_tf));

		// Date mit Time
		// System.out.println(date1.format(time_tf));
		// Exception in thread "main"
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// field: HourOfDay

		// Date mit DateTime
		// System.out.println(date1.format(date_time_tf));
		// Exception in thread "main"
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// field: HourOfDay

		// Time mit Date
		// System.out.println(time1.format(date_tf));
		// Exception in thread "main"
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// field: DayOfMonth

		// Time mit DateTime
		// System.out.println(time1.format(date_time_tf));
		// Exception in thread "main"
		// java.time.temporal.UnsupportedTemporalTypeException: Unsupported
		// field: DayOfMonth

		System.out.println(time1.format(time_tf));

		System.out.println("LocalDateTime = " + ldt.format(date_tf));
		System.out.println("LocalDateTime = " + ldt.format(time_tf));
		System.out.println("LocalDateTime = \n" + ldt.format(date_time_tf));
	}
}

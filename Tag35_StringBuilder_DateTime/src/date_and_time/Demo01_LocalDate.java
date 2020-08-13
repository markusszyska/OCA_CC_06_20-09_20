package date_and_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.IsoFields;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo01_LocalDate {
	public static void main(String[] args) {
//		java1_0();
//		java1_1();
		
//		demoLocalDate();
//		demoLocalDate02();
//		demoWithXXXLocalDate();
		
		demoPlusMinusLocalDate();
		
	}

	private static void demoPlusMinusLocalDate() {
		LocalDate date = LocalDate.of(2020, 7, 31);
		System.out.println(date.plusDays(62));
		
		System.out.println(date);
		
		LocalDate date2 = date.minusYears(12);
		System.out.println(date2);
		
		LocalDate date3 = date.plusWeeks(600);
		System.out.println(date3);
		
		LocalDate date4 = date.plusDays(1000);
		System.out.println(date4);
	}

	private static void demoWithXXXLocalDate() {
		LocalDate date = LocalDate.of(2020, 7, 31);
		LocalDate dateTest = LocalDate.of(2020, 2, 29);
		System.out.println(dateTest);
		
		LocalDate date2 = date.withYear(2019);	
		System.out.println(date2);
		
		LocalDate date3 = date.withMonth(9);
		System.out.println(date3);
		
		LocalDate date4 = date.withDayOfMonth(15);
		System.out.println(date4);
		
		LocalDate date5 = date.withDayOfYear(123);
		System.out.println(date5);
		
		LocalDate date6 = LocalDate.ofYearDay(2020, 123);
		System.out.println(date6);
		
	}

	private static void demoLocalDate02() {
		LocalDate date = LocalDate.now();
		
		System.out.println("date: " + date);
		System.out.println("Tag im Monat: " + date.getDayOfMonth());
		System.out.println("Monat: " + date.getMonthValue());
		System.out.println("Monat: " + date.getMonth());
		System.out.println("Jahr: " + date.getYear());
		System.out.println("Tag im Jahr: " + date.getDayOfYear());
		System.out.println("KalenderWoche: " + date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));	
	}

	private static void demoLocalDate() {
		//Exception in thread "main" java.time.DateTimeException: 
		//Invalid date 'FEBRUARY 30'
//		LocalDate dateXX = LocalDate.of(2020, 2, 30);
		
		
		//int int int Factory Methode
		LocalDate date1 = LocalDate.of(2020, 8, 13);		
		System.out.println(date1);
		LocalDate date2 = LocalDate.of(2020, Month.AUGUST, 13);
		System.out.println(date2);
		LocalDate date3 = LocalDate.of(2020, Month.of(8), 13);
		
		//Date and Time Objekte sind immutable
		date1.plusMonths(2);
		//der neue Wert ist verloren
		System.out.println(date1);
		
		date1 = date1.plusMonths(2);
		System.out.println(date1);
		
		/**
		 * 
		 * 2017-01-31
		 * <p>
		 * 2017-01-31
		 * <p>
		 * 2017-02-28
		 * 
		 * @Notice that invoking the plus method on date1 doesn't change its
		 *         value, but assigning the result of the plus method to date2
		 *         captures a new value. Expect exam questions that test your
		 *         understanding of the immutability of calendar objects.
		 */
	}

	public static void java1_0() {
		Date d = new Date();
		System.out.println(d);
		
		Date gebTag = new Date(1977, 11, 02);
		gebTag = new Date(77, 11, 02);
		System.out.println("gebTag: " + gebTag);	
	}
	
	public static void java1_1() {
		Calendar c = new GregorianCalendar();
		c = new GregorianCalendar(1977, 11, 02);
		System.out.println("c: " + c);
		System.out.println("c: " + c.getTime());
	}
	
}

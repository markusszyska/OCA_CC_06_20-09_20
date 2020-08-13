package date_and_time;

import java.time.LocalDate;
import java.time.Period;

public class Demo04Period {
	public static void main(String[] args) {
//		demoLocalDatePeriod();
		
//		demoBetween();
		demoWithXXX();
		
	}

	private static void demoWithXXX() {
		Period zweiMonateZehnTage = Period.ofMonths(2).withDays(10);
		Period siebenWochen = Period.ofWeeks(7).plus(zweiMonateZehnTage);
		Period dreiTage = Period.ofDays(3);
		
		System.out.println("zweiMonateZehnTage: "+zweiMonateZehnTage);
		System.out.println("siebenWochen: "+siebenWochen);
		System.out.println("dreiTage: "+dreiTage);
	}

	private static void demoBetween() {
		LocalDate date = LocalDate.of(2020, 8, 13);
		LocalDate date2 = LocalDate.of(2018, 8, 10);
		
		Period between = Period.between(date, date2);
		System.out.println(between);
		System.out.println(between.getDays());
	}

	private static void demoLocalDatePeriod() {
		Period periodDays = Period.ofDays(5);
		System.out.println(periodDays);
		Period periodWeeks = Period.ofWeeks(12);
		System.out.println(periodWeeks);
		Period periodMonth = Period.ofMonths(5);
		System.out.println(periodMonth);
		Period periodYears = Period.ofYears(5);
		System.out.println(periodYears);
		
		LocalDate date = LocalDate.now();
		System.out.println(date.plus(periodDays));
		System.out.println(date.minus(periodWeeks));
		System.out.println(date.plus(periodMonth));
		System.out.println(date.minus(periodYears));
		
		
	}
}

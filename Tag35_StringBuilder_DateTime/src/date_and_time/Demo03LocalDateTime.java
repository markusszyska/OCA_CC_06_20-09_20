package date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Demo03LocalDateTime {
	public static void main(String[] args) {
//		demoLocalDateTime();
//		demoWithXXX();
		demoMinusPlusXXX();
	}

	private static void demoMinusPlusXXX() {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(ldt.plusDays(6));
		System.out.println(ldt.minusWeeks(7));
		System.out.println(ldt.plusMinutes(20));
		
	}

	private static void demoWithXXX() {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(ldt.withHour(6));
		System.out.println(ldt.withYear(2064));
	}

	private static void demoLocalDateTime() {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		ldt = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(ldt);
		
		ldt = LocalDateTime.of(2020, 8, 13, 12, 0, 0);
		System.out.println(ldt);
		
		ldt = LocalDateTime.of(2020, Month.AUGUST, 13, 12, 0, 0);
		System.out.println(ldt);
	}
}

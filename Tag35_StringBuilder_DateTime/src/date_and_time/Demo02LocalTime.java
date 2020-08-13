package date_and_time;

import java.time.LocalTime;

public class Demo02LocalTime {
	public static void main(String[] args) {
//		demoLocalTime();
//		demoLocalTime2();
		beforeOrAfter();
	}

	private static void beforeOrAfter() {
		LocalTime lt = LocalTime.now();
		LocalTime pause = LocalTime.of(13, 00);
		
		if(lt.isAfter(pause)) {
			System.out.println("Pause");
		}
		if(lt.isBefore(pause)) {
			System.out.println("Noch keine Pause");
		}
	}

	private static void demoLocalTime2() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		System.out.println("Stunde: " + lt.getHour());
		System.out.println("Minute: " + lt.getMinute());
		System.out.println("Sekunde: " + lt.getSecond());
		System.out.println("Nano: " + lt.getNano());
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(lt.toNanoOfDay());
		
		//withXXX Methoden
		LocalTime lt2 = lt.withHour(22);
		System.out.println(lt2);
		lt2 = lt.withMinute(34);
		System.out.println(lt2);
		
		//plusXXX minusXXX Methoden
		LocalTime lt3 = lt.plusHours(23);
		System.out.println(lt3);
		lt3 = lt.minusMinutes(7200);
		System.out.println(lt3);
		
		
		
	}

	private static void demoLocalTime() {
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		lt = LocalTime.of(12, 12);
		System.out.println(lt);
		
		lt = LocalTime.of(12, 12, 12);
		System.out.println(lt);
		
		lt = LocalTime.of(12, 12, 12, 12);
		System.out.println(lt);
		
	}
}

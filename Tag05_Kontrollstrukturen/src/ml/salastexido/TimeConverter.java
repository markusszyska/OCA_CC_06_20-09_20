package ml.salastexido;

import java.util.Scanner;

public class TimeConverter {
	
	final static int SECONDS_PER_TAG = 86400; //24*3600
	
	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner scanner  = new Scanner(System.in);
		int n = scanner.nextInt();
		int days  = n/SECONDS_PER_TAG; //(24*3600 ist wie viele seconds hat ein Tag) 
		int hours = (n % SECONDS_PER_TAG) / 3600;
		int minutes = (n % 3600)/60;
		int seconds = n % 60;
		scanner.close();
		System.out.println( days + " " + "days " + hours  
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds "); 
	}
}

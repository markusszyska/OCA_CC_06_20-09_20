package ml.schulzke;

import java.io.*;

public class Modulo2 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Bitte geben Sie eine Sekunden-Anzahl ein: ");
		String str_zahl = br.readLine();
		while (isNumeric(str_zahl)==false) {
			System.out.println("Nur Zahlen sind erlaubt! Bitte erneut eingeben: ");
			str_zahl = br.readLine();
		}
		long secondsIN = Long.parseLong(str_zahl);
		System.out.println(secondsIN);
		long days   = (long) Math.floor(secondsIN / 86400);
		long hours   = (long) Math.floor((secondsIN - (days * 86400)) / 3600);
		long minutes = (long) Math.floor((secondsIN - (hours * 3600) - (days * 86400)) / 60);
		long seconds = (long) secondsIN - (days * 86400) - (hours * 3600) - (minutes * 60);
		
	    System.out.println(days+":"+hours+":"+minutes+":"+seconds);
		}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double i = Long.parseLong(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}

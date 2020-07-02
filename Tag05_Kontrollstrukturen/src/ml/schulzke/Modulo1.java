package ml.schulzke;

import java.io.*;

public class Modulo1 {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Bitte geben Sie eine Cent-Anzahl ein: ");
		String str_zahl = br.readLine();
		while (isNumeric(str_zahl)==false) {
			System.out.println("Nur Zahlen sind erlaubt! Bitte erneut eingeben: ");
			str_zahl = br.readLine();
		}
		//int cent = Integer.parseInt(str_zahl);
		
		char[] digits = str_zahl.toCharArray();
		if(digits.length>2) {
		
		String euro = "";
			for (int i = 0; i < digits.length; i++) {
				  if(i<(digits.length-2)) {
					  euro += digits[i];
				  }
			}
		System.out.println("Das macht "+euro+" Euro und "+digits[digits.length-2]+digits[digits.length-1]+" Cent!");
		}else {
			if(str_zahl=="1") {
				System.out.println("Das macht einen Cent!");
			}else {
				System.out.println("Das macht "+str_zahl+" Cent!");
			}
		}
		
		}
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double i = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}

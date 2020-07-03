package ml.schulzke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rabatte {
	
	public static void main(String[] args) throws IOException {
		float flt_priceMult = 1;
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Bitte geben Sie den Preis in Cent an:");
	String str_price = br.readLine();
	while (isNumeric(str_price)==false) {
		System.out.println("Nur Zahlen sind erlaubt! Kommerzahlen bitte mit \".\" trennen. Bitte erneut eingeben: ");
		str_price = br.readLine();
	}
	
	float preis = Float.parseFloat(str_price);
	
	isr = new InputStreamReader(System.in);
	System.out.println("Bitte geben Sie die gewünschte Stückzahl an:");
	String str_count = br.readLine();
	while (isNumeric(str_count)==false) {
		System.out.println("Nur ganze Zahlen sind erlaubt! Bitte erneut eingeben: ");
		str_count = br.readLine();
	}
	
	int count = Integer.parseInt(str_count);
	
	System.out.println("Einzelpreis: "+(preis/100)+"€");
	System.out.println(count+" Stück");
	
	if(count<=9) {
		
	}else if(count>=10&&count<=49){
		flt_priceMult = (float) 0.95;
	}else {
		flt_priceMult = (float) 0.9;
	}
	System.out.println("Gesammtpreis: "+(((preis/100)*count)*flt_priceMult)+"€");
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

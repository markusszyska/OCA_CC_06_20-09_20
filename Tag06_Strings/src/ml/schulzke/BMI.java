package ml.schulzke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BMI {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		int targetBMIstart = 19;
		int targetBMIend = 24;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Wie viel Kilogramm wiegen sie:");
		String str_kg = br.readLine();
		while (isNumeric(str_kg)==false) {
			System.out.println("Nur Zahlen sind erlaubt! Kommerzahlen bitte mit \".\" trennen. Bitte erneut eingeben: ");
			str_kg = br.readLine();
		}
		float kg = Float.parseFloat(str_kg);
		
		isr = new InputStreamReader(System.in);
		System.out.println("Wie alt sind Sie(Jahre):");
		String str_age = br.readLine();
		while (isNumeric(str_kg)==false) {
			System.out.println("Nur Zahlen sind erlaubt! Kommerzahlen bitte mit \".\" trennen. Bitte erneut eingeben: ");
			str_age = br.readLine();
		}
		float age = Float.parseFloat(str_age);
		
		isr = new InputStreamReader(System.in);
		System.out.println("Wie groß sind Sie in Centimeter:");
		String str_cm = br.readLine();
		while (isNumeric(str_cm)==false) {
			System.out.println("Nur Zahlen sind erlaubt! Kommerzahlen bitte mit \".\" trennen. Bitte erneut eingeben: ");
			str_cm = br.readLine();
		}
		float cm = Float.parseFloat(str_cm);
		float bmi = kg/((cm/100)*(cm/100));
		System.out.println("Alter: "+age);
		System.out.println("Gewicht: "+kg);
		System.out.println("Größe: "+cm);
		System.out.println("BMI: "+bmi);
		
		if(age<=19) {
			System.out.println("Der BMI von Kindern und Jugendlichen wird nicht berechnet! JESUS LOVES YOU!");
		}else if(age>=25&&age<=34) {
			targetBMIstart = targetBMIstart+1;
			targetBMIend = targetBMIend+1;
		}else if(age>=35&&age<=44) {
			targetBMIstart = targetBMIstart+2;
			targetBMIend = targetBMIend+2;
		}else if(age>=45&&age<=54) {
			targetBMIstart = targetBMIstart+3;
			targetBMIend = targetBMIend+3;
		}else if(age>=55&&age<=64) {
			targetBMIstart = targetBMIstart+4;
			targetBMIend = targetBMIend+4;
		}else {
			targetBMIstart = targetBMIstart+5;
			targetBMIend = targetBMIend+5;
		}
		if(age>=19) {
			if(bmi>=targetBMIstart&&bmi<=targetBMIend) {
				System.out.println("Alles Tutti Frutti! JESUS LOVES YOU!");
			}else if(bmi>=targetBMIend) {
				System.out.println("Das sind alles schwere Knochen bei Obelix! JESUS LOVES YOU!");
			}else {
				System.out.println("Wie nennt man einen sehr dünnen Ritter? Margarita! JESUS LOVES YOU!");
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
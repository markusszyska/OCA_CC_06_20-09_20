package ml.kukulin;

import java.util.Scanner;

public class Aufgabe_01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Bitte Koerpergewicht in kg eingeben");
	float zahl1 = sc.nextFloat();
	
	System.out.println("Bitte Koerpergroesse in Metern eingeben");
	float zahl2 = sc.nextFloat();
	
	System.out.println("Bitte Alter in Jahren eingeben");
	float zahl3 = sc.nextFloat();
	//
	float bmi = zahl1/(zahl2*zahl2);

	//zahl1/zahl2*zahl2
	if(zahl3 >=19 & zahl3<=24 ) {
		if(bmi>=19 & bmi<=24) {
		System.out.println(" Gut ");
		}else { 
		System.out.println("Uebergewicht");}
		
		
	}else if (zahl3 >=25 & zahl3<=34 ){
		if(bmi>=20 & bmi<=25) {
			System.out.println(" Gut ");
			}else { 
			System.out.println("Uebergewicht");}
	
	}else if (zahl3 >=35 & zahl3<=44 ){
		if(bmi>=21 & bmi<=26) {
			System.out.println(" Gut ");
			}else { 
			System.out.println("Uebergewicht");}
		
	}else if (zahl3 >=45 & zahl3<=54 ){
		if(bmi>=22 & bmi<=27) {
			System.out.println(" Gut ");
			}else { 
			System.out.println("Uebergewicht");}
		
	}else if (zahl3 >=55 & zahl3<=64 ){
		if(bmi>=23 & bmi<=28) {
			System.out.println(" Gut ");
			}else { 
			System.out.println("Uebergewicht");}		
	
	}else if (zahl3 >64 ){
		if(bmi>=24 & bmi<=29) {
			System.out.println(" Gut ");
			}else { 
			System.out.println("Uebergewicht");}
	
	
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	sc.close();	
	
}
}

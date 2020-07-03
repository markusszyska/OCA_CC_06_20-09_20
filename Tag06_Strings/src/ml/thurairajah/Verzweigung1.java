package ml.thurairajah;

import java.util.Scanner;

public class Verzweigung1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int bmi;
		String AllesGut = "BMI liegt im gesunden Rahmen.";
		String NichtGut = "Beachten: Ihr BMI liegt nicht im gesunden Rahmen.";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Bitte Ihr Gewicht eingeben: ");
		double gewicht = sc.nextDouble();
		
		System.out.print("Bitte Ihr Groesse in Meter eingeben: ");
		double groesse = sc.nextDouble();
		
		System.out.print("Bitte Ihr Alter eingeben: ");
		int alter = sc.nextInt();
		
		System.out.println("Gewicht: " +gewicht);
		System.out.println("Groesse: " +groesse);
		System.out.println("Alter: " +alter);
		
		//Berechnung BMI:
		bmi= (int)(gewicht/(groesse * groesse)+0.5); //bei cm: ((groesse * groesse)/10000)
		System.out.println("Ihr BMI: " + bmi);
		
		//Alter 19 - 24
		if ((alter >=19 && alter  <=24) && (bmi >=19 && bmi <=24)) {
			System.out.println(AllesGut);
		//1. Versuch:
		//}else if (((alter >=19 && alter  <=24) && (bmi <=19 || bmi >=24))) { 
		}else if (bmi <=19 || bmi >=24) { //2.Versuch:
			System.out.println(NichtGut);
		}
		
		//Alter 25 - 34
		if ((alter >=25 && alter  <=34) && (bmi >=20 && bmi <=25)) {
			System.out.println(AllesGut);
		}else if (((alter >=25 && alter  <=34) && (bmi <=20 || bmi >=25))) { //1.Versuch ...
			System.out.println(NichtGut);
		}
		
		//Alter 35 - 44
		if ((alter >=35 && alter  <=44) && (bmi >=21 && bmi <=26)) {
			System.out.println(AllesGut);
		}else if (((alter >=35 && alter  <=44) && (bmi <=21 || bmi >=26))) {
			System.out.println(NichtGut);
			}
		
		//Alter 45 - 54
		if ((alter >=45 && alter  <=54) && (bmi >=22 && bmi <=27)) {
			System.out.println(AllesGut);
		}else if (((alter >=45 && alter  <=54) && (bmi <=22 || bmi >=27))) {
			System.out.println(NichtGut);
		}
		
		//Alter 55 - 64
		if ((alter >=55 && alter  <=64) && (bmi >=23 && bmi <=28)) {
			System.out.println(AllesGut);
		}else if (((alter >=55 && alter  <=64) && (bmi <=23 || bmi >=28))) {
			System.out.println(NichtGut);
		}
		
		//Alter ab 64
		if ((alter >64) && (bmi >=24 && bmi <=29)) {
			System.out.println(AllesGut);
		}else if (((alter  >64) && (bmi <=24 || bmi >=29))){
			System.out.println(NichtGut);
		}
	}

}

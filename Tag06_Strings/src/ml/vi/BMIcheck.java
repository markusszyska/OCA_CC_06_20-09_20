package ml.vi;

import java.util.Scanner;

public class BMIcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Kommabeträge mit , und nicht mit . eingeben");
		System.out.print("Gewicht in kg eingeben: ");
		double gewicht = sc.nextDouble();
		System.out.print("Größe in m eingeben: ");
		double groesse = sc.nextDouble();
		
		double bmi = gewicht / (groesse * groesse);
		
		System.out.print("Alter in ganzen Jahren eingeben: ");
		int alter = sc.nextInt();
				
		while( alter < 19 ) {
			System.out.println("Gültige Altersangaben nur über 18");
			System.out.print("Alter in ganzen Jahren eingeben: ");
			alter = sc.nextInt();
		}

		if ( alter < 25) {
			if ( bmi >= 19 && bmi <= 24 )
				System.out.println("BMI Okay");
			else 
				System.out.println("BMI nicht Okay");			
		}
		else if ( alter < 35) {
			if ( bmi >= 20 && bmi <= 25 )
				System.out.println("BMI Okay");
			else 
				System.out.println("BMI nicht Okay");			
		}
		else if ( alter < 45) {
			if ( bmi >= 21 && bmi <= 26 )
				System.out.println("BMI Okay");
			else 
				System.out.println("BMI nicht Okay");			
		}
		else if ( alter < 55) {
			if ( bmi >= 22 && bmi <= 27 )
				System.out.println("BMI Okay");
			else 
				System.out.println("BMI nicht Okay");			
		}
		else if ( alter < 65) {
			if ( bmi >= 23 && bmi <= 28 )
				System.out.println("BMI Okay");
			else 
				System.out.println("BMI nicht Okay");			
		}
		else {
			if ( bmi >= 24 && bmi <= 29 )
				System.out.println("BMI Okay");
			else 
				System.out.println("BMI nicht Okay");		
		}
		
		System.out.println();
		System.out.println("Alternativ mit einer for-Schleife: ");

		int i;
		for( i = 0; alter > 24; i++) {	
			alter -= 10;		
			if( i == 5 ) alter = 0;
		}

		if( bmi >= (19 + i) && bmi <= (24 + i))
			System.out.println("BMI Okay");
		else 
			System.out.println("BMI nicht Okay");		
		
		sc.close();
		
	}

}

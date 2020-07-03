package ml.neumann;
import java.util.Scanner;

public class Aufgabe_BMI {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Bitte geben Sie Ihr Gewicht in kg ein");
	double gewicht = sc.nextDouble();
	Scanner gr = new Scanner(System.in);
	System.out.println("Bitte geben Sie Ihre Größe in Meter ein");
	double groesse = gr.nextDouble();
	Scanner age = new Scanner(System.in);
	System.out.println("Bitte geben Sie Ihr Alter in Jahren ein");
	double alter = age.nextDouble();

	//System.out.println("Sie haben: " + gewicht + groesse + alter + " eingegeben");
// weiter Variable
	
	double bmi;
	bmi = gewicht/(groesse*groesse);
	System.out.println("Ihr BMI ist: " + bmi);
	
	//Bewertung des BMI 
	if (alter < 19 ) {
		System.out.println("Die Berechnung ist erst ab 19 Jahren gültig");
		
	}
	else if (((alter >= 19) && (alter <= 24)) && ((bmi >= 19)&&(bmi <= 24))) {
		System.out.println("Dein BMI ist: " + bmi + " Super Wert");}
	
	else if (((alter >= 25) && (alter <= 34)) && ((bmi >= 20) && (bmi <=25))){
		System.out.println("Dein BMI ist: " + bmi + " Super Wert");}
	else if (((alter >= 35) && (alter <= 44)) && ((bmi >= 21) && (bmi<= 26))){
		System.out.println("Dein BMI ist: " + bmi + " Super Wert");}
	else if (((alter >= 45) && (alter <= 54 )) && ((bmi >= 22) && (bmi <= 27))){
			System.out.println("Dein BMI ist: " + bmi + " Super Wert");}
	else if ((( alter >= 55) && (alter <= 64)) && ((bmi >= 23) && (bmi <= 28))){
				System.out.println("Dein BMI ist: " + bmi + " Super Wert");}
	else if ((alter > 640) && ((bmi >= 24) && (bmi <= 29))) {
			System.out.println("Dein BMI ist: " + bmi + " Alles in Ordnung ");}
				else
				{System.out.println("Dein BMI ist: " + bmi + " Pass ein bisschen auf dein Gewicht auf ");}
				
	

	
	
			
			
		}
	
	
}


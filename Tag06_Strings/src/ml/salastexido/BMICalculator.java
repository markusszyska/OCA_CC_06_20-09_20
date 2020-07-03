package ml.salastexido;

import java.util.Scanner;

public class BMICalculator {

	
	public static int calulateBMI(double weight, double height) {
		return (int)(weight/(height*height));
	}
	
	public static String checkBMI(int bmi,int age) {
		String result = "";
		
		if(age>=19 && age <=24) {
			if(bmi >= 19 && bmi <=24 ) {
				result = "Your health is correct...";
			}else {
				result = "You must more eat... ";
			}
		}
		else if(age>=25 && age <=34) {
			//check bmi value
			if(bmi >= 20 && bmi <=25 ) {
				result = "Your health is correct...";
			}else {
				result = "You must more eat... ";
			}
		}
		else if(age>=35 && age <=44) {
			//check bmi value
			if(bmi >= 21 && bmi <=26 ) {
				result = "Your health is correct...";
			}else {
				result = "You must more eat... ";
			}
		}
		else if(age>=45 && age <=54) {
			//check bmi value
			if(bmi >= 22 && bmi <=27 ) {
				result = "Your health is correct...";
			}else {
				result = "You must more eat...";
			}
		}
		else if(age>=55 && age <=64) {
			//check bmi value
			if(bmi >= 23 && bmi <=28 ){
				result = "Your health is correct..";
			}else {
				result = "You must more eat ";
			}
		}
		if(age>64) {
			//check bmi value
			if(bmi >= 24 && bmi <=29 ) {
				result = "Your health is correct..";
			}else {
				result = "You must more eat ";
			}
		}
		return result;
		
	}
	
	
	public static void main(String[] args) {
		int age; //Alter(in Jahren)
		double height; //Körpergroße in Metern
		double weight; //Körpergewicht in Kg
		Scanner scanner = new Scanner(System.in);
		System.out.println("Age in Years: ");
		age = scanner.nextInt();
		System.out.println("Height in Meters: ");
		height = scanner.nextDouble();
		System.out.println("Weight in Kilograms: ");
		weight = scanner.nextDouble();
		System.out.println(checkBMI(calulateBMI(weight, height), age));
	}

}

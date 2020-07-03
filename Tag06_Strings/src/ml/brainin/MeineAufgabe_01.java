package ml.brainin;

import java.util.*;
import java.util.Scanner;

class Pair{
	int first = 0, second = 0;
	Pair(int first_, int second_){
		first = first_;
		second = second_;
	}
	public boolean isAllRight(int bmi) {
		if (bmi < first || bmi > second) {
			return false;
		}else {
			return true;
		}
		
	}
}

public class MeineAufgabe_01 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weight = 0, growth = 0, age = 0; 
		boolean result = true;
		List<Pair> bmis = Arrays.asList(new Pair(19,24),
				new Pair(20,25),new Pair(21,26),new Pair(22,27),new Pair(23,28),new Pair(24,29));
		
		System.out.println("Ihr Gewicht (kg) ");
		weight = sc.nextInt();
		if (weight == 0) {
			sc.close();
			return;
		}
		System.out.println("Ihre Größe (m)");
		growth = sc.nextInt();
		if (growth == 0) {
			sc.close();
			return;
		}
		System.out.print("Ihr Alter (j)");
		age = sc.nextInt();
		if (age == 0) {
			sc.close();
			return;
		}
		System.out.println();
		int bmi = (weight/ (growth*growth));
		System.out.println("Ihr BMI beträgt"+ bmi);
		if (age >= 19 && age <=24) {
			result = bmis.get(0).isAllRight(bmi);
		}else if (age >=25 && age <=34) {
			result = bmis.get(1).isAllRight(bmi);
		}else if (age >=35 && age <=44) {
			result = bmis.get(2).isAllRight(bmi);
		}else if (age >=45 && age <=54) {
			result = bmis.get(3).isAllRight(bmi);
		}else if (age >=65 && age <=64) {
			result = bmis.get(4).isAllRight(bmi);
		}else if (age > 65) {
			result = bmis.get(5).isAllRight(bmi);
		
		}
		
		if (result) {
			System.out.println("Sie sind in guter Verfassung! Gut gemacht!");
		}else {
			System.out.println("Sie sollten mehr auf sich selbst achten");
		}
		sc.close();
	}
}


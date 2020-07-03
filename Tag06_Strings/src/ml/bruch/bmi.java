package ml.bruch;

import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Körpergewicht in kg eingeben");

		float koerpergewicht = sc.nextInt();
		
		System.out.println(koerpergewicht);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Bitte Körpergröße in cm eingeben");

		float  koerpergroesse = sc1.nextInt();
		
		System.out.println(koerpergroesse);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Bitte Alter (in Jahren) eingeben");

		float alter = sc2.nextInt();
		
		System.out.println(alter);
		
		float koerpergroesse1 = koerpergroesse * koerpergroesse;
		
		float bmi = 8/3;
				//(koerpergewicht / koerpergroesse1)*1000;
		
		System.out.println(bmi);
		

	}

}

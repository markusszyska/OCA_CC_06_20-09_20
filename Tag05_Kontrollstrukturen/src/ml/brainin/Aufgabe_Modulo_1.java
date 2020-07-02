package ml.brainin;

import java.util.*;
public class Aufgabe_Modulo_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl angeben");
		int zahl = sc.nextInt();
		int modulo = zahl % 100;
		System.out.println("Eingabe : "+zahl);
		System.out.println("Das macht "+((zahl-modulo)/ 100)+" Euro und "+modulo+" Cent");
		sc.close();
	}

}

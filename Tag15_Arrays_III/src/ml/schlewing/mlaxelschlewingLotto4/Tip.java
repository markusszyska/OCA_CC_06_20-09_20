package ml.schlewing.mlaxelschlewingLotto4;

import java.util.Scanner;

/* Hier erfolgt die Eingabe des Lotto-Tips des Spielers  */
public class Tip {

	static int[] tippen() {
		
		Scanner eingabe1 = new Scanner(System.in);
    		
		
    	int[] tip;
		tip = new int[6];
			
		System.out.println("Bitte geben Sie nacheinander Ihren Zahlen zwischen 1 bis 49 ein:");
		for (int index = 0; index < 6; index++) {
			
				tip[index] = eingabe1.nextInt();
			
			}
		
		return tip;
	}
}

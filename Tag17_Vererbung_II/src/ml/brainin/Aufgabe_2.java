package ml.brainin;

import java.util.Scanner;

/*
Erfragen Sie vom Nutzer eine Eingabe wie viele Ziehungen durchgefuehrt werden sollen.
Die Ziehungen sollen dann in einem entsprechend grossen Array gespeichert werden und 
ausgegeben werden:
"Die Zahlen fuer Ziehung 1 sind : 1 2 3 4 5 6 ".

 */
public class Aufgabe_2 {
	public static void main(String[] args) {
		System.out.println("Wie viele Ziehungen durchgefuehrt werden sollen ? ");
		Scanner sc = new Scanner(System.in);
		int zyclen = 0; 
		try {
			zyclen = sc.nextInt();
		}catch(java.util.InputMismatchException im) {
		}
		if (zyclen > 0) {
			int[][] jZahlen = new int[zyclen][6];
			for (int i = 0; i <jZahlen.length; i++) {
				int[] zahlen = new int[jZahlen[i].length]; 
				int count = 0;
				while(count < zahlen.length) {
					int zahl = getZahl(zahlen);
					if (zahl != -1) {
						zahlen[count] = zahl;
						count++;
					}
				}
				jZahlen[i] = zahlen;
			}
			for (int i = 0; i <jZahlen.length; i++) {
				int[] zahlen = jZahlen.clone()[i];
				System.out.print("Die Zahlen fuer Woche : "+ (i+1) +" sind ");
				for  (int j = 0; j < zahlen.length ; j++) {
					System.out.print(zahlen[j]+" ");
				}
				System.out.println();

			}
		}
		System.out.println("Bye.");
		sc.close();
	}
	
	static int getZahl(int[] zahlen) {
		int zahl = (int)(Math.random() * 49 +1);
		for  (int i = 0; i < zahlen.length ; i++) {
			if (zahlen[i] == zahl) {
				return -1;
			}
		}
		return zahl;
	}
}

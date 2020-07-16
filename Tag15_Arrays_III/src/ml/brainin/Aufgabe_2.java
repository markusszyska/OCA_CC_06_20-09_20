package ml.brainin;

import java.util.Scanner;

/*
 * -----------------------------------Aufgabe 4----------------------------
Lassen Sie vom Nutzer einen Lottotip abgeben, er soll 6 Zahlen eingeben.
Fuehren Sie solange Ziehungen durch, bis die Zahlen vom Nutzer gezogen wurden und 
lassen Sie die Anzahl der Versuche ausgeben.
Sortieren Sie das Array einer Ziehung zur Pruefung mit einem BubbleSort
 */
public class Aufgabe_2 {
	static int[] zahlen = new int[6];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count < zahlen.length) {
			System.out.printf("Geben Sie die Nummer %s ein", (count+1));
			System.out.println();
			int zahl = sc.nextInt();
			if (zahl == 0) {
				break;
			}else if (zahl < 1 || zahl > 49) {
				System.out.println("Die eingegebenen Nummern müssen zwischen 1 und 49 liegen");
				continue;
			}else if (checkZahl(zahl)) {
				zahlen[count] = zahl;
				count++;
			}else {
				System.out.printf("Die eingegebene Nummer %s befindet sich bereits im Array \n", zahl);
				System.out.println();
			}
		}
        sc.close();
        if (count < zahlen.length) {
    		System.out.println("Bye.");
			return;
        }
		System.out.println("Die eingegebene Nummern : ");
		for  (int i = 0; i < zahlen.length ; i++) {
			System.out.print(zahlen[i]+" ");
		}
		System.out.println();
		/****** BubbleSort*****/
        for (int i = 0; i < zahlen.length-1; i++) {
            for (int j = 0; j < zahlen.length-i-1; j++) {
                if (zahlen[j] > zahlen[j+1]) { 
                    int temp = zahlen[j]; 
                    zahlen[j] = zahlen[j+1]; 
                    zahlen[j+1] = temp; 
                } 
            }
        }
		System.out.println("Die sortierte Eingabenummern : ");
		for  (int i = 0; i < zahlen.length ; i++) {
			System.out.print(zahlen[i]+" ");
		}
	}
	
	static boolean checkZahl(int zahl) {
		for  (int i = 0; i < zahlen.length ; i++) {
			if (zahlen[i] == zahl) {
				return false;
			}
		}
		return true;
	}

}

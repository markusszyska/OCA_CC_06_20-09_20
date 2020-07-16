package ml.assmann;

import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) {
		
		// Aufgabe 1
		int[] ziehung = generateZiehung();
		System.out.println("Aufgabe 1: Ziehung generieren\n");
		for(int number : ziehung) System.out.print(number + " ");
		System.out.println("\n===========\n");
		
		// Aufgabe 4
		System.out.println("Aufgabe 4:\n\n");
		int[] tip = getPlayerTip();
		int[] generatedZiehung = new int[6];
		boolean matchFound = false;
		int counter = 0;
		System.out.println("\nZiehungen werden generiert, ich bitte um Geduld.\n");
		while(!matchFound) {
			generatedZiehung = generateZiehung();
			matchFound = checkForMatch(generatedZiehung, tip);
			counter++;
		}
		System.out.println("Volltreffer nach " + counter + " Ziehungen");
		System.out.print("\nDein Tip: ");
		for(int zahl : tip) System.out.print(zahl + " ");
		System.out.print("\nDie Ziehung: ");
		for(int zahl : generatedZiehung) System.out.print(zahl + " ");
		
	}
	
	// Erzeugt 6 unterschiedliche Zufallszahlen zwischen 1 und 49 und gibt sie in einem int[] zurueck.
	public static int[] generateZiehung() {
		int[] ziehung = new int[6];
		for(int i = 0;i<ziehung.length;i++) {
			int lottoNumber;
			do { 
				lottoNumber = (int)(Math.random() * 49 + 1);				
			} while(arrayContainsNumber(ziehung, lottoNumber)); // weitermachen solange die Zahl schon vorhanden ist
			ziehung[i] = lottoNumber;			
		}
		return ziehung;
	}
	
	// Ueberprueft ob die uebergebene Zahl schon im uebergebenen Array vorhanden ist. Falls ja gibt true zurueck.
	public static boolean arrayContainsNumber(int[] array, int number) {
		boolean hasNumber = false;
		for(int arrayNumber : array) {
			hasNumber = hasNumber || (arrayNumber == number);
			if(hasNumber) break;
		}
		return hasNumber;
	}
	
	/*
	 * Fragt 6 Zahlen zwischen 1 und 49 per Konsole ab. Nimmt keine doppelten Zahlen. Speicher
	 * diese in einem int[] und gibt es zurueck.
	 */
	public static int[] getPlayerTip() {
		Scanner sc = new Scanner(System.in);
		boolean continueLoop = true;
		int[] lottoTip = new int[6];
		int counter = 0;
		
		System.out.println("Gib deinen Lotto-Tip ab. 6 Zahlen zwischen 1 und 49.");
		do {
			System.out.println("\n" + (counter + 1) + ". Zahl:");
			int eingabe = sc.nextInt();
			
			// Ueberprueft ob die Zahl korrekt ist
			if(arrayContainsNumber(lottoTip, eingabe) || eingabe < 1 || eingabe > 49) {
				System.out.println("Zahl muss zwischen 1 und 49 sein und keine doppelten Zahlen");
				continue; 
			}
			
			lottoTip[counter++] = eingabe;
			if (counter > 5) continueLoop = false;
		} while (continueLoop);	
		
		return lottoTip;
	}
	
	/*
	 * Ueberprueft ob zwei int[] den gleichen Inhalt haben. Sortiert zunaechst beide
	 * und ueberprueft dann.
	 */
	public static boolean checkForMatch(int[] ziehung, int[] tip) {
		// Sortieren
		int[] sortedZiehung = bubbleSort(ziehung);
		int[] sortedTip = bubbleSort(tip);
		
		// Pruefen
		for(int i=0; i<sortedZiehung.length;i++) {
			if(sortedZiehung[i] != sortedTip[i]) return false;
		}
		return true;
	}
	
	/*
	 * Sortiert einen uebergebenes Array. Macht zuvor eine hard copy um das original
	 * zu erhalten.
	 */
	public static int[] bubbleSort(int[] array) {
		
		// hard copy
		int[] sortedArray = new int[array.length];
		for(int i = 0; i<array.length;i++) sortedArray[i] = array[i];
		
		/* 
		 * BubbleSort - sortiert die hoechste Zahl nach ganz oben, beginnt
		 * dann erneut und ignoriert die letzte Stelle im aktuelle
		 * betrachteten Bereich
		 */
		for(int i = sortedArray.length;i>1;i--) {
			for(int j = 0;j<i-1;j++) {
				if(sortedArray[j] > sortedArray[j+1]) {
					int tmp = sortedArray[j];
					sortedArray[j] = sortedArray[j+1];
					sortedArray[j+1] = tmp;
				}
			}
		}
		return sortedArray;
	}
	
}

package ml.Liebermann;

import java.util.Scanner;

public class Lotto {
	public static long counter = 0L;

	public static void main(String[] args) {
		int[] userEingabe = new int[0];
		int[] pull = ziehung();
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie 6 Zahlen mit , getrennt ein");
		userEingabe = formatIntArr(sc.nextLine().trim().split(","));
		
		//userEingabe = add(userEingabe, sc.nextInt());
		sc.close();
		// arrAusgeben(userEingabe);

		bubbleSort(pull);
		bubbleSort(userEingabe);

		//arrAusgeben(pull);
		arrAusgeben(userEingabe);

		while(!gewinne(pull, userEingabe)) {
			pull = ziehung();
		}
		System.out.println("GEWONNEN NACH " + counter);
		arrAusgeben(pull);
		arrAusgeben(userEingabe);
		
	}

	public static boolean gewinne(int[] ziehung, int[] tip) {
		boolean win = true;
		counter++;
		for (int i = 0; i < tip.length; i++) {
			if (ziehung[i] == tip[i]) {
				win = true;
			}else {
				win = false;
				break;
			}
		}
		if(counter % 50000 == 0) {
			System.out.println(counter);
		}
		//System.out.println(win);
		return win;

	}

	public static int[] ziehung() {
		int[] ziehung = new int[6];
		int zahl = 0;
		for (int i = 0; i < ziehung.length;) {
			zahl = generateRnd();
			// System.out.println(zahl);
			if (!arrContains(ziehung, zahl)) {
				ziehung[i] = zahl;
				i++;

			}
		}

		return ziehung;
	}

	public static int generateRnd() {
		return (int) (Math.random() * 49 + 1);
	}

	public static void bubbleSort(int[] array) {
		boolean swapped = false;
		// [5][3][2];
		do {
			swapped = false;
			for (int i = 1; i < array.length; i++) {
				if (array[i - 1] > array[i]) {
					int temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
		} while (swapped);
	}

	public static boolean arrContains(int[] ziehung, int zahl) {
		boolean contains = false;

		for (int x : ziehung) {
			if (x == zahl) {
				contains = true;
			}
		}
		// System.out.println(contains);
		return contains;
	}

	public static int[] add(int[] arr, int add) {
		int[] newArr = new int[arr.length + 1]; // Neues Array mit laenge + 1
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i]; // 1-1 Kopie vom alten Array
		}
		newArr[arr.length] = add; // an letzter stelle die zahl add einfuegen.

		return newArr;
	}

	public static void arrAusgeben(int[] arr) {
		System.out.println("-------------");
		for (int p1 : arr) {
			System.out.print(p1+ " ");
		}
		System.out.println("-------------");
	}
	public static int[] formatIntArr(String[] old) {
		int[] newInt = new int[old.length];
		for(int i=0; i<old.length; i++) {
	         newInt[i] = Integer.parseInt(old[i]);
	      }
		return newInt;
	}

}

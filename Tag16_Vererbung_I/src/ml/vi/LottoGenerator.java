package ml.vi;

import java.util.Scanner;

public class LottoGenerator {

	public static void generateLotto(int[] array) {

		int temp;

		for (int i = 0; i < array.length; i++) {

			do {
				temp = (int) (Math.random() * 49 + 1);
			} while (!elemUnique(array, temp));

			array[i] = temp;
		}

	}

	public static void inputLotto(int[] array) {

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			int temp;
			do {
				System.out.print("Eingabe für die " + (i + 1) + ". Nummer: ");
				temp = sc.nextInt();
			} while (temp > 49 || temp < 1 || !elemUnique(array, temp));

			array[i] = temp;

		}

		sc.close();
	}

	public static boolean lottoWin(int[] array1, int[] array2) {

		for (int i : array1) {

			if (elemUnique(array2, i)) {
				return false;
			}
		}

		return true;
	}

	public static boolean elemUnique(int[] array, int elem) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] == elem) {
				return false;
			}
		}

		return true;

	}

	public static void printArray(int[] array) {

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	public static void bubbleSort(int[] array) {

		// pseudo-code from https://de.wikipedia.org/wiki/Bubblesort

		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 0; i < n - 1; ++i) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
				}
			}
			n = n - 1;
		} while (swapped);
	}

	public static void main(String[] args) {

		//aufg 1 & 4
		// int[] userNumbers = new int[6];
		//
		// inputLotto(userNumbers);
		// printArray(userNumbers);
		//
		// int[] lottoNumbers = new int[6];
		//
		// int gen_counter = 0;
		//
		// System.out.println("Ziehung bis Gewinn...");
		// do {
		// generateLotto(lottoNumbers);
		// gen_counter++;
		// } while (!lottoWin(userNumbers, lottoNumbers));
		//
		// System.out.println("Anzahl der Versuche: " + gen_counter);
		// System.out.print("User Eingabe: ");
		// printArray(userNumbers);
		// System.out.print("Lottoziehung: ");
		// printArray(lottoNumbers);
		// bubbleSort(lottoNumbers);
		// System.out.print("Bubblesort Lottoziehung: ");
		// printArray(lottoNumbers);

		// aufg 2
		int[][] lottowoche = new int[52][6];

		for (int i = 0; i < lottowoche.length; i++) {
			generateLotto(lottowoche[i]);
			System.out.print("Die Zahlen fuer Woche " + (i + 1) + " sind : ");
			bubbleSort(lottowoche[i]);
			printArray(lottowoche[i]);
		}
		
		//aufg3
		int[][] dLotto;
		System.out.print("\nGebe Anzahl der Ziehungen ein: ");
		Scanner sc = new Scanner(System.in);
		int size = 0;
		do {
			size = sc.nextInt();
		} while (size < 1);
		
		dLotto = new int[size][6];
		
		for (int i = 0; i < dLotto.length; i++) {
			generateLotto(dLotto[i]);
			System.out.print("Die Zahlen fuer Ziehung " + (i + 1) + " sind : ");
			bubbleSort(dLotto[i]);
			printArray(dLotto[i]);
		}
		
		sc.close();
		
	}

}
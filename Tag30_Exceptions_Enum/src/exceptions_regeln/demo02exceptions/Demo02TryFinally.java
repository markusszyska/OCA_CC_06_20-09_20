package exceptions_regeln.demo02exceptions;

import java.util.Scanner;

public class Demo02TryFinally {

	public static void main(String[] args) {
		// Minimum
		/*
		 * Ein try tritt niemals eigenstaendig auf.
		 * 
		 * Als Block immer mit catch oder finally
		 */
		try {

		} finally {

		}

		int[] zahlen = { 1, 2, 3 };
		int summe = 0;

		Scanner sc = new Scanner(System.in);

		try {
			summe += zahlen[5];
		} finally {
			/*
			 * finally wird zum aufraeumen benutzt
			 */
			sc.close();
			System.out.println("Scanner geschlossen");
		}

		System.out.println("Programm beendet");

	}

}

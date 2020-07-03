package ml.brainin;

import java.util.*;
import java.util.Scanner;

public class MeineAufgabe_02_1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Antworten sie mit Ja (j oder J) oder Nein (n oder N): ");
		char chr = sc.next().charAt(0);
		if (chr == 'j' || chr == 'J') {
			System.out.println("Sie haben mit ja geantwortet");
		}else if (chr == 'n' || chr == 'N') {
			System.out.println("Sie haben mit nein geantwortet");
		}else {
			System.out.println("Sie haben eine falsche Eingabe gemacht");
		}
		sc.close();
	}
}


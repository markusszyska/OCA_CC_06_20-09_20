package ml.brainin;

import java.util.*;
import java.util.Scanner;

public class MeineAufgabe_02_2 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		float price = 0;
		System.out.println("Bitte geben die Stückzahl");
		count = sc.nextInt();
		System.out.println("Bitte geben der Einzelpreis einer Ware");
		price = (float)sc.nextInt();
		if (count > 50) {
			price *= 0.9f;
		}else if (count > 10) {
			price *= 0.95f;
		}
		float summ = count*price;
		System.out.print("Die Summa ist : "+summ);
		sc.close();
	}
}


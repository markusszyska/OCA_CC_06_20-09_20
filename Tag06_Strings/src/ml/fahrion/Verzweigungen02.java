package ml.fahrion;

import java.util.Scanner;

public class Verzweigungen02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x;
		float y;
		float preis;

		System.out.println("Preis pro St�ck: ");
		x = sc.nextFloat();

		System.out.println("St�ckzahl:");
		y = sc.nextFloat();

		if (y >= 50) {
			System.out.println("-Rabatt 10%" + " Preis: " + x * y * 0.9 + "Euro");
		}
		else if (y >= 10) {
			System.out.println("-Rabatt 5%" + " Preis: " + x * y * 0.95 + "Euro");
		} else
			System.out.println("Preis:" + x * y + "Euro");

	}

}

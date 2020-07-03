package ml.kukulin;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ausentemperatur Wert ");
		int at = sc.nextInt();
		System.out.println("True/False:");
		String n = sc.next();

		boolean pr = Boolean.parseBoolean(n);

		if (at >= 0) {
			if (pr == true) {
				System.out.println("Sauwetter");
			}

			else if (at > 0 && at <= 19) {
				if (pr == false)
					System.out.println("Gehen wir spazieren");
			} else if (at >= 20) {
				if (pr == false)
					System.out.println("Gehen wir schwimmen?");
			}
		} else if (at < 0) {
			if (pr == true)
				System.out.println("Komm, geh'n wir Schlittenfahren");
		} else if (pr == false)
			System.out.println("Komm, geh'n wir Schlittenfahren");
		sc.close();

	}
}
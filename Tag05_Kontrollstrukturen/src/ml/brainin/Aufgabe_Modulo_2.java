package ml.brainin;

import java.util.*;
public class Aufgabe_Modulo_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Bitte Zahl angeben");
			int zahl = sc.nextInt();
			if (zahl == 0) break;
			int secunden = zahl % 60;
			int minuten = (zahl%3600) /60;
			int d = 24*3600;
			int tage = (zahl/d);
			int stunden = (zahl % d)/3600;
			System.out.println(zahl+" Secunden sind "+tage+" Tag(e), "+stunden+" Stunde(n), "+minuten+" Minute(n), "+secunden+" Secunden(n)");
		}
		sc.close();
	}

}

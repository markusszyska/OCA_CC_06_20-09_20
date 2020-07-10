package ml.axelschlewing_buch;
import java.util.Scanner;

public class buchverwaltung {
	
		public static void main(String[] args) {
			
		/* Konstruktor-Aufruf */
		buch b1 = new buch("Im Schatten des Windes","Carlos Ruiz Zafon"," Verlag",400);
		buch b2 = new buch("Die kleine Hexe","Otfried Preussler","Thienemanns Verlag Stuttgart",128);
		buch b3 = new buch("Es begann in einer Mittsommernacht","Olav Gullvaag","F.U. Herbig Verlagsbuchhandlung Berlin",436);
			
		/* Ausgabe des Buchbestands */
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}

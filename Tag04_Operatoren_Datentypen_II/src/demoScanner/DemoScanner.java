package demoScanner;

import java.util.Scanner;

public class DemoScanner {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int zahl = sc.nextInt();
		System.out.println("Sie haben: " + zahl + " eingeben");
		
	}
}

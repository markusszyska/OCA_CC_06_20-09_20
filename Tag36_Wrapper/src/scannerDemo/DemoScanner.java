package scannerDemo;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben");
		int i = sc.nextInt();
		
		System.out.println("Bitte Text eingeben");
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		System.out.println("s: " + s);
		System.out.println("s1: " + s1);
		System.out.println("Programm beendet");
	}
	
	
}

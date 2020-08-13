package demo_String_StringBuilder;

import java.util.Scanner;

public class DemoStringVsStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.gc();
		
		System.out.println("String laeuft");
		memTestString(5000);
		System.out.println("String beendet");
		
		System.gc();
		
		System.out.println("Enter fuer StringBuilder");
		sc.nextLine();
		System.out.println("StringBuilder Laeuft");	
		memTestStringBuilder(100_000);
		System.out.println("StringBuilder Beendet");
		
		System.gc();
		System.out.println("Enter fuer StringBuffer");
		sc.nextLine();
		System.out.println("StringBuffer Laeuft");	
		memTestStringBuilder(100_000);
		System.out.println("StringBuffer Beendet");
	}
	
	public static void memTestString(int anzahl) {
		String alpha = "";
		long timeBefore = System.currentTimeMillis();
		for (int i = 0; i <= anzahl; i++) {
			alpha += i;
		}
		long timeAfter = System.currentTimeMillis();
		System.out.println(anzahl + " Iterationen\n Ausführung in ms :" + (timeAfter - timeBefore));
		System.out.println("String.length()  " + alpha.length());
	}

	public static void memTestStringBuilder(int anzahl) {
		StringBuilder alpha = new StringBuilder();
		long timeBefore = System.currentTimeMillis();
		for (Integer i = 0; i <= anzahl; i++) {
			alpha.append(i.toString());
		}
		long timeAfter = System.currentTimeMillis();
		System.out.println(anzahl + " Iterationen\n Ausführung in ms :" + (timeAfter - timeBefore));
		System.out.println("StringBuilder.length()  " + alpha.length());

	}

	public static void memTestStringBuffer(int anzahl) {
		StringBuffer alpha = new StringBuffer();
		long timeBefore = System.currentTimeMillis();
		for (Integer i = 0; i <= anzahl; i++) {
			alpha.append(i.toString());
		}
		long timeAfter = System.currentTimeMillis();
		System.out.println(anzahl + " Iterationen\n Ausführung in ms :" + (timeAfter - timeBefore));
		System.out.println("StringBuffer.length()  " + alpha.length());

	}
}

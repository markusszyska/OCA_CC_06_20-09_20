package ml.brainin;

import java.util.Scanner;

public class String_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihren Vornamen ein : ");
		String vorname = sc.next();
		System.out.println("Bitte geben Sie Ihren Nachnamen ein : ");
		String nachname = sc.next();
		sc.close();
		String name = vorname+" "+ nachname;
		System.out.println("Ihr Name ist : "+name);
		System.out.println("Ihre Initialen sind : "+vorname.charAt(0)+" "+nachname.charAt(0));
	}
}

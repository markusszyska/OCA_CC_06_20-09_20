package ml.thurairajah;
import java.util.Scanner;

public class Strings_Aufg1_Name {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Vorname: ");
		String vorname = sc.nextLine();
		System.out.print("Nachname: ");
		String nachname = sc.nextLine();
		System.out.print("Voller Name: ");
		String name = vorname +" "+ nachname;
		String kuerzel;
		
		System.out.println(name);
		System.out.println("Laenge Vorname: "+vorname.length()+"\nLaenge Nachname: "+nachname.length());
		System.out.println("Kuerzel: " + vorname.charAt(0)+nachname.charAt(0));

	}

}

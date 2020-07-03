package ml.thurairajah;
import java.util.Scanner;

public class Verzweigung2Aufgabe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Antworten sie mit Ja (j oder J) oder Nein (n oder N): ");
		
		String key = sc.nextLine();
		 
		
		if (key.equals("n") || key.equals("N")) {
			System.out.println("Sie haben mit nein geantwortet");
		}else if (key.equals("j") || key.equals("J")) {
			System.out.println("Sie haben mit ja geantwortet.");
		}else {
			System.out.println("Sie haben eine falsche Eingabe gemacht.");
		}
		 
	}

}
